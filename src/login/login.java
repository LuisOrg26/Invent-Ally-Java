/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;


/**
 *
 * @author ACER PC
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jPanel1 = new javax.swing.JPanel();
        txtuser = new RoundJTextField(15);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btninit = new RoundJTextField(15);
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new RoundJTextField(15);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 512));

        jPanel1.setBackground(new java.awt.Color(74, 74, 74));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 512));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtuser.setBackground(new java.awt.Color(74, 74, 74));
        txtuser.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setMinimumSize(new java.awt.Dimension(216, 35));
        txtuser.setPreferredSize(new java.awt.Dimension(216, 35));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, 40));

        jLabel1.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, 20));

        jLabel2.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 110, 20));

        btninit.setBackground(new java.awt.Color(105, 191, 168));
        btninit.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        btninit.setForeground(new java.awt.Color(255, 255, 255));
        btninit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        btninit.setText("INICIAR");
        btninit.setEnabled(false);
        btninit.setMinimumSize(new java.awt.Dimension(216, 35));
        btninit.setPreferredSize(new java.awt.Dimension(216, 35));
        btninit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninitMouseClicked(evt);
            }
        });
        jPanel1.add(btninit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 190, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Invent-Image.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        txtpassword.setBackground(new java.awt.Color(74, 74, 74));
        txtpassword.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setMinimumSize(new java.awt.Dimension(216, 35));
        txtpassword.setPreferredSize(new java.awt.Dimension(216, 35));
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 9623, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1332, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninitMouseClicked
        System.out.println("Hola");
    }//GEN-LAST:event_btninitMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btninit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
