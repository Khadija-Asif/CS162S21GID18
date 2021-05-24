/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Hafsa Rashid
 */
public class CustomerSignup extends javax.swing.JFrame {

    /**
     * Creates new form CustomerSignin
     */
    public CustomerSignup() {
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
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        signup = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(190, 21, 88));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        title.setText("Sign up");
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 102, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Images/icons8_minimize_window_20px_1.png"))); // NOI18N
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 29, 33));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Images/icons8_multiply_20px_4.png"))); // NOI18N
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, 33));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Images/signin.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 550, 610));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 620));

        label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Images/icons8_workspace_100px_2.png"))); // NOI18N
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        label8.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Password");
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 110, 50));
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 160, -1));

        label2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Name");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 70, 20));

        password.setText("jPasswor");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 160, -1));

        showPassword.setText("Show Password");
        jPanel1.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 140, -1));

        signup.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        signup.setText("Sign up");
        signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, 110, 40));

        label3.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Contact Number");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 160, 30));

        label4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Address");
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 110, 50));

        label6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Postal Code");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 120, 40));

        label5.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("City");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 70, 40));

        label7.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Email ID");
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 110, 50));
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 160, -1));
        jPanel1.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 160, -1));
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 160, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 160, -1));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CustomerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField city;
    private javax.swing.JLabel close;
    private javax.swing.JTextField code;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton signup;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
