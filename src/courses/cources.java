package courses;

import database.Course;
import database.Event;
import courses.CoursePnl;
import calendar.EventPnl;
import database.CoursesSelected;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

public class cources extends javax.swing.JPanel {

    public cources() {
        initComponents();
        updateCoursesPnl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        coursesPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nextPageLbl = new javax.swing.JLabel();
        previousPageLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/add.png"))); // NOI18N
        jLabel7.setText(" Add new course");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        coursesPnl.setBackground(new java.awt.Color(254, 254, 254));
        coursesPnl.setLayout(new java.awt.GridLayout(2, 3, 5, 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Courses");

        nextPageLbl.setText("next");
        nextPageLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageLblMouseClicked(evt);
            }
        });

        previousPageLbl.setText("previous");
        previousPageLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPageLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(242, 242, 242)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(coursesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(previousPageLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextPageLbl)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousPageLbl)
                    .addComponent(nextPageLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coursesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed

        if (prog.home.user.getType().equals("Student")) {

            addc p = new addc();
            p.setSize(251, 313);
            p.setLocationRelativeTo(this);
            p.setResizable(false);
            p.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            p.setVisible(true);
            
            

        } else {
            InsAddCourse p = new InsAddCourse(prog.home.user);

            p.setLocationRelativeTo(this);
            p.setResizable(false);
            p.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            p.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void nextPageLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageLblMouseClicked
        page++;
        coursesPnl.removeAll();
            coursesPnl.remove(this);
            coursesPnl.revalidate();
        updateCoursesPnl();
    }//GEN-LAST:event_nextPageLblMouseClicked

    private void previousPageLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPageLblMouseClicked
        page--;
        coursesPnl.removeAll();
            coursesPnl.remove(this);
            coursesPnl.revalidate();
        updateCoursesPnl();
    }//GEN-LAST:event_previousPageLblMouseClicked

    private int page = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel coursesPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nextPageLbl;
    private javax.swing.JLabel previousPageLbl;
    // End of variables declaration//GEN-END:variables

    private void updateCoursesPnl() {
        EntityManager em=Persistence.createEntityManagerFactory("gitPU").createEntityManager();
        em.getTransaction().begin();
        ArrayList<CoursesSelected> list =new ArrayList (home.user.getCoursesSelectedCollection());//import events from database
        if (list.size() > 6 * page) {
            nextPageLbl.setIcon(new ImageIcon(getClass().getResource("/photos/right-arrow_1.png")));
            nextPageLbl.enable();
        }
        else{
            nextPageLbl.setIcon(null);
            nextPageLbl.disable();
        }
        if (page != 1) {
            previousPageLbl.setIcon(new ImageIcon(getClass().getResource("/photos/left-arrow.png")));
            previousPageLbl.enable();
        }
        else{
            previousPageLbl.setIcon(null);
            previousPageLbl.disable();
        }
        for (int i = 0; i < 6; i++) {
            if (i + 6 * (page - 1) < list.size()) {
                coursesPnl.add(new CoursePnl(list.get(i+6*(page-1)).getCourseId()));
            } else {
                coursesPnl.add(new JPanel());
            }
            
            coursesPnl.revalidate();
        }
    }
}
