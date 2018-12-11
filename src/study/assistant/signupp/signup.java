package study.assistant.signupp;

import database.Puser;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import static study.assistant.StudyAssistant.prog;
import study.assistant.login;

public class signup extends javax.swing.JFrame {

    st a;
    non b;
    ac c;

    public signup() {

        initComponents();

        setResizable(false);
        setSize(500, 730);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        a = new st();
        b = new non();
        c = new ac();

        main.removeAll();
        main.revalidate();
        main.repaint();
        main.add(a);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        usernameTF = new javax.swing.JTextField();
        lNameTF = new javax.swing.JTextField();
        passConfirmTF = new javax.swing.JPasswordField();
        passwordTF = new javax.swing.JPasswordField();
        gender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        signupLBL = new javax.swing.JLabel();
        signupBTN = new javax.swing.JLabel();
        acctTypeCB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fNameTF = new javax.swing.JTextField();
        usernameCheckLBL = new javax.swing.JLabel();
        checkLBL = new javax.swing.JLabel();
        passwordCheckLBL = new javax.swing.JLabel();
        birthdateJDC = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setForeground(new java.awt.Color(12, 16, 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameTF.setForeground(new java.awt.Color(149, 135, 135));
        usernameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTFFocusLost(evt);
            }
        });
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });
        jPanel1.add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, 30));

        lNameTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lNameTF.setForeground(new java.awt.Color(149, 135, 135));
        lNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(lNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 160, 30));

        passConfirmTF.setForeground(new java.awt.Color(149, 135, 135));
        passConfirmTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passConfirmTFFocusLost(evt);
            }
        });
        jPanel1.add(passConfirmTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 160, 30));

        passwordTF.setForeground(new java.awt.Color(149, 135, 135));
        jPanel1.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 160, 30));

        gender.setBackground(new java.awt.Color(254, 254, 254));
        gender.setForeground(new java.awt.Color(12, 11, 21));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 170, 30));

        jLabel2.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel2.setText("Last name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel5.setText("Birth date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel6.setText("account type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 110, -1));

        jLabel7.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        main.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 500, 123));

        signupLBL.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        signupLBL.setForeground(new java.awt.Color(254, 254, 254));
        signupLBL.setText("signup");
        signupLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLBLMouseClicked(evt);
            }
        });
        jPanel1.add(signupLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 50, -1));

        signupBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        signupBTN.setText("jLabel6");
        signupBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupBTNMouseClicked(evt);
            }
        });
        jPanel1.add(signupBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 220, 80));

        acctTypeCB.setBackground(new java.awt.Color(254, 254, 254));
        acctTypeCB.setForeground(new java.awt.Color(12, 11, 21));
        acctTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Acamemic instructor", "non-academic instructor" }));
        acctTypeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctTypeCBActionPerformed(evt);
            }
        });
        jPanel1.add(acctTypeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 160, 30));

        jLabel9.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel9.setText("confirm password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, -1));

        jLabel10.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel10.setText("First name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        fNameTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fNameTF.setForeground(new java.awt.Color(149, 135, 135));
        jPanel1.add(fNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, 30));

        usernameCheckLBL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(usernameCheckLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 140, 20));

        checkLBL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLBL.setForeground(new java.awt.Color(188, 16, 21));
        jPanel1.add(checkLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 250, 30));

        passwordCheckLBL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordCheckLBL.setForeground(new java.awt.Color(188, 16, 21));
        jPanel1.add(passwordCheckLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 170, 30));

        birthdateJDC.setMaxSelectableDate(new java.util.Date(1420066901000L));
        birthdateJDC.setMinSelectableDate(new java.util.Date(473382101000L));
        jPanel1.add(birthdateJDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 170, 30));

        jLabel11.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, -1));

        Email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(149, 135, 135));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, 714));

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 55, 55));
        jLabel8.setText("So signup !!");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/3RHeqSW.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-470, -40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void acctTypeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctTypeCBActionPerformed
        // TODO add your handling code here:

        int x = acctTypeCB.getSelectedIndex();

        switch (x) {
            case 0:
                main.removeAll();
                main.revalidate();
                main.repaint();
                main.add(a);
                break;

            case 1:
                main.removeAll();
                main.revalidate();
                main.repaint();
                main.add(c);
                break;
            case 2:
                main.removeAll();
                main.revalidate();
                main.repaint();
                main.add(b);

                break;
        }
    }//GEN-LAST:event_acctTypeCBActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void lNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameTFActionPerformed

    private void usernameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusLost
        // TODO add your handling code here:
        if (!usernameTF.getText().equals("")) {

            if (!checkUsername(usernameTF.getText())) {
                usernameCheckLBL.setForeground(new Color(188, 16, 21));
                usernameCheckLBL.setText("username already exists");
            } else {
                usernameCheckLBL.setForeground(new Color(12, 166, 33));
                usernameCheckLBL.setText("username valid");
            }

        }
    }//GEN-LAST:event_usernameTFFocusLost

    private void signupBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupBTNMouseClicked
        // TODO add your handling code here:
try{
        Puser user;
        if (checkEmptyFields()) {
            checkLBL.setText("Please fill all the fields");
            return;
        } else if (!checkUsername(usernameTF.getText())) {
            checkLBL.setText("Please choose a valid username");
            return;
        } else if (checkPasswordConfirmation()) {
            checkLBL.setText("The passwords don't match");
            return;
        } else {
            char g;
            if (gender.getSelectedIndex() == 0) {
                g = 'M';
            } else {
                g = 'F';
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            user = new Puser(
                    usernameTF.getText(),
                    fNameTF.getText(),
                    lNameTF.getText(),
                    g,
                    birthdateJDC.getDate(),
                    this.getMd5(new String(passwordTF.getPassword())),
                    (String) acctTypeCB.getSelectedItem()
            );

            user.setEmail(Email.getText());

            if (acctTypeCB.getSelectedIndex() == 0) {
                    user.setClass1((String) a.classCM.getSelectedItem());
                    user.setUniName(a.uniNameTF.getText());
                    user.setUniId(a.uniIdTF.getText());

                    int i;
                    for (i = 0; i < a.t.size(); i++) {
                        if (a.t.get(i).getName().equals(a.Department.getSelectedItem())) {
                            break;
                        }
                    }

                    user.setDepartment(a.t.get(i));

                } else if (acctTypeCB.getSelectedIndex() == 1) {

                    user.setUnivirsity(c.uniNameTF.getText());
                    user.setVerified(BigInteger.ZERO);
                } else {

                    user.setJobTitle(b.jTitleTF.getText());
                     user.setVerified(BigInteger.ZERO);
                }

                em.persist(user);
                em.getTransaction().commit();
                em.close();
                emf.close();

   

        }
        
        this.dispose();

}
catch(Exception ex){
JOptionPane.showMessageDialog(this, "please check your input ");
}
    }//GEN-LAST:event_signupBTNMouseClicked

     public static String getMd5(String input) 
    { 
        try { 
  
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    
    }
        
    private void signupLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLBLMouseClicked
        // TODO add your handling code here:

        if (checkEmptyFields()) {
            checkLBL.setText("Please fill all the fields");
        } else if (!checkUsername(usernameTF.getText())) {
            checkLBL.setText("Please choose a valid username");
        } else if (checkPasswordConfirmation()) {
            checkLBL.setText("The passwords don't match");
        } else {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            char g;
            if (gender.getSelectedIndex() == 0) {
                g = 'M';
            } else {
                g = 'F';
            }

            Puser user = new Puser(usernameTF.getText(), fNameTF.getText(), lNameTF.getText(), g, birthdateJDC.getDate(),
                    Arrays.toString(passwordTF.getPassword()), (String) acctTypeCB.getSelectedItem());
            user.setEmail(Email.getText());

            if ("Student".equals(user.getType())) {
                user.setClass1((String) a.classCM.getSelectedItem());
                user.setUniName(a.uniNameTF.getText());
                user.setUniId(a.uniIdTF.getText());
                //     user.setDepartment(a.Department.getSelectedItem());
            }
            if ("Acamemic instructo".equals(user.getType())) {
                user.setUnivirsity(c.uniNameTF.getText());
//           
            }
            if ("non-academic instructor".equals(user.getType())) {
                user.setJobTitle(b.jTitleTF.getText());

            }

            em.persist(user);
            em.getTransaction().commit();

            em.close();
            emf.close();

            //  
        }

        //this.dispose();

    }//GEN-LAST:event_signupLBLMouseClicked

    private void passConfirmTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passConfirmTFFocusLost
        // TODO add your handling code here:
        if (checkPasswordConfirmation()) {
            passwordCheckLBL.setText("Passwords don't match");
            passwordCheckLBL.setForeground(new Color(188, 16, 21));
        } else {
            passwordCheckLBL.setText("Passwords match");
            passwordCheckLBL.setForeground(new Color(12, 166, 33));
        }
    }//GEN-LAST:event_passConfirmTFFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        prog.login = new login();
        prog.login.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    //to be modified
    public boolean checkUsername(String username) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
try{
      if(  em.find(Puser.class, usernameTF.getText()).equals(null))
          return true;
}
catch(NullPointerException x){
    em.close();
        emf.close();

    return true;
}
        em.close();
        emf.close();

        return false;
    }

    public boolean checkEmptyFields() {
        if (fNameTF.getText().equals("")) {
            return true;
        }
        if (lNameTF.getText().equals("")) {
            return true;
        }
        if (usernameTF.getText().equals("")) {
            return true;
        }
        if (passwordTF.getText().equals("")) {
            return true;
        }
        if (passConfirmTF.getText().equals("")) {
            return true;
        }
        if (birthdateJDC.getDate() == null) {
            return true;
        }
        int i = acctTypeCB.getSelectedIndex();
        switch (i) {
            case 0:
                if (a.checkEmptyFields()) {
                    return true;
                }
                break;
            case 1:
                if (c.checkEmptyFields()) {
                    return true;
                }
                break;
            case 2:
                if (b.checkEmptyFields()) {
                    return true;
                }
                break;
        }
        return false;
    }

    public boolean checkPasswordConfirmation() {
        return !new String(passwordTF.getPassword()).equals(new String(passConfirmTF.getPassword()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> acctTypeCB;
    private com.toedter.calendar.JDateChooser birthdateJDC;
    private javax.swing.JLabel checkLBL;
    private javax.swing.JTextField fNameTF;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.ButtonGroup group1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lNameTF;
    private javax.swing.JPanel main;
    private javax.swing.JPasswordField passConfirmTF;
    private javax.swing.JLabel passwordCheckLBL;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel signupBTN;
    private javax.swing.JLabel signupLBL;
    private javax.swing.JLabel usernameCheckLBL;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
