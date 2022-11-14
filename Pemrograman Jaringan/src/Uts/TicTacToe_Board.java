/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class TicTacToe_Board extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form TicTacToe_Board
     */
    Socket client; 
    ServerSocket server; 
    BufferedReader br;
    BufferedWriter bw; 
    ArrayList location;
    Thread thread = new Thread(this);
    
    public TicTacToe_Board() {
        initComponents();
        this.setTitle("TicTacToe SY");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btn02 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn10 = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        btnConnect = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn02.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn00.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mistral", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe SY");

        btn10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Start");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Host", "User" }));
        cbType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTypeItemStateChanged(evt);
            }
        });

        btnConnect.setText("Create");
        btnConnect.setActionCommand("ON");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btn01.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConnect, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(cbType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        if (btn12.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn12.setText("O");
                try {
                    bw.write("12");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("12");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        if (btn20.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn20.setText("O");
                try {
                    bw.write("20");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("20");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:
        if (btn22.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn22.setText("O");
                try {
                    bw.write("22");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("22");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:
        if (btn21.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn21.setText("O");
                try {
                    bw.write("21");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("21");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        if (btn11.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn11.setText("O");
                try {
                    bw.write("11");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("11");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
        
        if (btn02.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn02.setText("O");
                try {
                    bw.write("02");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("02");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        if (btn10.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn10.setText("O");
                try {
                    bw.write("10");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("10");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        if(btnConnect.getText().equals("Connect")){
            client_connection();
            btnConnect.setText("Disconnect");
            thread.start();
        }
        else if(btnConnect.getText().equals("Create")) {
            server_connection();
            btnConnect.setText("Close");
            thread.start();
        }
        else if(btnConnect.getText().equals("Disconnect")){
            clientDisconnect();
            btnConnect.setText("Connect");
        }
        else if(btnConnect.getText().equals("Close")){
            serverDisconnect();
            btnConnect.setText("Create");
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        if (btn01.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn01.setText("O");
                try {
                    bw.write("01");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("01");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        if (btn00.getText().equalsIgnoreCase("")) {
            if (lblStatus.getText().equalsIgnoreCase("Giliran Anda")) {
                lblStatus.setText("Giliran Lawan Anda");
                btn00.setText("O");
                try {
                    bw.write("00");
                    bw.newLine();
                    bw.flush();
                    cekStatus();
                } catch (IOException e) {
                    Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
                }
                location.add("00");
            }
            else{
                JOptionPane.showMessageDialog(null, "Masih Giliran Lawan Anda!");
            }
        }
        
    }//GEN-LAST:event_btn00ActionPerformed

    private void cbTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTypeItemStateChanged
        // TODO add your handling code here:
        if(cbType.getSelectedItem().equals("Host")){
           btnConnect.setText("Create");
        }else {
            btnConnect.setText("Connect");
        }
    }//GEN-LAST:event_cbTypeItemStateChanged

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        try {
            bw.write("Reset");
            bw.newLine();
            bw.flush();
            btn00.setText("");
            btn01.setText("");
            btn02.setText("");
            btn10.setText("");
            btn11.setText("");
            btn12.setText("");
            btn20.setText("");
            btn21.setText("");
            btn22.setText("");
        } catch (IOException e) {
            Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
        }
        btn00.setEnabled(true);
        btn01.setEnabled(true);
        btn02.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn20.setEnabled(true);
        btn21.setEnabled(true);
        btn22.setEnabled(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void client_connection(){
        try {
            String ip   = JOptionPane.showInputDialog("Masukkan Alamat Ip :");
            client      = new Socket (ip, 1111);
            cbType.setEnabled(false);
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            location = new ArrayList();
            lblStatus.setText("Giliran Anda");
        } catch (UnknownHostException e) {
            System.err.println("Akses ke server gagal");
            System.exit(-1);
        } catch (IOException e){
            Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    private void server_connection (){
        try {
            try {
                try {
                    server =  new ServerSocket(1111);
                    lblStatus.setText("Waiting Player..");
                } catch (IOException e) {
                    System.err.println("Gagal Membuat Server!");
                    System.exit(-1);
                }
                client = server.accept();
                lblStatus.setText("Connected");
                location = new ArrayList();
            } catch (IOException e) {
                System.err.println("Akses ke server ditolak!");
                System.exit(-1);
            }
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            System.err.println("Tidak dapat membaca pesan!");
            System.exit(-1);
        }
    }
    
    private void clientDisconnect (){
        try {
            bw.write("dcClient");
            bw.newLine();
            bw.flush();
            client.close();
            bw.close();
            br.close();
            cbType.setEnabled(true);
            btnConnect.setText("Connect");
            lblStatus.setText("Disconnected");
            thread.stop();
            System.exit(0);
        } catch (IOException e) {
            Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void serverDisconnect (){
        try {
            bw.write("dcServer");
            bw.newLine();
            bw.flush();
            server.close();
            br.close();
            bw.close();
            btnConnect.setText("Create");
            lblStatus.setText("Disconnected");
            thread.stop();
            System.exit(0);
        } catch (IOException e) {
            Logger.getLogger(TicTacToe_Board.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void cekStatus(){
        if((btn00.getText().equals("O") && btn01.getText().equals("O") && btn02.getText().equals("O"))|| 
           (btn10.getText().equals("O") && btn11.getText().equals("O") && btn12.getText().equals("O"))||
           (btn20.getText().equals("O") && btn21.getText().equals("O") && btn22.getText().equals("O"))||
           (btn00.getText().equals("O") && btn10.getText().equals("O") && btn20.getText().equals("O"))||
           (btn01.getText().equals("O") && btn11.getText().equals("O") && btn21.getText().equals("O"))||
           (btn02.getText().equals("O") && btn12.getText().equals("O") && btn22.getText().equals("O"))||
           (btn00.getText().equals("O") && btn11.getText().equals("O") && btn22.getText().equals("O"))||
           (btn02.getText().equals("O") && btn11.getText().equals("O") && btn20.getText().equals("O"))){
            JOptionPane.showMessageDialog(null, "You Win :)");
            btn00.setEnabled(false);
            btn01.setEnabled(false);
            btn02.setEnabled(false);
            btn10.setEnabled(false);
            btn11.setEnabled(false);
            btn12.setEnabled(false);
            btn20.setEnabled(false);
            btn21.setEnabled(false);
            btn22.setEnabled(false);
        }
        else if((btn00.getText().equals("X") && btn01.getText().equals("X") && btn02.getText().equals("X"))|| 
           (btn10.getText().equals("X") && btn11.getText().equals("X") && btn12.getText().equals("X"))||
           (btn20.getText().equals("X") && btn21.getText().equals("X") && btn22.getText().equals("X"))||
           (btn00.getText().equals("X") && btn10.getText().equals("X") && btn20.getText().equals("X"))||
           (btn01.getText().equals("X") && btn11.getText().equals("X") && btn21.getText().equals("X"))||
           (btn02.getText().equals("X") && btn12.getText().equals("X") && btn22.getText().equals("X"))||
           (btn00.getText().equals("X") && btn11.getText().equals("X") && btn22.getText().equals("X"))||
           (btn02.getText().equals("X") && btn11.getText().equals("X") && btn20.getText().equals("X"))){
            JOptionPane.showMessageDialog(null, "You Lose :(");
            btn00.setEnabled(false);
            btn01.setEnabled(false);
            btn02.setEnabled(false);
            btn10.setEnabled(false);
            btn11.setEnabled(false);
            btn12.setEnabled(false);
            btn20.setEnabled(false);
            btn21.setEnabled(false);
            btn22.setEnabled(false);
        }
        else if(!btn00.getText().equals("") && !btn01.getText().equals("") && !btn02.getText().equals("")
             && !btn10.getText().equals("") && !btn11.getText().equals("") && !btn21.getText().equals("")
             && !btn20.getText().equals("") && !btn21.getText().equals("") && !btn22.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Game in Draw :|");
            btn00.setEnabled(false);
            btn01.setEnabled(false);
            btn02.setEnabled(false);
            btn10.setEnabled(false);
            btn11.setEnabled(false);
            btn12.setEnabled(false);
            btn20.setEnabled(false);
            btn21.setEnabled(false);
            btn22.setEnabled(false);
        }
    }
    
    private void cekData(){
        int dt = location.size()-1;
        String data = (String) location.get(dt);
        if (data.equalsIgnoreCase("00")) {
            btn00.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("01")) {
            btn01.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("02")) {
            btn02.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("10")) {
            btn10.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("11")) {
            btn11.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("12")) {
            btn12.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("20")) {
            btn20.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("21")) {
            btn21.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("22")) {
            btn22.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("22")) {
            btn22.setText("X");
            lblStatus.setText("Giliran Anda");
        }
        else if (data.equalsIgnoreCase("dcClient")) {
            JOptionPane.showMessageDialog(null, "User sedang disconnect!");
            System.exit(0);
        }
        else if (data.equalsIgnoreCase("dcServer")) {
            JOptionPane.showMessageDialog(null, "Host sedang disconnect!");
            System.exit(0);
        }
        else if (data.equalsIgnoreCase("Reset")) {
            JOptionPane.showMessageDialog(null, "Lawan Telah Melakukan Reset Data.");
            btn00.setText("");
            btn01.setText("");
            btn02.setText("");
            btn10.setText("");
            btn11.setText("");
            btn12.setText("");
            btn20.setText("");
            btn21.setText("");
            btn22.setText("");
            btn00.setEnabled(true);
            btn01.setEnabled(true);
            btn02.setEnabled(true);
            btn10.setEnabled(true);
            btn11.setEnabled(true);
            btn12.setEnabled(true);
            btn20.setEnabled(true);
            btn21.setEnabled(true);
            btn22.setEnabled(true);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                 location.add(br.readLine());
                 cekData();
                 cekStatus();
            } catch (IOException e) {
               
            }
        }
    }
}
