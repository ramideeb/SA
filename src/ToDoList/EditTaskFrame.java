package ToDoList;

import database.Puser;
import database.Task;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

public class EditTaskFrame extends javax.swing.JFrame {

    public EditTaskFrame(Task ts) {
        initComponents();

        t1 = ts;
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Edit Event");
        setupFrame();
    }

    private EditTaskFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTA = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateDC = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Date d=new Date();
        SpinnerDateModel sm=new SpinnerDateModel(d,null,null,Calendar.HOUR_OF_DAY);
        timeSpinner = new javax.swing.JSpinner(sm);
        editTxtLbl = new javax.swing.JLabel();
        editLbl = new javax.swing.JLabel();
        checkLbl = new javax.swing.JLabel();
        mediumRB = new javax.swing.JRadioButton();
        highRB = new javax.swing.JRadioButton();
        lowRB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        buttonGroup1.add(lowRB);
        buttonGroup1.add(mediumRB);
        buttonGroup1.add(highRB);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel1.setText("Edit Task");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        notesTA.setColumns(20);
        notesTA.setRows(5);
        jScrollPane1.setViewportView(notesTA);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 296, 119));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 350, 10));

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel2.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 69, 220, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel2.setText("Date");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));
        jPanel2.add(dateDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 109, 220, 30));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel3.setText("Time");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        JSpinner.DateEditor de=new JSpinner.DateEditor(timeSpinner,"HH:mm");
        timeSpinner.setEditor(de);
        jPanel2.add(timeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 220, 30));

        editTxtLbl.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        editTxtLbl.setForeground(new java.awt.Color(255, 255, 255));
        editTxtLbl.setText("OK");
        editTxtLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTxtLblMouseClicked(evt);
            }
        });
        jPanel2.add(editTxtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        editLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        editLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLblMouseClicked(evt);
            }
        });
        jPanel2.add(editLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 220, 70));

        checkLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLbl.setForeground(new java.awt.Color(238, 12, 21));
        jPanel2.add(checkLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 180, 20));

        mediumRB.setBackground(new java.awt.Color(255, 255, 255));
        mediumRB.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        mediumRB.setText("medium");
        jPanel2.add(mediumRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        highRB.setBackground(new java.awt.Color(255, 255, 255));
        highRB.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        highRB.setText("high");
        jPanel2.add(highRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        lowRB.setBackground(new java.awt.Color(255, 255, 255));
        lowRB.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        lowRB.setText("low");
        jPanel2.add(lowRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel4.setText("Priority");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLblMouseClicked

        if (checkFields()) {
            checkLbl.setText("please fill all the fields");
            return;
        }
        updateTask();
        //update into database
    }//GEN-LAST:event_editLblMouseClicked

    private void editTxtLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTxtLblMouseClicked
        if (checkFields()) {
            checkLbl.setText("The task must have a name and a priority");
            return;
        }
        
   
        updateTask();
        //update into database
    }//GEN-LAST:event_editTxtLblMouseClicked

    
    Task t1;
    
    public void updateTask() {
        try{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        
        Task t = em.find(Task.class, t1.getTid() );

        t.setName(nameTF.getText());        
        t.setNote(notesTA.getText());
        Date date = dateDC.getDate();
        Date d = null;
        try {
            d = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ YYYY").parse(timeSpinner.getValue().toString());
        } catch (ParseException ex) {
            Logger.getLogger(EditTaskFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        date.setHours(d.getHours());
        date.setMinutes(d.getMinutes());
        t.setDueTime(date);
        if (mediumRB.isSelected()) {
            t.setPriority("medium");
        } else if (highRB.isSelected()) {
            t.setPriority("high");
        } else {
            t.setPriority("low");
        }
        
        home.user.getTaskCollection().remove(t);
               home.user.getTaskCollection().add(t);

        em.getTransaction().commit();
            
        em.close();
        emf.close();
       prog.home . alterpanel.removeAll();
       prog.home .alterpanel.revalidate();
       prog.home . alterpanel.repaint();
       prog.home . alterpanel.add(new toDO());
        this.dispose();
        
        }
        catch(Exception e)
        {
            
        }
    }
    

    public void setupFrame() {
        nameTF.setText(t1.getName());
        notesTA.setText(t1.getNote());
        dateDC.setDate(t1.getDueTime());
        timeSpinner.setValue(t1.getDueTime());
        switch (t1.getPriority()) {
            case "high":
                highRB.setSelected(true);
                break;
            case "medium":
                mediumRB.setSelected(true);
                break;
            case "low":
                lowRB.setSelected(true);
                break;
        }

    }

    public boolean checkFields() {
       if (nameTF.getText().equals("")) {
            return true;
        }
        if(dateDC.getDate()==null)
            return true;
        if (!(lowRB.isSelected()||mediumRB.isSelected()||highRB.isSelected()))
                return true;
        return false;
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
            java.util.logging.Logger.getLogger(EditTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTaskFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel checkLbl;
    private com.toedter.calendar.JDateChooser dateDC;
    private javax.swing.JLabel editLbl;
    private javax.swing.JLabel editTxtLbl;
    private javax.swing.JRadioButton highRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton lowRB;
    private javax.swing.JRadioButton mediumRB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextArea notesTA;
    private javax.swing.JSpinner timeSpinner;
    // End of variables declaration//GEN-END:variables
}
