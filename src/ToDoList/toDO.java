package ToDoList;

import database.Task;
import ToDoList.AddTaskFrame;
import ToDoList.TaskPnl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;


public class toDO extends javax.swing.JPanel {

    

    public toDO() {
        initComponents();
        updateTasksPnl();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tasksPnl = new javax.swing.JPanel();
        downwardLbl = new javax.swing.JLabel();
        upwardLbl = new javax.swing.JLabel();
        addEventLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("To do list");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(63, 63, 63));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 10));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 99, -1, -1));

        tasksPnl.setBackground(new java.awt.Color(255, 255, 255));
        tasksPnl.setLayout(new java.awt.GridLayout(3, 1, 0, 20));
        add(tasksPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 80, 680, 450));

        downwardLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downwardLblMouseClicked(evt);
            }
        });
        add(downwardLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, -1));

        upwardLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upwardLblMouseClicked(evt);
            }
        });
        add(upwardLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        addEventLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addEventLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/add.png"))); // NOI18N
        addEventLbl.setText("Add task ");
        addEventLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEventLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addEventLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEventLblMouseClicked(evt);
            }
        });
        add(addEventLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void downwardLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downwardLblMouseClicked
        
        page++;
        tasksPnl.removeAll();
        tasksPnl.revalidate();
        tasksPnl.repaint();
        updateTasksPnl();
        
    }//GEN-LAST:event_downwardLblMouseClicked

    private void upwardLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upwardLblMouseClicked
        if(page!=1){
        page--;
        tasksPnl.removeAll();
        tasksPnl.revalidate();
        tasksPnl.repaint();
        updateTasksPnl();
        }
    }//GEN-LAST:event_upwardLblMouseClicked

    
    private void addEventLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEventLblMouseClicked
        AddTaskFrame f = new AddTaskFrame();
        f.setLocationRelativeTo(this);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setVisible(true);
    }//GEN-LAST:event_addEventLblMouseClicked
   
    
    public void updateTasksPnl() {

        Collection<Task> list = home.user.getTaskCollection();
        
        
        List tasks= new ArrayList(list);
        Collections.reverse(tasks);
        
        if (tasks.size() > 3* page) {
            downwardLbl.setIcon(new ImageIcon(getClass().getResource("/photos/down-arrow.png")));
        }
        else{
            System.out.println("hello");
            downwardLbl.setIcon(null);
            downwardLbl.disable();
        }
        if (page != 1) {
            upwardLbl.setIcon(new ImageIcon(getClass().getResource("/photos/up_arrow.png")));
        }
        else{
            upwardLbl.setIcon(null);
            upwardLbl.disable();
        }

        for (int i=0;i<3;i++) {
            if (i + (page - 1) * 3 < tasks.size()) {
                tasksPnl.add(new TaskPnl((Task) tasks.get(i+3*(page-1))));
               } 
            else {
                tasksPnl.add(new JPanel());
            }
        }
        
    }
    
    private int page = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel addEventLbl;
    javax.swing.JLabel downwardLbl;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel tasksPnl;
    javax.swing.JLabel upwardLbl;
    // End of variables declaration//GEN-END:variables
}
