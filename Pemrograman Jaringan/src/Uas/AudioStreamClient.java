/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author ACER
 */
public class AudioStreamClient {
    private static Socket socket;
    private static BufferedInputStream inputStream;

    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        try {
            socket = new Socket("127.0.0.1", 6666);
            if (socket.isConnected()) {
                inputStream = new BufferedInputStream(socket.getInputStream());
                Clip clip = AudioSystem.getClip();
                AudioInputStream ais = AudioSystem.getAudioInputStream(inputStream);
                clip.open(ais);
                clip.start();
                while (inputStream != null) {
                    if (clip.isActive()) {
                        System.out.println("********** Buffred *********" + inputStream.available());
                    }
                }
            }
        } catch (IOException | UnsupportedAudioFileException e) {
            System.err.println(e);
        }
    }
}
