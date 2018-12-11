package calendar;

import static ToDoList.AddTaskFrame.getNextSequenceValue;
import ToDoList.toDO;
import database.Course;
import database.CoursesSelected;
import database.Event;
import database.Puser;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

public class AddEventFrame extends javax.swing.JFrame {

    public AddEventFrame() {
        initComponents();
        nTimeCB.setVisible(false);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Add Event");
   Collection<CoursesSelected> c= home.user.getCoursesSelectedCollection();
       
       for(CoursesSelected a: c){
        course.addItem(a.getCourseId().getName());
           
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Date d=new Date();
        SpinnerDateModel sm=new SpinnerDateModel(d,null,null,Calendar.HOUR_OF_DAY);
        timeSpinner = new javax.swing.JSpinner(sm);
        notifyCB = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addTxtLbl = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        nameTF = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTA = new javax.swing.JTextArea();
        addLbl = new javax.swing.JLabel();
        checkLbl = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        nTimeCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel2.setText("Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 30));

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel5.setText("Name*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));

        JSpinner.DateEditor de=new JSpinner.DateEditor(timeSpinner,"HH:mm");
        timeSpinner.setEditor(de);
        jPanel1.add(timeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 210, 30));

        notifyCB.setBackground(new java.awt.Color(255, 255, 255));
        notifyCB.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        notifyCB.setText("Notify me");
        notifyCB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                notifyCBStateChanged(evt);
            }
        });
        notifyCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyCBActionPerformed(evt);
            }
        });
        jPanel1.add(notifyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel3.setText("Time");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel1.setText("Add Event");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        addTxtLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addTxtLbl.setForeground(new java.awt.Color(255, 255, 255));
        addTxtLbl.setText("Add");
        addTxtLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTxtLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTxtLblMouseClicked(evt);
            }
        });
        jPanel1.add(addTxtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, 20));

        dateChooser.setMaxSelectableDate(new java.util.Date(1704060000000L));
        dateChooser.setMinSelectableDate(new java.util.Date(1514757600000L));
        jPanel1.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 210, 30));

        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTFKeyTyped(evt);
            }
        });
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 350, 10));

        notesTA.setColumns(20);
        notesTA.setRows(5);
        jScrollPane1.setViewportView(notesTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 296, 119));

        addLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        addLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLblMouseClicked(evt);
            }
        });
        jPanel1.add(addLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 220, 90));

        checkLbl.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(checkLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 230, 20));

        course.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 230, 30));

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel6.setText("Course");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        nTimeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 day before", "2 days before", "3 days before", "1 week before ", "2 weeks before" }));
        jPanel1.add(nTimeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 430, 560));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/event.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, -1, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notifyCBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_notifyCBStateChanged
        nTimeCB.setVisible(notifyCB.isSelected());
        
    }//GEN-LAST:event_notifyCBStateChanged

    private void notifyCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyCBActionPerformed

    }//GEN-LAST:event_notifyCBActionPerformed

    private void addLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLblMouseClicked
        if (checkFields()) {
            checkLbl.setText("Please fill all the fields");
            return;
        }

        addEvent();
        JOptionPane.showMessageDialog(this, "Event added");
        this.dispose();
    }//GEN-LAST:event_addLblMouseClicked

    private void nameTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyTyped

        if (nameTF.getText().length() > 21) {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_nameTFKeyTyped

    private void addTxtLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTxtLblMouseClicked
        if (checkFields()) {
            checkLbl.setText("Please fill all the fields");
            return;
        }

        addEvent();
        JOptionPane.showMessageDialog(this, "Event added");
        this.dispose();
    }//GEN-LAST:event_addTxtLblMouseClicked

    public void addEvent() {

        Event e = new Event();
        e.setName(nameTF.getText());
        e.setDescription(notesTA.getText());//the word notes needs to be added
        Date date = dateChooser.getDate();
        Date d = null;
        try {
            d = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ YYYY").parse(timeSpinner.getValue().toString());
        } catch (ParseException ex) {
            Logger.getLogger(EditEventFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        date.setHours(d.getHours());
        date.setMinutes(d.getMinutes());
        e.setTime(date);
        Calendar c=Calendar.getInstance();
        c.setTime(date);
        if (notifyCB.isSelected()) {
            e.setNF(BigInteger.ONE);
            switch(nTimeCB.getSelectedIndex()){
                case 0:c.set(Calendar.DAY_OF_YEAR,c.get(Calendar.DAY_OF_YEAR)-1);
                       break;
                case 1:c.set(Calendar.DAY_OF_YEAR,c.get(Calendar.DAY_OF_YEAR)-2);
                       break;
                case 2:c.set(Calendar.DAY_OF_YEAR,c.get(Calendar.DAY_OF_YEAR)-3);
                       break;
                case 3:c.set(Calendar.DAY_OF_YEAR,c.get(Calendar.DAY_OF_YEAR)-7);
                       break;
                case 4:c.set(Calendar.DAY_OF_YEAR,c.get(Calendar.DAY_OF_YEAR)-3);
                       break;
            }
            e.setNTime(c.getTime());
        } else {
            e.setNF(BigInteger.ZERO);
            e.setNTime(null);
        }
        EntityManager em = Persistence.createEntityManagerFactory("gitPU").createEntityManager();
        em.getTransaction().begin();
        e.setUsername(home.user);
        e.setEid(getNextSequenceValue().toPlainString());
        String jpql;
        
        jpql = "SELECT c FROM Course c WHERE c.name=" + "\"" + course.getSelectedItem() + "\"";
        
        Query query = em.createQuery(jpql);
        Course selected = (Course) query.getSingleResult();
        
        e.setCourse(selected);
        em.persist(e);
        home.user.getEventCollection().add(e);
        em.getTransaction().commit();
        em.close();

        prog.home.alterpanel.removeAll();
        prog.home.alterpanel.revalidate();
        prog.home.alterpanel.repaint();
        prog.home.alterpanel.add(new CalendarPnl());
        
        
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
            java.util.logging.Logger.getLogger(AddEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEventFrame().setVisible(true);
            }
        });
    }

    public boolean checkFields() {
        if (nameTF.getText().equals("")) {
            return true;
        }
        if (dateChooser.getDate() == null) {
            return true;
        }
        
        return false;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLbl;
    private javax.swing.JLabel addTxtLbl;
    private javax.swing.JLabel checkLbl;
    private javax.swing.JComboBox<String> course;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> nTimeCB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextArea notesTA;
    private javax.swing.JCheckBox notifyCB;
    private javax.swing.JSpinner timeSpinner;
    // End of variables declaration//GEN-END:variables
}
