/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class OutputStreamFrame extends javax.swing.JFrame {

    /**
     * Creates new form OutputStreamFrame
     */
    public OutputStreamFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfLocation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taData = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSubmitOutput = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miInputStream = new javax.swing.JMenuItem();
        miOutputStream = new javax.swing.JMenuItem();
        miKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miReset = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Save Location :");

        tfLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLocationActionPerformed(evt);
            }
        });

        taData.setColumns(20);
        taData.setRows(5);
        jScrollPane1.setViewportView(taData);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Input Data :");

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("Reset");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSubmitOutput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmitOutput.setText("Submit");
        btnSubmitOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOutputActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        miInputStream.setText("Input Stream");
        miInputStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miInputStreamActionPerformed(evt);
            }
        });
        jMenu1.add(miInputStream);

        miOutputStream.setText("Output Stream");
        miOutputStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOutputStreamActionPerformed(evt);
            }
        });
        jMenu1.add(miOutputStream);

        miKeluar.setText("Keluar");
        miKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(miKeluar);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");

        miReset.setText("Reset");
        miReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miResetActionPerformed(evt);
            }
        });
        jMenu2.add(miReset);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfLocation)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmitOutput)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmitOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLocationActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        tfLocation.setText("");
        taData.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOutputActionPerformed
        // TODO add your handling code here:
        String location = tfLocation.getText();
        try {
            OutputStream os = new FileOutputStream(location);
            String data = taData.getText();
            os.write(data.getBytes());
            os.flush();
            os.close();
            JOptionPane.showMessageDialog(null, "Write Data Sukses.");
            tfLocation.setText("");
            taData.setText("");
        } catch (IOException e) {
            System.err.println("Maaf, Terdapat Error!");
        }
    }//GEN-LAST:event_btnSubmitOutputActionPerformed

    private void miInputStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miInputStreamActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new InputStreamFrame().setVisible(true);
    }//GEN-LAST:event_miInputStreamActionPerformed

    private void miOutputStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOutputStreamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miOutputStreamActionPerformed

    private void miKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_miKeluarActionPerformed

    private void miResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miResetActionPerformed
        // TODO add your handling code here:
        tfLocation.setText("");
        taData.setText("");
    }//GEN-LAST:event_miResetActionPerformed

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
            java.util.logging.Logger.getLogger(OutputStreamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputStreamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputStreamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputStreamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutputStreamFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmitOutput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miInputStream;
    private javax.swing.JMenuItem miKeluar;
    private javax.swing.JMenuItem miOutputStream;
    private javax.swing.JMenuItem miReset;
    private javax.swing.JTextArea taData;
    private javax.swing.JTextField tfLocation;
    // End of variables declaration//GEN-END:variables
}
