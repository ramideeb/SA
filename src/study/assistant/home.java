package study.assistant;

import database.Department;
import database.Puser;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import calendar.CalendarPnl;
import courses.cources;
import mainpanels.home1;
import notes.notes;
import mainpanels.settings;
import ToDoList.toDO;
import database.Course;
import database.Event;
import database.Note;
import database.Task;
import static study.assistant.StudyAssistant.prog;


public class home extends javax.swing.JFrame {

    
    static public Puser user;

    
    
    public Vector<Department> Departments;


    
    
    public home() {
        initComponents();
        alterpanel.add(new home1());
    }

    
    
    
   

    public home(Puser user) {

        
        
        initComponents();
        home.user = user;
        alterpanel.removeAll();
        alterpanel.add(new home1());
        usernameL.setText( home.user.getUsername());
        FnameL.setText( home.user.getFname() + " " + home.user.getLname());
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        String jpql;
        jpql = "SELECT d FROM Department d";
        Query query = em.createQuery(jpql);
        Departments = new Vector<Department>();
        Departments = (Vector<Department>) query.getResultList();
        em.close();
        emf.close();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usernameL = new javax.swing.JLabel();
        FnameL = new javax.swing.JLabel();
        noteL = new javax.swing.JLabel();
        homeL = new javax.swing.JLabel();
        calendarL = new javax.swing.JLabel();
        courseL = new javax.swing.JLabel();
        rodoL = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        alterpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(177, 8, 55));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 920, 20));

        jPanel2.setBackground(new java.awt.Color(47, 47, 47));

        usernameL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        usernameL.setForeground(new java.awt.Color(254, 254, 254));
        usernameL.setText("Username");

        FnameL.setForeground(new java.awt.Color(254, 254, 254));
        FnameL.setText("Full name");

        noteL.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        noteL.setForeground(new java.awt.Color(254, 254, 254));
        noteL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/edit.png"))); // NOI18N
        noteL.setText("    Notes");
        noteL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noteLMouseClicked(evt);
            }
        });

        homeL.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        homeL.setForeground(new java.awt.Color(254, 254, 254));
        homeL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/icon.png"))); // NOI18N
        homeL.setText("    Home");
        homeL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLMouseClicked(evt);
            }
        });

        calendarL.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        calendarL.setForeground(new java.awt.Color(254, 254, 254));
        calendarL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/calendar.png"))); // NOI18N
        calendarL.setText("     Calendar");
        calendarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarLMouseClicked(evt);
            }
        });

        courseL.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        courseL.setForeground(new java.awt.Color(254, 254, 254));
        courseL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/notebook.png"))); // NOI18N
        courseL.setText("     Courses");
        courseL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                courseLMousePressed(evt);
            }
        });

        rodoL.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        rodoL.setForeground(new java.awt.Color(254, 254, 254));
        rodoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/to-do.png"))); // NOI18N
        rodoL.setText("    TO do list");
        rodoL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rodoL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rodoLMouseClicked(evt);
            }
        });

        logout.setBackground(new java.awt.Color(254, 254, 254));
        logout.setForeground(new java.awt.Color(254, 254, 254));
        logout.setText("log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        settings.setForeground(new java.awt.Color(254, 254, 254));
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/settings.png"))); // NOI18N
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/graduation.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(photo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameL)
                    .addComponent(FnameL))
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(courseL)
                                .addComponent(homeL)
                                .addComponent(calendarL)
                                .addComponent(noteL))
                            .addComponent(rodoL))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(settings)
                .addGap(54, 54, 54)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(usernameL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FnameL)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(photo)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(homeL)
                .addGap(32, 32, 32)
                .addComponent(noteL)
                .addGap(32, 32, 32)
                .addComponent(courseL)
                .addGap(35, 35, 35)
                .addComponent(calendarL)
                .addGap(33, 33, 33)
                .addComponent(rodoL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(settings))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        alterpanel.setBackground(new java.awt.Color(254, 254, 254));
        getContentPane().add(alterpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 920, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLMouseClicked
        alterpanel.removeAll();
        alterpanel.revalidate();
        alterpanel.repaint();
        alterpanel.add(new home1());
    }//GEN-LAST:event_homeLMouseClicked

    private void rodoLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rodoLMouseClicked
        alterpanel.removeAll();
        alterpanel.revalidate();
        alterpanel.repaint();
        alterpanel.add(new toDO());
    }//GEN-LAST:event_rodoLMouseClicked

    private void courseLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseLMousePressed
        alterpanel.removeAll();
        alterpanel.revalidate();
        alterpanel.repaint();
        alterpanel.add(new cources());
    }//GEN-LAST:event_courseLMousePressed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        prog.login=new login();
        prog.login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        settings s = new settings( home.user, Departments);
        s.setResizable(false);
        s.setLocationRelativeTo(this);
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.setTitle("Settings");
        s.setVisible(true);
    }//GEN-LAST:event_settingsMouseClicked

    private void calendarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarLMouseClicked
        alterpanel.removeAll();
        alterpanel.revalidate();
        alterpanel.repaint();
        alterpanel.add(new CalendarPnl());
    }//GEN-LAST:event_calendarLMouseClicked

    private void noteLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteLMouseClicked
        alterpanel.removeAll();
        alterpanel.revalidate();
        alterpanel.repaint();
        alterpanel.add(new notes());
    }//GEN-LAST:event_noteLMouseClicked

    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new home().setVisible(true);

            }
        });
    }

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FnameL;
    public javax.swing.JPanel alterpanel;
    private javax.swing.JLabel calendarL;
    private javax.swing.JLabel courseL;
    private javax.swing.JLabel homeL;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel noteL;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel rodoL;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel usernameL;
    // End of variables declaration//GEN-END:variables
}
