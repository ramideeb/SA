package ToDoList;

import database.Puser;
import database.Task;
import calendar.EditEventFrame;
import database.Course;
import database.CoursesSelected;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

public class AddTaskFrame extends javax.swing.JFrame {


    public AddTaskFrame(Puser user) {


    }

    public AddTaskFrame() {
        initComponents();

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Add Task");
        
       Collection<CoursesSelected> c= home.user.getCoursesSelectedCollection();
       
       for(CoursesSelected a: c){
        course.addItem(a.getCourseId().getName());
           
       }
       mediumRB.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        addTxtLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Date d=new Date();
        SpinnerDateModel sm=new SpinnerDateModel(d,null,null,Calendar.HOUR_OF_DAY);
        timeSpinner = new javax.swing.JSpinner(sm);
        addLbl = new javax.swing.JLabel();
        checkLbl = new javax.swing.JLabel();
        mediumRB = new javax.swing.JRadioButton();
        highRB = new javax.swing.JRadioButton();
        lowRB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        buttonGroup1.add(lowRB);
        buttonGroup1.add(mediumRB);
        buttonGroup1.add(highRB);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTxtLbl.setFont(new java.awt.Font("DejaVu Sans Light", 0, 24)); // NOI18N
        addTxtLbl.setForeground(new java.awt.Color(255, 255, 255));
        addTxtLbl.setText("Add");
        addTxtLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTxtLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTxtLblMouseClicked(evt);
            }
        });
        jPanel3.add(addTxtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        notesTA.setColumns(20);
        notesTA.setRows(5);
        jScrollPane1.setViewportView(notesTA);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 296, 119));

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel5.setText("Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTFKeyTyped(evt);
            }
        });
        jPanel3.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 230, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel2.setText("Date");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        dateChooser.setBackground(new java.awt.Color(255, 255, 255));
        dateChooser.setMaxSelectableDate(new java.util.Date(1704060000000L));
        dateChooser.setMinSelectableDate(new java.util.Date(1514757600000L));
        jPanel3.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 230, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel3.setText("Note");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        JSpinner.DateEditor de=new JSpinner.DateEditor(timeSpinner,"HH:mm");
        timeSpinner.setEditor(de);
        jPanel3.add(timeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 230, -1));

        addLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        addLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLblMouseClicked(evt);
            }
        });
        jPanel3.add(addLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 220, 60));

        checkLbl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(checkLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 310, 20));

        mediumRB.setBackground(new java.awt.Color(255, 255, 255));
        mediumRB.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        mediumRB.setText("medium");
        mediumRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumRBActionPerformed(evt);
            }
        });
        jPanel3.add(mediumRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        highRB.setBackground(new java.awt.Color(255, 255, 255));
        highRB.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        highRB.setText("high");
        jPanel3.add(highRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        lowRB.setBackground(new java.awt.Color(255, 255, 255));
        lowRB.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        lowRB.setText("low");
        jPanel3.add(lowRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel4.setText("Priority");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel6.setText("Course");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel8.setText("Time");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        course.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 230, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 390, 580));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Add Task");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/s.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLblMouseClicked
         if(checkFields()){
            checkLbl.setText("Please fill all the fields");
            return;  
        }
        addTask();
        JOptionPane.showMessageDialog(this,"Task added");
        this.dispose();
    }//GEN-LAST:event_addLblMouseClicked

    private void nameTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyTyped

        if (nameTF.getText().length() > 21) {
            evt.consume();
        }
    }//GEN-LAST:event_nameTFKeyTyped

    private void addTxtLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTxtLblMouseClicked
        if(checkFields()){
            checkLbl.setText("Please fill all the fields");
            return;  
        }

        addTask();
        JOptionPane.showMessageDialog(this,"Task added");
        this.dispose();
    }//GEN-LAST:event_addTxtLblMouseClicked

    private void mediumRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mediumRBActionPerformed

    //add task sequence
    public void addTask() {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Task t = new Task();
        //generate id
        t.setName(nameTF.getText());

        t.setNote(notesTA.getText());

        Date date = dateChooser.getDate();

        Date d = null;

        try {
            d = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ YYYY").parse(timeSpinner.getValue().toString());
        } catch (ParseException ex) {
            Logger.getLogger(EditEventFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        
        t.setUsername(home.user);
        String jpql;
        
        jpql = "SELECT c FROM Course c WHERE c.name=" + "\"" + course.getSelectedItem() + "\"";
        
        Query query = em.createQuery(jpql);
        Course selected = (Course) query.getSingleResult();
        
        t.setCourse(selected);
        
     
        
        t.setTid(getNextSequenceValue().toPlainString());
        em.persist(t);
     
        home.user.getTaskCollection().add(t);
        
        em.getTransaction().commit();  
       
               
        em.close();
        emf.close();

 

          prog.home . alterpanel.removeAll();
            prog.home . alterpanel.repaint();
   prog.home .alterpanel.revalidate();
       prog.home . alterpanel.add(new toDO());
    }

    /**
     * @param args the command line arguments
     */
    public static BigDecimal getNextSequenceValue() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Query q = em.createNativeQuery("SELECT TASK_SEQ.NEXTVAL FROM DUAL");

        BigDecimal z = (java.math.BigDecimal) q.getSingleResult();
        em.close();
        emf.close();

        return z;

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
            java.util.logging.Logger.getLogger(AddTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTaskFrame( home.user).setVisible(true);
            }
        });
    }

    public boolean checkFields() {
        if (nameTF.getText().equals("")) {
            return true;
        }
        if(dateChooser.getDate()==null)
            return true;
        if (!(lowRB.isSelected()||mediumRB.isSelected()||highRB.isSelected()))
                return true;
        return false;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLbl;
    private javax.swing.JLabel addTxtLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel checkLbl;
    private javax.swing.JComboBox<String> course;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JRadioButton highRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lowRB;
    private javax.swing.JRadioButton mediumRB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextArea notesTA;
    private javax.swing.JSpinner timeSpinner;
    // End of variables declaration//GEN-END:variables
}
