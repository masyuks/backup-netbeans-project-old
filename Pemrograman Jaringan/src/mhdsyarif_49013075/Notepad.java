/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mhdsyarif_49013075;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 * @author MhdSyarif
 * Monday, 06 January 2014, 12 : 57 : 21 WIB 
 * Tugas II Matakulia Java2SE
 * Mhd. Syarif | 49013075
 * TKJMD - STEI - ITB
 */
public class Notepad extends javax.swing.JFrame {
    String file, view, fn, dir;
    String nameApp="NotePad";
    int format=0;
    private String line;

    /**
     * Creates new form Notepad
     */
    public Notepad() {
        super("Aplikasi Notepad Sederhana");
        initComponents();
        //Menampilkan hasil ditengah window
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }
    
    //Pengaturan Word Wrap
    private void getWordWrap(int w){
        if(w==1){
            TextArea.setLineWrap(true);
        }else{
            TextArea.setLineWrap(false);
        }
    }
    
    //Pengaturan File Baru
    private void getNewFile(){
        if (TextArea.getText().equals("")||TextArea.getText().equals(view)){
            TextArea.setFont(new Font("Monospaced", 0, 14));
            setTitle("Untitled - Notepad Mhd Syarif");
        }else{
            int i = JOptionPane.showConfirmDialog(null,"Do you to save changes ?");
            if(i == 0) {
                getSaveFile(file);
            }else if(i == 1){
                TextArea.setText("");
                TextArea.setFont(new Font("Monospaced", 0, 14));
                setTitle("Untitled - Notepad Mhd Syarif");
            }else if(i == 2)
                return;
        }
    }
    
    //Pengaturan Buka File
    private void getOpenFile(){
        FileDialog fd = new FileDialog(Notepad.this, "Saved File", FileDialog.LOAD);
        fd.show();
        if (fd.getFile() != null) {
            file = fd.getDirectory() + fd.getFile();
            setTitle(file);
            readFile();
        }
        TextArea.requestFocus();
    }
     
    //Pengaturan Baca File
    private void readFile() {
        BufferedReader data;
        StringBuilder sb = new StringBuilder();
        try {
            data = new BufferedReader(new FileReader(file));
            String line;
            while ((line = data.readLine()) != null) {
                sb.append(line).append("\n");
            }
            TextArea.setText(sb.toString());
            data.close();
        } 
            catch (IOException ioe) {
        }
    }
    
    //Pengaturan Simpan File
    private void getSaveFile(String file){  
       FileDialog fd = new FileDialog(Notepad.this, "Save", FileDialog.SAVE);
        fd.show();
        if (fd.getFile() != null) {
            fn = fd.getFile();
            dir = fd.getDirectory(); 
            file = dir + fn  + ".txt";
            setTitle(file);
        try{
            DataOutputStream data = new DataOutputStream(new FileOutputStream(file));
            line = TextArea.getText();
            BufferedReader buffer = new BufferedReader(new StringReader(line));
            while ((line = buffer.readLine()) != null) {
                data.writeBytes(line + "\r\n");
                data.close();
            }
        }catch (Exception err){
        }
      }
   }
    
    private void getSaveAsFile(){
        FileDialog fd = new FileDialog(Notepad.this, "Save As", FileDialog.SAVE);
        fd.show();
        if (fd.getFile() != null) {
            fn = fd.getFile();
            dir = fd.getDirectory(); 
            file = dir + fn  + ".txt";  
            setTitle(file);
        try {
            DataOutputStream data = new DataOutputStream(new FileOutputStream(file));
            line = TextArea.getText();
            BufferedReader buffer = new BufferedReader(new StringReader(line));
            while ((line = buffer.readLine()) != null) {
                data.writeBytes(line + "\r\n");
                data.close();
            }
        } catch (Exception e){
            TextArea.requestFocus();
        }
      }
  }
    
    //Pengaturan Jenis Huruf
    public void getFont(int font){
        switch (font){
            case 1 :
                TextArea.setFont(new Font ("Lucida Console ",Font.PLAIN, 14));
                break;
            case 2 : 
                TextArea.setFont(new Font ("Arial",Font.PLAIN, 14));
                break;
            case 3 : 
                TextArea.setFont(new Font ("Times New Roman",Font.PLAIN, 14));
                break;
            case 4 :
                TextArea.setFont(new Font ("Monospaced",Font.PLAIN, 14));
                break;
            case 5 :
                TextArea.setFont(new Font ("Courier Now",Font.PLAIN, 14));
                break;
            case 6 :
                TextArea.setFont(new Font ("Tahoma",Font.PLAIN, 14));
                break;
            case 7 :
                TextArea.setFont(new Font ("Kartika",Font.PLAIN, 14));
                break;
        }
    }
    
    //Pengaturan Gaya Huruf
   /* public void getFontStyle(int style){
        for (style=1; style<10; style++) {
            for (int fontsize=12; fontsize<=22; fontsize++){
                TextArea.setFont (new Font(TextArea.getName(),Font.BOLD,12));
                //System.out.println("Nilai ke = " +fontsize);
                //TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),+fontsize));
                
                //fontsize+=1;
                style++;
            }
        }*/
    public void getFontStyle(int fontStyle){
        switch (fontStyle){
        case 1:
            TextArea.setFont(new Font(TextArea.getName(),Font.PLAIN, 14));
            break;
        case 2:
            TextArea.setFont(new Font(TextArea.getName(),Font.ITALIC, 14));
            break;
        case 3:
            TextArea.setFont(new Font(TextArea.getName(),Font.BOLD, 14));
            break;
        case 4:
            TextArea.setFont(new Font(TextArea.getName(),3,14));
            break;
        }
    }
         
    //Pengaturan Ukuran Huruf
    public void getFontSize(int fontSize){
        switch (fontSize){
            case 1:
                //TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),Font.BOLD));
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),10));
                break;
            case 2:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),12));
                break;
            case 3:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),14));
                break;
            case 4:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),16));
                break;
            case 5:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),18));
                break;
            case 6:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),20));
                break;
            case 7:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),22));
                break;
            case 8:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),24));
        }
        
    }
    
    //Text Color
    public void getTextColor(){
        Color c = JColorChooser.showDialog(null,"Text Color",TextArea.getForeground());
        TextArea.setForeground(c);
    }
    
    //Konfirmasi keluar
    public void getExit(){
        int confirm =JOptionPane.showConfirmDialog(this,"Are you sure will exit this application ?","Exit Application",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            System.exit(0);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JDialog();
        ColorChooser = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuNew = new javax.swing.JMenuItem();
        jMenuOpen = new javax.swing.JMenuItem();
        jMenuSave = new javax.swing.JMenuItem();
        jMenuSavedAs = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenuItem();
        jMenuFormat = new javax.swing.JMenu();
        jMenuTextColor = new javax.swing.JMenuItem();
        jMenuWordWrap = new javax.swing.JMenu();
        jMenuYes = new javax.swing.JMenuItem();
        jMenuNo = new javax.swing.JMenuItem();
        jMenuFont = new javax.swing.JMenu();
        jMenuLucidaConsole = new javax.swing.JMenuItem();
        jMenuArial = new javax.swing.JMenuItem();
        jMenuTimeNewRoman = new javax.swing.JMenuItem();
        jMenuMonoSpaced = new javax.swing.JMenuItem();
        jMenuCourierNew = new javax.swing.JMenuItem();
        jMenuTahoma = new javax.swing.JMenuItem();
        jMenuKartika = new javax.swing.JMenuItem();
        jMenuFontStyle = new javax.swing.JMenu();
        jMenuPlain = new javax.swing.JMenuItem();
        jMenuItalic = new javax.swing.JMenuItem();
        jMenuBold = new javax.swing.JMenuItem();
        jMenuBoldItalic = new javax.swing.JMenuItem();
        jMenuFontSize = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenuItem();
        jMenu22 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenuItem();

        javax.swing.GroupLayout DialogLayout = new javax.swing.GroupLayout(Dialog.getContentPane());
        Dialog.getContentPane().setLayout(DialogLayout);
        DialogLayout.setHorizontalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DialogLayout.setVerticalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogLayout.createSequentialGroup()
                .addComponent(ColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setBackground(new java.awt.Color(204, 204, 255));
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TextArea.setRows(5);
        TextArea.setMargin(new java.awt.Insets(2, 8, 2, 2));
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        jMenuFile.setText("File");
        jMenuFile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuNew.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jMenuNew.setText("New ");
        jMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuNew);

        jMenuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuOpen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open.png"))); // NOI18N
        jMenuOpen.setText("Open");
        jMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpenActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuOpen);

        jMenuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jMenuSave.setText("Save");
        jMenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuSave);

        jMenuSavedAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuSavedAs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuSavedAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveas.png"))); // NOI18N
        jMenuSavedAs.setText("Save As");
        jMenuSavedAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSavedAsActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuSavedAs);

        jMenuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuExit);

        jMenuBar1.add(jMenuFile);

        jMenuFormat.setText("Format");
        jMenuFormat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormatActionPerformed(evt);
            }
        });

        jMenuTextColor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuTextColor.setText("Text Color");
        jMenuTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTextColorActionPerformed(evt);
            }
        });
        jMenuFormat.add(jMenuTextColor);

        jMenuWordWrap.setText("Word Wrap");
        jMenuWordWrap.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuYes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuYes.setText("Yes");
        jMenuYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuYesActionPerformed(evt);
            }
        });
        jMenuWordWrap.add(jMenuYes);

        jMenuNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuNo.setText("No");
        jMenuNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNoActionPerformed(evt);
            }
        });
        jMenuWordWrap.add(jMenuNo);

        jMenuFormat.add(jMenuWordWrap);

        jMenuFont.setText("Font");
        jMenuFont.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFontActionPerformed(evt);
            }
        });

        jMenuLucidaConsole.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jMenuLucidaConsole.setText("Lucida Console");
        jMenuLucidaConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLucidaConsoleActionPerformed(evt);
            }
        });
        jMenuFont.add(jMenuLucidaConsole);

        jMenuArial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuArial.setText("Arial");
        jMenuArial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArialActionPerformed(evt);
            }
        });
        jMenuFont.add(jMenuArial);

        jMenuTimeNewRoman.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jMenuTimeNewRoman.setText("Times New Roman");
        jMenuTimeNewRoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTimeNewRomanActionPerformed(evt);
            }
        });
        jMenuFont.add(jMenuTimeNewRoman);

        jMenuMonoSpaced.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jMenuMonoSpaced.setText("Mono Spaced");
        jMenuMonoSpaced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMonoSpacedActionPerformed(evt);
            }
        });
        jMenuFont.add(jMenuMonoSpaced);

        jMenuCourierNew.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jMenuCourierNew.setText("Courier New");
        jMenuCourierNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCourierNewActionPerformed(evt);
            }
        });
        jMenuFont.add(jMenuCourierNew);

        jMenuTahoma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuTahoma.setText("Tahoma");
        jMenuTahoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTahomaActionPerformed(evt);
            }
        });
        jMenuFont.add(jMenuTahoma);

        jMenuKartika.setFont(new java.awt.Font("Kartika", 0, 12)); // NOI18N
        jMenuKartika.setText("Kartika");
        jMenuKartika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKartikaActionPerformed(evt);
            }
        });
        jMenuFont.add(jMenuKartika);

        jMenuFormat.add(jMenuFont);

        jMenuFontStyle.setText("Font Style");
        jMenuFontStyle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuFontStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFontStyleActionPerformed(evt);
            }
        });

        jMenuPlain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuPlain.setText("Plain");
        jMenuPlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPlainActionPerformed(evt);
            }
        });
        jMenuFontStyle.add(jMenuPlain);

        jMenuItalic.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jMenuItalic.setText("Italic");
        jMenuItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItalicActionPerformed(evt);
            }
        });
        jMenuFontStyle.add(jMenuItalic);

        jMenuBold.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBold.setText("Bold");
        jMenuBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBoldActionPerformed(evt);
            }
        });
        jMenuFontStyle.add(jMenuBold);

        jMenuBoldItalic.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jMenuBoldItalic.setText("Bold Italic");
        jMenuBoldItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBoldItalicActionPerformed(evt);
            }
        });
        jMenuFontStyle.add(jMenuBoldItalic);

        jMenuFormat.add(jMenuFontStyle);

        jMenuFontSize.setText("Size");
        jMenuFontSize.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenu10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu10.setText("10");
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu10);

        jMenu12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu12.setText("12");
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu12);

        jMenu14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu14.setText("14");
        jMenu14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu14ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu14);

        jMenu16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu16.setText("16");
        jMenu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu16ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu16);

        jMenu18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu18.setText("18");
        jMenu18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu18ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu18);

        jMenu20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu20.setText("20");
        jMenu20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu20ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu20);

        jMenu22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu22.setText("22");
        jMenu22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu22ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu22);

        jMenu24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu24.setText("24");
        jMenu24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu24ActionPerformed(evt);
            }
        });
        jMenuFontSize.add(jMenu24);

        jMenuFormat.add(jMenuFontSize);

        jMenuBar1.add(jMenuFormat);

        jMenu1.setText("Help");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuAbout.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuAbout.setText("About Notepad");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAbout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuTimeNewRomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTimeNewRomanActionPerformed
       getFont(3); 
    }//GEN-LAST:event_jMenuTimeNewRomanActionPerformed

    private void jMenu14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu14ActionPerformed
       getFontSize(3);
    }//GEN-LAST:event_jMenu14ActionPerformed

    private void jMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveActionPerformed
       getSaveFile(file);
    }//GEN-LAST:event_jMenuSaveActionPerformed

    private void jMenuSavedAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSavedAsActionPerformed
        getSaveAsFile();
    }//GEN-LAST:event_jMenuSavedAsActionPerformed

    private void jMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewActionPerformed
        getNewFile(); 
    }//GEN-LAST:event_jMenuNewActionPerformed

    private void jMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpenActionPerformed
        getOpenFile();
    }//GEN-LAST:event_jMenuOpenActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        //Untuk konfirmasi keluar dari program
        getExit();
    }//GEN-LAST:event_jMenuExitActionPerformed

    private void jMenuFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFontActionPerformed
       
    }//GEN-LAST:event_jMenuFontActionPerformed

    private void jMenuLucidaConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLucidaConsoleActionPerformed
        getFont(1);
    }//GEN-LAST:event_jMenuLucidaConsoleActionPerformed

    private void jMenuArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArialActionPerformed
        getFont(2);
    }//GEN-LAST:event_jMenuArialActionPerformed

    private void jMenuMonoSpacedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMonoSpacedActionPerformed
        getFont(4);
    }//GEN-LAST:event_jMenuMonoSpacedActionPerformed

    private void jMenuCourierNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCourierNewActionPerformed
        getFont(5);
    }//GEN-LAST:event_jMenuCourierNewActionPerformed

    private void jMenuTahomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTahomaActionPerformed
        getFont(6);
    }//GEN-LAST:event_jMenuTahomaActionPerformed

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        About a = new About();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuAboutActionPerformed

    private void jMenuKartikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKartikaActionPerformed
        getFont(7);
    }//GEN-LAST:event_jMenuKartikaActionPerformed

    private void jMenuPlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPlainActionPerformed
        getFontStyle(1);
    }//GEN-LAST:event_jMenuPlainActionPerformed

    private void jMenu16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu16ActionPerformed
        getFontSize(4);
    }//GEN-LAST:event_jMenu16ActionPerformed

    private void jMenuItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItalicActionPerformed
        getFontStyle(2);
    }//GEN-LAST:event_jMenuItalicActionPerformed

    private void jMenuBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBoldActionPerformed
        getFontStyle(3);
    }//GEN-LAST:event_jMenuBoldActionPerformed

    private void jMenuFontStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFontStyleActionPerformed
        
    }//GEN-LAST:event_jMenuFontStyleActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        getFontSize(1);
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
        getFontSize(2);
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jMenu18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu18ActionPerformed
        getFontSize(5);
    }//GEN-LAST:event_jMenu18ActionPerformed

    private void jMenu20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu20ActionPerformed
        getFontSize(6);
    }//GEN-LAST:event_jMenu20ActionPerformed

    private void jMenu22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu22ActionPerformed
        getFontSize(7);
    }//GEN-LAST:event_jMenu22ActionPerformed

    private void jMenu24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu24ActionPerformed
        getFontSize(8);
    }//GEN-LAST:event_jMenu24ActionPerformed

    private void jMenuBoldItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBoldItalicActionPerformed
        getFontStyle(4);
    }//GEN-LAST:event_jMenuBoldItalicActionPerformed

    private void jMenuFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormatActionPerformed
         
    }//GEN-LAST:event_jMenuFormatActionPerformed

    private void jMenuYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuYesActionPerformed
        getWordWrap(1);
    }//GEN-LAST:event_jMenuYesActionPerformed

    private void jMenuNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNoActionPerformed
        getWordWrap(2);
    }//GEN-LAST:event_jMenuNoActionPerformed

    private void jMenuTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTextColorActionPerformed
        getTextColor();//Text Color
    }//GEN-LAST:event_jMenuTextColorActionPerformed
   
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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser ColorChooser;
    private javax.swing.JDialog Dialog;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenu10;
    private javax.swing.JMenuItem jMenu12;
    private javax.swing.JMenuItem jMenu14;
    private javax.swing.JMenuItem jMenu16;
    private javax.swing.JMenuItem jMenu18;
    private javax.swing.JMenuItem jMenu20;
    private javax.swing.JMenuItem jMenu22;
    private javax.swing.JMenuItem jMenu24;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenuItem jMenuArial;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBold;
    private javax.swing.JMenuItem jMenuBoldItalic;
    private javax.swing.JMenuItem jMenuCourierNew;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuFont;
    private javax.swing.JMenu jMenuFontSize;
    private javax.swing.JMenu jMenuFontStyle;
    private javax.swing.JMenu jMenuFormat;
    private javax.swing.JMenuItem jMenuItalic;
    private javax.swing.JMenuItem jMenuKartika;
    private javax.swing.JMenuItem jMenuLucidaConsole;
    private javax.swing.JMenuItem jMenuMonoSpaced;
    private javax.swing.JMenuItem jMenuNew;
    private javax.swing.JMenuItem jMenuNo;
    private javax.swing.JMenuItem jMenuOpen;
    private javax.swing.JMenuItem jMenuPlain;
    private javax.swing.JMenuItem jMenuSave;
    private javax.swing.JMenuItem jMenuSavedAs;
    private javax.swing.JMenuItem jMenuTahoma;
    private javax.swing.JMenuItem jMenuTextColor;
    private javax.swing.JMenuItem jMenuTimeNewRoman;
    private javax.swing.JMenu jMenuWordWrap;
    private javax.swing.JMenuItem jMenuYes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
