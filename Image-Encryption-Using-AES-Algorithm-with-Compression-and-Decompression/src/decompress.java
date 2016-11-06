
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import CLZWCompressor.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import CHuffmanCompressor.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony
 */
public class decompress extends javax.swing.JFrame {

    /**
     * Creates new form decompress
     */
    public decompress() {
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
        file_path = new javax.swing.JTextField();
        but_browse = new javax.swing.JButton();
        box = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        but_saveAs = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        status = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DECOMPRESS");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("IMAGE LOCATION :");

        file_path.setFocusable(false);

        but_browse.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        but_browse.setText("BROWSE");
        but_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_browseActionPerformed(evt);
            }
        });

        box.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CHuffman Compressor", "CRLE DeCompressor", "CGZip DeCompressor", "CLZW DeCompressor" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("         ALGORTHIM :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("        SAVE_AS :");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("DECOMPRESS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        status.setColumns(20);
        status.setRows(5);
        jScrollPane1.setViewportView(status);

        jLabel4.setText("STATUS :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(box, javax.swing.GroupLayout.Alignment.LEADING, 0, 293, Short.MAX_VALUE)
                            .addComponent(file_path, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(but_saveAs, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but_browse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(file_path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(but_browse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(but_saveAs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(567, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String save=but_saveAs.getText();
       String gsummary="";
        int flag=0;
        if(box.getSelectedItem().equals("CGZip DeCompressor"))
        {
            try
              {
                  long fileLen = new File(file_path.getText()).length();
            GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream(file_path.getText()));
            OutputStream out = new FileOutputStream("D:\\FProject\\Decompressed Images\\CGZip Compressor\\" + save+ ".jpg");
            byte[] buf = new byte[1024];
		int len;
		while ((len = gzipInputStream.read(buf)) > 0) {
		out.write(buf, 0, len);
		}
                gzipInputStream.close();
		out.close();
		long outputFilelen  = new File("D:\\FProject\\Decompressed Images\\CGZip Compressor\\" + save+ ".jpg").length();
		gsummary  += ("Compressed File Size : "+ fileLen + "\n");
		gsummary  += ("Original   File Size : "+ outputFilelen + "\n");
                System.out.println(gsummary);
                status.setText(gsummary);
		

                }
            catch(IOException e)
            {flag=1;}
            
             if(flag!=1)
                 {
                     JOptionPane.showMessageDialog(null,"File is Successfully DeCompressed");
                     dispose();
                     new selector().setVisible(true);
                 }
	}
        else if(box.getSelectedItem().equals("CRLE DeCompressor"))
        {
            int MAXCHARS = 256;
	        int ESCAPECHAR = 255;
	        String rleSignature = "RLE";
	        int toleranceFrequency = 4;
                long fileLen;
                int flag1=0;

                
                 FileInputStream fin;
	         FileOutputStream fout;
	         BufferedInputStream in = null;
	         BufferedOutputStream out = null;
                 
                 
		try{
			fin = new FileInputStream(file_path.getText());
			in = new BufferedInputStream(fin);
			
			fout = new FileOutputStream("D:\\FProject\\Decompressed Images\\CRLE Compressor\\" + save + ".jpg");
			out = new BufferedOutputStream(fout);
			
		}
                catch(FileNotFoundException e)
                {
			flag1=1;
		}
                try{
		fileLen = in.available();
                gsummary += "Compressed File Size : " + fileLen + "\n";

		if(fileLen == 0) 
                throw new Exception("\nFile is Empty!");
                
                
                byte[] sig = new byte[rleSignature.length()];
		String buf = "";
		long i = 0;
		int ch,count;
                
                in.read(sig,0,rleSignature.length());
		buf = new String(sig);
		
		if(!rleSignature.equals(buf))
                   flag1=1;
		
		i = rleSignature.length();
		
		while(i < fileLen){
			ch = in.read(); 
			i++;
			if(ch == ESCAPECHAR && i < fileLen){
				ch = in.read();
				count = in.read();
				i += 2;
				for(int k=0;k<count;k++) out.write((char)ch);
			}else{
				out.write((char)ch);
			}
						
		}
		out.close();
               long outputFilelen = new File("D:\\FProject\\Decompressed Images\\CRLE Compressor\\" + save + ".jpg").length();
		gsummary += "Original File Size : " + outputFilelen + "\n";
                
                System.out.println(gsummary);
                status.setText(gsummary);
                }
                catch(Exception e)
                {
                     flag1=1;
		}

                if(flag!=1)
                 {
                     JOptionPane.showMessageDialog(null,"File is Successfully DeCompressed");
                     dispose();
                     new selector().setVisible(true);
                 }



                 
        }
        
        else if(box.getSelectedItem().equals("CLZW DeCompressor"))
        {
            int flag3=0;
            try{
            CLZWDecoder lzwd = new CLZWDecoder(file_path.getText(),"D:\\FProject\\Decompressed Images\\CLZW Compressor\\" + save + ".jpg");
            lzwd.decodeFile();
            } 
            catch (Exception ex) {
                 flag3 = 1;  
           }
            if(flag3!=1)
                  {
                      JOptionPane.showMessageDialog(null,"File is Successfully DeCompressed");
                     dispose();
                     new selector().setVisible(true);
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null,"File is not Successfully DeCompressed");
                  }
            


        }
        else if(box.getSelectedItem().equals("CHuffman Compressor"))
        {
            CHuffmanDecoder hde = new	CHuffmanDecoder(file_path.getText());
           try {
               hde.decodeFile();
           } catch (Exception ex) {
               Logger.getLogger(decompress.class.getName()).log(Level.SEVERE, null, ex);
           }
		gsummary += hde.getSummary();
                status.setText(gsummary);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void but_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_browseActionPerformed
//FileFilter filter=new FileNameExtensionFilter("compressed images", ".gz");      
        JFileChooser chooser = new JFileChooser("D:\\FProject\\Compressed Images");
       // chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();// 
        String filename=f.getAbsolutePath();
        file_path.setText(filename);        // TODO add your handling code here:
    }//GEN-LAST:event_but_browseActionPerformed

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
            java.util.logging.Logger.getLogger(decompress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(decompress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(decompress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(decompress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new decompress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box;
    private javax.swing.JButton but_browse;
    private javax.swing.JTextField but_saveAs;
    private javax.swing.JTextField file_path;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea status;
    // End of variables declaration//GEN-END:variables
}
