
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony
 */
public class Decryption extends javax.swing.JFrame {

    /**
     * Creates new form Decryption
     */
    public Decryption() {
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
        but_browse = new javax.swing.JButton();
        file_path = new javax.swing.JTextField();
        but_encrypt = new javax.swing.JButton();
        key = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        but_saveAs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DECRYPTION");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("  ENTER KEY :");

        but_browse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        but_browse.setText("Browse");
        but_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_browseActionPerformed(evt);
            }
        });

        file_path.setFocusable(false);

        but_encrypt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        but_encrypt.setText("DECRYPT");
        but_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_encryptActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("      IMAGE LOCATION :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("           SAVEV AS :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(key)
                    .addComponent(file_path, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(but_saveAs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but_browse, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(but_encrypt)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_browse)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(but_saveAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(but_encrypt)
                .addGap(57, 57, 57))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void but_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_browseActionPerformed
        FileFilter filter=new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
        JFileChooser chooser = new JFileChooser("D:\\FProject\\Encrypted Images");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();//
        String filename=f.getAbsolutePath();
        file_path.setText(filename);        // TODO add your handling code here:
    }//GEN-LAST:event_but_browseActionPerformed

    private void but_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_encryptActionPerformed
try{          
              String path=file_path.getText();
              String fname=path.substring(29,(path.length()-4));
              String skey=key.getText();
              
              
               Connection conn=null;
		Statement stmt=null;

                Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kirusa","root","root");
			
			stmt = conn.createStatement();
                        String sql1= "select fname,skey from list ";
                        
                        ResultSet rs = stmt.executeQuery(sql1);
                        int flag=0;
                        while(rs.next())
                        {
                            String d_fname=rs.getString("fname");
				String d_skey=rs.getString("skey");
                                
                                if(d_fname.equals(fname) && d_skey.equals(skey))
                                {
                                    flag=1;
                                    break;
                                }
                        }
                        
                        
                         rs.close();
			stmt.close();
			conn.close();
                        
                        if(flag==1){
             String save= but_saveAs.getText();
             FileInputStream file = new FileInputStream(file_path.getText());
            FileOutputStream outStream=new FileOutputStream("D:\\FProject\\Decrypted Images\\" + save + ".jpg");
            byte k[]=key.getText().getBytes();
            SecretKeySpec key = new SecretKeySpec(k,"AES");
            Cipher enc=Cipher.getInstance("AES");
            enc.init(Cipher.DECRYPT_MODE,key);
            CipherOutputStream cos=new CipherOutputStream(outStream,enc );
            
            byte[] buf = new byte[1024];
            int read;
            while((read=file.read(buf))!=-1)
            {
               cos.write(buf, 0 , read);
            }
            file.close();
            outStream.flush(); 
            cos.close();
            JOptionPane.showMessageDialog(null,"File is Decrypted");
            dispose();
                        }
                        if(flag!=1){
                           JOptionPane.showMessageDialog(null,"Invalid key");
                           key.setText("");
                        }
            
            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your ha    }//GEN-LAST:event_but_encryptActionPerformed
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
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Decryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Decryption().setVisible(true);
            }
        });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_browse;
    private javax.swing.JButton but_encrypt;
    private javax.swing.JTextField but_saveAs;
    private javax.swing.JTextField file_path;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField key;
    // End of variables declaration//GEN-END:variables
}