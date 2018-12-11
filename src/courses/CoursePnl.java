/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

import database.Course;
import database.CoursesSelected;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

/**
 *
 * @author masri
 */
public class CoursePnl extends javax.swing.JPanel {

    /**
     * Creates new form CoursePnl
     */
    public CoursePnl(Course cr) {
        initComponents();
        c=cr;
        updatePnl();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/folder(2).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        nameLbl.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLbl.setText("Electrical ");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/delete(2).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        prog.home.alterpanel.removeAll();
        prog.home.alterpanel.revalidate();
        prog.home.alterpanel.repaint();
        prog.home.alterpanel.add(new CoursePanel(c));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
   EntityManager em = emf.createEntityManager();
   em.getTransaction().begin();
  List<CoursesSelected> t= new ArrayList <CoursesSelected>(home.user.getCoursesSelectedCollection());
  CoursesSelected is = null;
  for(CoursesSelected a:t)
      if(a.getCourseId().getId()==c.getId())
          is =a;
  {
  
  }
   em.remove(em.find(CoursesSelected.class, is.getSeq()));
   home.user.getCoursesSelectedCollection().remove(is);
   
    prog.home.alterpanel.removeAll();
        prog.home.alterpanel.revalidate();
        prog.home.alterpanel.repaint();
        prog.home.alterpanel.add(new cources());
   em.getTransaction().commit();
   em.close();
 
   emf.close();
        
    }//GEN-LAST:event_jLabel2MouseClicked
   public void updatePnl(){
       nameLbl.setText(c.getName());
       
   }
    private Course c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables
}
