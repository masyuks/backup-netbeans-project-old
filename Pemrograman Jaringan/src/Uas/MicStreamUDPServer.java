/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;

/**
 *
 * @author ACER
 */
public class MicStreamUDPServer {
    public static void main(String[] args) throws LineUnavailableException {
        AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, true);
        TargetDataLine microphone;
        SourceDataLine speakers;
        microphone = AudioSystem.getTargetDataLine(format);

        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        microphone = (TargetDataLine) AudioSystem.getLine(info);
        microphone.open(format);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int numBytesRead;
        int sz = 1024;
        byte[] data = new byte[microphone.getBufferSize() / 5];
        microphone.start();

        DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, format);
        speakers = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
        speakers.open(format);
        speakers.start();

        // Configure the ip and port
        String hostname = "192.168.7.133";
        int port = 5555;
        try {
            InetAddress address = InetAddress.getByName(hostname);
            DatagramSocket socket = new DatagramSocket();
            byte[] buffer = new byte[1024];
            for(;;) {                
                numBytesRead = microphone.read(data, 0, sz);
                out.write(data, 0, numBytesRead); 
                speakers.write(data, 0, numBytesRead);            
                DatagramPacket request = new DatagramPacket(data,numBytesRead, address, port);
                socket.send(request);
            }
        } catch (IOException ex) {
           System.out.println("Client error: " + ex.getMessage());
           ex.printStackTrace();
        }
    }
}
