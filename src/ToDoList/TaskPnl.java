/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList;

import mainpanels.*;
import database.Task;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

/**
 *
 * @author rami
 */
public class TaskPnl extends javax.swing.JPanel {

    /**
     * Creates new form task
     */
    public TaskPnl(Task ts) {
        initComponents();
        t = ts;
        updatePanel();
    }

    void updatePanel() {

        title.setText(t.getName());
        priority.setText("Priority:" + t.getPriority());
        note.setText("Note:" + t.getNote());
        SimpleDateFormat format = new SimpleDateFormat("dd MMM HH:mm aa");
        dueTimeLbl.setText(format.format(t.getDueTime()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        priority = new javax.swing.JLabel();
        dueTimeLbl = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        cheak = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deleteLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        title.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(177, 8, 55));
        title.setText("do the digital homework");

        priority.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        priority.setText("priority : hight");

        dueTimeLbl.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        dueTimeLbl.setText("15 NOV 9:30");

        note.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        note.setText("Note : .................................................................................................");

        cheak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/circle-outline.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/settings(2).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        deleteLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/delete(1).png"))); // NOI18N
        deleteLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cheak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(note)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priority)
                                .addGap(58, 58, 58)
                                .addComponent(dueTimeLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(deleteLbl)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cheak)
                            .addComponent(title))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(priority))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(dueTimeLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(note))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(deleteLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        EditTaskFrame etf = new EditTaskFrame(t);
        etf.setSize(398, 520);
        etf.setLocationRelativeTo(null);
        etf.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void deleteLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLblMouseClicked
        // TODO add your handling code here:
        EntityManager em = Persistence.createEntityManagerFactory("gitPU").createEntityManager();
        em.getTransaction().begin();
        
        em.remove(em.find(Task.class, t.getTid()));
        
        home.user.getTaskCollection().remove(t);
        em.getTransaction().commit();
        em.close();

        prog.home.alterpanel.removeAll();
        prog.home.alterpanel.revalidate();
        prog.home.alterpanel.repaint();
        prog.home.alterpanel.add(new toDO());


    }//GEN-LAST:event_deleteLblMouseClicked

    private Task t;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cheak;
    private javax.swing.JLabel deleteLbl;
    private javax.swing.JLabel dueTimeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel note;
    private javax.swing.JLabel priority;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
