
package tenis;
import java.awt.Desktop;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLEditorKit;
public class Tenis extends javax.swing.JFrame {



   
    public Tenis() {
        initComponents();
        jTextPane1.setEditorKit(new HTMLEditorKit());
        jTextPane1.setEditable(true);
     setSize(1280,695);
    }

   
    @SuppressWarnings("unchecked")
                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
jLabel2 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

       jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("All About TenniS");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(32, 30));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 10, 340, 37);

        jButton1.setText("Atp List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
          jButton1.setBounds(30, 90, 104, 59);
jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        
jButton7.setText("Tennis history");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
getContentPane().add(jButton7);
       jButton7.setBounds(600, 90, 120, 60);
jButton7.setFont(new java.awt.Font("Tahoma", 1, 12));

jButton2.setText("Wta List");
        getContentPane().add(jButton2);
        jButton2.setBounds(1160, 90, 99, 59);
       jButton2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Grand Slams");
        getContentPane().add(jButton3);
        jButton3.setFont(new java.awt.Font("Tahoma", 2, 12));
        jButton3.setBounds(440, 580, 104, 70);
jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.setText("Masters");
        getContentPane().add(jButton4);
        jButton4.setFont(new java.awt.Font("Tahoma", 2, 12));
          jButton4.setBounds(30, 580, 160, 70);
jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton5.setText("Davis Cup");
        getContentPane().add(jButton5);
       jButton5.setFont(new java.awt.Font("Tahoma", 2, 12));
        jButton5.setBounds(750, 580, 110, 68);
jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton6.setText("Best players in history");
        getContentPane().add(jButton6);
         jButton6.setFont(new java.awt.Font("Tahoma", 2, 12));
        jButton6.setBounds(1080, 580, 180, 68);
jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
       

        jLabel2.setIcon(new javax.swing.ImageIcon("https://imgur.com/a/3YqKc")); // NOI18N
        
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-150, -30, 1880, 690);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 1230, 390);

        pack();
    }                      

            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {     
try {
    Desktop.getDesktop().browse(new URL("http://www.atpworldtour.com/en/rankings/singles").toURI());
} catch (Exception e) {}   }                        
                 private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {     
try {
    Desktop.getDesktop().browse(new URL("http://www.wtatennis.com/rankings").toURI());
} catch (Exception e) {}   }                        
        
      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {   
        Izbor loptica = (Izbor)JOptionPane.showInputDialog(getContentPane(),"Choose Grand Slam", "Grand Slams",
                JOptionPane.QUESTION_MESSAGE, null, GrandSlams.igrac, null);
        Sport igra;
        igra = (Sport)JOptionPane.showInputDialog(getContentPane(), "Choose Grand Slam" , "Tenis",
                JOptionPane.QUESTION_MESSAGE, null, loptica.reket, null);
        try {
            jTextPane1.setPage(igra.adresa);
        }
         catch (IOException ex) {
             Logger.getLogger(Tenis.class.getName()).log(Level.SEVERE,null,ex);
        }}    
       private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {   
        Izbor loptica = (Izbor)JOptionPane.showInputDialog(getContentPane(),"Choose ", "Master tournament",
                JOptionPane.QUESTION_MESSAGE, null, Masters.igrac, null);
        Sport igra;
        igra = (Sport)JOptionPane.showInputDialog(getContentPane(), "Choose " , "Tenis",
                JOptionPane.QUESTION_MESSAGE, null, loptica.reket, null);
        try {
            jTextPane1.setPage(igra.adresa);
        }
         catch (IOException ex) {
             Logger.getLogger(Tenis.class.getName()).log(Level.SEVERE,null,ex);
        }}   
  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {   
        Izbor loptica = (Izbor)JOptionPane.showInputDialog(getContentPane(),"Choose", "DavisCup",
                JOptionPane.QUESTION_MESSAGE, null, DavisCup.igrac, null);
        Sport igra;
        igra = (Sport)JOptionPane.showInputDialog(getContentPane(), "Choose" , "Tenis",
                JOptionPane.QUESTION_MESSAGE, null, loptica.reket, null);
        try {
            jTextPane1.setPage(igra.adresa);
        }
         catch (IOException ex) {
             Logger.getLogger(Tenis.class.getName()).log(Level.SEVERE,null,ex);
        }}          
   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {   
        Izbor loptica = (Izbor)JOptionPane.showInputDialog(getContentPane(),"Choose", "List of best female or male tennis players",
                JOptionPane.QUESTION_MESSAGE, null, BestPlayers.igrac, null);
        Sport igra;
        igra = (Sport)JOptionPane.showInputDialog(getContentPane(), "Choose" , "Tenis",
                JOptionPane.QUESTION_MESSAGE, null, loptica.reket, null);
        try {
            jTextPane1.setPage(igra.adresa);
        }
         catch (IOException ex) {
             Logger.getLogger(Tenis.class.getName()).log(Level.SEVERE,null,ex);
        }}    
              private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {     
try {
    Desktop.getDesktop().browse(new URL("http://www.tennistheme.com/tennishistory.html").toURI());
} catch (Exception e) {}   } 
      
      
      
      
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tenis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tenis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration                   
}
