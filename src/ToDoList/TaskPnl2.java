/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDoList;

import mainpanels.*;
import database.Task;
import java.text.SimpleDateFormat;

/**
 *
 * @author rami
 */
public class TaskPnl2 extends javax.swing.JPanel {

    /**
     * Creates new form task
     */
    public TaskPnl2(Task ts) {
        initComponents();
        t=ts;
        updatePanel(t);
    }
    void updatePanel(Task t){
        SimpleDateFormat format=new SimpleDateFormat("dd MMM HH:mm");
        title.setText(t.getName());
        priority.setText("Priority : "+t.getPriority()==null?"":t.getPriority());
        if(t.getDueTime()!=null)
        dueTimeLbl.setText(format.format(t.getDueTime()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        priority = new javax.swing.JLabel();
        dueTimeLbl = new javax.swing.JLabel();
        cheak = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        title.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        title.setText("do the digital homework");

        priority.setText("priority : hight");

        dueTimeLbl.setText("15 NOV 9:30");

        cheak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/circle-outline.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cheak)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priority)
                        .addGap(18, 18, 18)
                        .addComponent(dueTimeLbl)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(cheak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priority)
                    .addComponent(dueTimeLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Task t;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cheak;
    private javax.swing.JLabel dueTimeLbl;
    private javax.swing.JLabel priority;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
