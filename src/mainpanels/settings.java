package mainpanels;

import database.Department;
import database.Puser;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;
import study.assistant.signupp.signup;


public class settings extends javax.swing.JFrame {

    
    private static final String EMAIL_PATTERN = 
    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    Vector<Department> d;
    
    public settings(Puser user ,Vector<Department> d) {
        
        initComponents();
        this.d=d;
      
        email.setText( home.user.getEmail());
        Fname.setText( home.user.getFname());
        Lname.setText( home.user.getLname());
        if( home.user.getGender()=='M')
        gender.setSelectedIndex(0);
        else
        gender.setSelectedIndex(1);

        date.setDate( home.user.getBirthdate());
        
         for(int i=0;i<d.size();i++){
             dd.addItem(d.get(i).getName());
         }
         dd.setSelectedItem( home.user.getDepartment());

        
        
        
        
        
        
    }

   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        dd = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        passc = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel1.setText("First name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 71, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel2.setText("gender");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 178, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel3.setText("Last  name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 122, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel4.setText("Birth date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 224, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel5.setText("New Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 287, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel6.setText("Confirm password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 343, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel8.setText("Department");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 400, -1, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 12, 196, 33));
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 63, 196, 33));
        jPanel1.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 114, 196, 33));

        jPanel1.add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 395, 196, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 173, 196, -1));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 218, 196, -1));

        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Save");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 212, 66));
        jPanel1.add(passc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, 40));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 200, 40));

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    boolean cheakF(){
    
    if (!email.getText().matches(EMAIL_PATTERN)) {
            return false;
    }
    else if(Fname.getText().equals("")||Lname.getText().equals("")||email.getText().equals("")){
                return false;
    }
    if(!(pass.getText().equals(passc.getText())))
        return false;
    
    return true;
    }
      
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        if(!cheakF())
            JOptionPane.showMessageDialog(this, "please ensure your inputs ");
        else
            {
            updateuser();
            prog.home.setEnabled(true);
         }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         if(!cheakF())
            JOptionPane.showMessageDialog(this, "please ensure your inputs ");
        else
         {
            updateuser();
            prog.home.setEnabled(true);
         }
         
    }//GEN-LAST:event_jLabel9MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new settings( home.user ,  prog.home.Departments ).setVisible(true);
            }
        });
    }

    void updateuser(){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU"); 
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
            
        Puser user = em.find(Puser.class,  home.user.getUsername());
           
        user.setEmail(email.getText());
        user.setFname(Fname.getText());
        user.setLname(Lname.getText());
        
        if(gender.getSelectedIndex()==0)
            user.setGender('M');
        else
            user.setGender('F');

        user.setBirthdate(date.getDate());
        
        
        
        if(pass.getText().equals("")){
                user.setPassword(home.user.getPassword());

        }
        else{
        user.setPassword(signup.getMd5(new String (pass.getPassword()))); 
        
        }
        
        
        int i;
         for(i=0;i<d.size();i++){
             if(d.get(i).getName()==dd.getSelectedItem())
                 break;
         }
         user.setDepartment(d.get(i));
    
        
  
         
           em.getTransaction().commit();
            
            home.user=em.find(Puser.class,  home.user.getUsername());
           prog.home=new home(home.user);
           prog.home.revalidate();
           
           
           em.close();
           emf.close();
           this.dispose();
           
           
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JComboBox<String> dd;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
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
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField passc;
    // End of variables declaration//GEN-END:variables
}
