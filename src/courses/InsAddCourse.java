package courses;

import database.Course;
import database.Department;
import database.DepartmentPlan;
import database.Puser;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

public class InsAddCourse extends javax.swing.JFrame {

    Puser user;
    Vector<Department> t;

    public InsAddCourse(Puser user) {
        initComponents();
        this.user = user;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        String jpql;
        jpql = "SELECT d FROM Department d";
        Query query = em.createQuery(jpql);

        t = new Vector<Department>();

        t = (Vector<Department>) query.getResultList();
        DefaultListModel model = new DefaultListModel();

        Departments.setModel(model);

        for (int i = 0; i < t.size(); i++) {
            model.add(i, t.get(i).getName());
        }
        em.close();
        emf.close();

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
        jLabel8 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Departments = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        outline = new javax.swing.JTextField();
        book = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        credits = new javax.swing.JSlider();
        Level = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 35, -1, -1));

        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel3.setText("Description");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("Book URL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setText("Outline URL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setText("Credits");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel8.setText("type");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));
        jPanel1.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 193, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 193, -1));
        jPanel1.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 100, 193, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "University Mandatory", "Department Mandatory", "University Elective", "Department Elective" }));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 193, -1));

        jScrollPane1.setViewportView(Departments);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 193, 123));

        jLabel9.setText("Departments");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        jPanel1.add(outline, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 161, 193, -1));

        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        jPanel1.add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 216, 193, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 217, 73));

        credits.setMaximum(10);
        jPanel1.add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        Level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel1.add(Level, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 193, -1));

        jLabel11.setText("Level");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            Course c = new Course();

            c.setId(new BigDecimal(Integer.parseInt(id.getText())));

            c.setDescription(desc.getText());

            c.setName(name.getText());

            c.setCredits(BigInteger.valueOf(credits.getValue()));

            c.setType((String) type.getSelectedItem());

            c.setBook(book.getText());

            c.setOutline(outline.getText());

            c.setCourseLevel(BigInteger.valueOf(Integer.parseInt((String) Level.getSelectedItem())));

            c.setAdder(user);
            
            em.persist(c);

            //to add departments here roro 
             List selected= Departments.getSelectedValuesList();


            for (int i = 0; i < selected.size(); i++) {

             

                em.persist(new DepartmentPlan(getNextSequenceValue(),c,em.find(Department.class, selected.get(i))));

            }

            em.getTransaction().commit();
            em.close();
            emf.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ensure youre input please !! ");
            ex.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

   public static BigDecimal getNextSequenceValue() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Query q = em.createNativeQuery("SELECT DPLAN.NEXTVAL FROM DUAL");

        BigDecimal z = (java.math.BigDecimal) q.getSingleResult();
        em.close();
        emf.close();

        return z;

    }


    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookActionPerformed

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
            java.util.logging.Logger.getLogger(InsAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsAddCourse( home.user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Departments;
    private javax.swing.JComboBox<String> Level;
    private javax.swing.JTextField book;
    private javax.swing.JSlider credits;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField id;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField outline;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
