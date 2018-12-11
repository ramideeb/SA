package study.assistant;

import admin.admin;
import database.Puser;
import java.lang.Exception;
import study.assistant.signupp.signup;
import java.awt.Color;
import java.math.BigInteger;
import java.util.Properties;
import java.util.Vector;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static study.assistant.StudyAssistant.prog;

public class login extends javax.swing.JFrame {

    public Vector<Puser> users;

    public login() {

        initComponents();
        setTitle("study assistan");
        setSize(1100, 600);
        setLocationRelativeTo(null);

        // useers list 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        String jpql;
        jpql = "SELECT d FROM Puser d";
        Query query = em.createQuery(jpql);
        users = new Vector<Puser>();
        users = (Vector<Puser>) query.getResultList();

        em.close();
        emf.close();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        loginLBL = new javax.swing.JLabel();
        loginBTN = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        userTF = new javax.swing.JTextField();
        userLBL = new javax.swing.JLabel();
        passLBL = new javax.swing.JLabel();
        passTF = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        signUpLBL = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLBL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        loginLBL.setForeground(new java.awt.Color(254, 254, 254));
        loginLBL.setText("Login");
        loginLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLBLMouseClicked(evt);
            }
        });
        jPanel1.add(loginLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, -1));

        loginBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        loginBTN.setText("jLabel6");
        loginBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBTNMouseClicked(evt);
            }
        });
        jPanel1.add(loginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 220, 70));

        jSeparator2.setBackground(new java.awt.Color(177, 8, 55));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 170, 20));

        userTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userTF.setForeground(new java.awt.Color(177, 172, 172));
        userTF.setText("example@email.com");
        userTF.setBorder(null);
        userTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userTFFocusLost(evt);
            }
        });
        jPanel1.add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 280, 30));

        userLBL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        userLBL.setText("username");
        jPanel1.add(userLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        passLBL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        passLBL.setText("password");
        jPanel1.add(passLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        passTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passTF.setForeground(new java.awt.Color(148, 148, 148));
        passTF.setText("password12345");
        passTF.setBorder(null);
        passTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTFFocusLost(evt);
            }
        });
        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });
        jPanel1.add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 280, 30));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 139, 234));
        jLabel4.setText("forgot my password ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tlwg Typist", 0, 48)); // NOI18N
        jLabel5.setText("AL-NA7EET");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 280, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/free-student-vector.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 640, -1));

        jSeparator1.setBackground(new java.awt.Color(177, 8, 55));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 170, 20));

        signUpLBL.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        signUpLBL.setForeground(new java.awt.Color(55, 139, 234));
        signUpLBL.setText("Sign up ");
        signUpLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLBLMouseClicked(evt);
            }
        });
        jPanel1.add(signUpLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tlwg Typist", 0, 48)); // NOI18N
        jLabel9.setText("Login ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 250, 110));

        checkLBL.setBackground(new java.awt.Color(255, 255, 255));
        checkLBL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkLBL.setForeground(new java.awt.Color(188, 16, 21));
        checkLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(checkLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 420, 30));

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

    //initialize username
    private void userTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTFFocusGained
        if (userTF.getText().equals("example@email.com")) {
            userTF.setText("");
            userTF.setForeground(Color.black);
        }

    }//GEN-LAST:event_userTFFocusGained
    //initialize username
    private void userTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTFFocusLost
        if (userTF.getText().equals("")) {
            userTF.setText("example@email.com");
            userTF.setForeground(new Color(148, 148, 148));
        }
    }//GEN-LAST:event_userTFFocusLost
// initialize pass
    private void passTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTFFocusGained
        if (passTF.getText().equals("password12345")) {
            passTF.setText("");
            passTF.setForeground(Color.black);
        }

    }//GEN-LAST:event_passTFFocusGained
// initialize pass
    private void passTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTFFocusLost
        if (passTF.getText().equals("")) {
            passTF.setText("password12345");
            passTF.setForeground(new Color(148, 148, 148));

        }

    }//GEN-LAST:event_passTFFocusLost

    private void passTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTFActionPerformed
    }//GEN-LAST:event_passTFActionPerformed
    // sign up 
    private void signUpLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLBLMouseClicked
        signup s = new signup();
        s.setLocationRelativeTo(this);
        s.setSize(1100, 714);
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signUpLBLMouseClicked
    //login 1
    private void loginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTNMouseClicked
        // TODO add your handling code here:

        String username = userTF.getText();
        String password = new String(passTF.getPassword());

        if ("admin".equals(username) && "admin".equals(password)) {
            prog.admin = new admin();
            prog.login.dispose();
            prog.admin.setTitle("admin");
            prog.admin.setLocationRelativeTo(this);
            prog.admin.setVisible(true);
            this.dispose();

        } else if (vf(username, password)) {
               Nf m = new Nf();
             m.setTitle("home");
             m.setLocationRelativeTo(this);  
             m.setVisible(true);
            prog.login.dispose();
            m.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            

             

        } else if (checkPassword(username, password)) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            prog.home = new home(em.find(Puser.class, userTF.getText()));
            prog.login.dispose();
            prog.home.setTitle("home");
            prog.home.setLocationRelativeTo(this);
            prog.home.setVisible(true);
            
            em.close();
            emf.close();
            this.dispose();
        } else {

            if (userTF.getText().equals("") || new Color(148, 148, 148).equals(userTF.getForeground())) {
                checkLBL.setText("Please fill the username and password field");
                return;
            }

            if (new String(passTF.getPassword()).equals("") || new Color(148, 148, 148).equals(passTF.getForeground())) {
                checkLBL.setText("Please fill the username and password field");
                return;
            }

            if (!checkUsername(username)) {
                checkLBL.setText("Username not found");

                return;
            }
            if (!checkPassword(username, password)) {
                checkLBL.setText("Password and username don't match");
                return;
            }

        }

        this.dispose();
    }//GEN-LAST:event_loginBTNMouseClicked
    //login 2
    private void loginLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLBLMouseClicked
        //saving name and pass

        String username = userTF.getText();
        String password = new String(passTF.getPassword());

        if ("admin".equals(username) && "admin".equals(password)) {
            prog.admin = new admin();
            prog.login.dispose();
            prog.admin.setTitle("admin");
            prog.admin.setLocationRelativeTo(this);
            prog.admin.setVisible(true);
        } else if (vf(username, password)) {
            
            Nf m = new Nf();
            m.setVisible(true);
            prog.login.dispose();
             m.setTitle("home");
             m.setLocationRelativeTo(this);
             

        } else if (checkPassword(username, password)) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            prog.home = new home(em.find(Puser.class, userTF.getText()));
            prog.login.dispose();
            prog.home.setTitle("home");
            prog.home.setLocationRelativeTo(this);
            prog.home.setVisible(true);
            em.close();
            emf.close();
        } else {

            if (userTF.getText().equals("") || new Color(148, 148, 148).equals(userTF.getForeground())) {
                checkLBL.setText("Please fill the username and password field");
                return;
            }

            if (new String(passTF.getPassword()).equals("") || new Color(148, 148, 148).equals(passTF.getForeground())) {
                checkLBL.setText("Please fill the username and password field");
                return;
            }

            if (checkUsername(username)) {
                checkLBL.setText("Username not found");

                return;
            }
            if (!checkPassword(username, password)) {
                checkLBL.setText("Password and username don't match");
                return;
            }

        }
    }//GEN-LAST:event_loginLBLMouseClicked
    //resset password  
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        resetPass a = new resetPass();
        a.setSize(579, 200);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
        a.setVisible(true);


    }//GEN-LAST:event_jLabel4MouseClicked

//to send email 
    public static void send(String to, String sub, String msg, final String user, final String pass) {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");

        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(user, pass);
            }
        });

        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);

            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Email sent!");

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Something happened!");

            throw new RuntimeException(e);
        }

    }

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    //to be modified

    public boolean checkUsername(String username) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            em.find(Puser.class, userTF.getText());

            em.close();
            emf.close();
        } catch (Exception ex) {
            return false;
        }

        return true;
    }

    //to be modified1
    public boolean checkPassword(String username, String password) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            if (em.find(Puser.class, userTF.getText()).getPassword().equals(signup.getMd5(new String(passTF.getPassword())))) {
                return true;

            }

            em.close();
            emf.close();
        } catch (Exception ex) {

        }

        return false;
    }

    public boolean vf(String username, String password) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        if (em.find(Puser.class, userTF.getText()).getVerified() == BigInteger.ZERO) {
            return true;
        }

        em.close();
        emf.close();

        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkLBL;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loginBTN;
    private javax.swing.JLabel loginLBL;
    private javax.swing.JLabel passLBL;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel signUpLBL;
    private javax.swing.JLabel userLBL;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
