
package calendar;

import database.Event;
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


public class EditEventFrame extends javax.swing.JFrame {

    public EditEventFrame(Event ev) {
        initComponents();
        this.ev = ev;
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Add Event");
        setupFrame();
    }

    private EditEventFrame() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesTA = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        notifyCB = new javax.swing.JCheckBox();
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
        nTimeCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel1.setText("Edit Event");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        notesTA.setColumns(20);
        notesTA.setRows(5);
        jScrollPane1.setViewportView(notesTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 296, 119));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 10));

        notifyCB.setBackground(new java.awt.Color(255, 255, 255));
        notifyCB.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
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
        jPanel1.add(notifyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 240, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel2.setText("Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        jPanel1.add(dateDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, 30));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jLabel3.setText("Time");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        JSpinner.DateEditor de=new JSpinner.DateEditor(timeSpinner,"HH:mm");
        timeSpinner.setEditor(de);
        jPanel1.add(timeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 240, 30));

        editTxtLbl.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        editTxtLbl.setForeground(new java.awt.Color(255, 255, 255));
        editTxtLbl.setText("OK");
        jPanel1.add(editTxtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        editLbl.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        editLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/Drawing(1).png"))); // NOI18N
        editLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLblMouseClicked(evt);
            }
        });
        jPanel1.add(editLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 220, 80));

        checkLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLbl.setForeground(new java.awt.Color(238, 12, 21));
        jPanel1.add(checkLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 180, 20));

        nTimeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 day before", "2 days before", "3 days before", "1 week before ", "2 weeks before" }));
        jPanel1.add(nTimeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notifyCBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_notifyCBStateChanged

        nTimeCB.setVisible(notifyCB.isSelected());
        
    }//GEN-LAST:event_notifyCBStateChanged

    private void notifyCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyCBActionPerformed

    }//GEN-LAST:event_notifyCBActionPerformed

    private void editLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLblMouseClicked

        if (nameTF.getText().equals("")) {
            checkLbl.setText("The Event must have a name");
            return;
        }
        updateEvent();
        //update into database
    }//GEN-LAST:event_editLblMouseClicked

    public void updateEvent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Event e = em.find(Event.class, ev.getEid());
        e.setName(nameTF.getText());
        e.setDescription(notesTA.getText());
        Date date = dateDC.getDate();
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

        home.user.getEventCollection().remove(e);
        home.user.getEventCollection().add(e);

        em.getTransaction().commit();

        em.close();
        emf.close();
        prog.home.alterpanel.removeAll();
        prog.home.alterpanel.revalidate();
        prog.home.alterpanel.repaint();
        prog.home.alterpanel.add(new CalendarPnl());
        this.dispose();

    }
    
    public void setupFrame() {
        nameTF.setText(ev.getName());
        notesTA.setText(ev.getDescription());
        dateDC.setDate(ev.getTime());
        timeSpinner.setValue(ev.getTime());
        if (ev.getNF() == BigInteger.ONE) {
            notifyCB.setSelected(true);
            Calendar c1=Calendar.getInstance();
            Calendar c2=Calendar.getInstance();
            c1.setTime(ev.getTime());
            c2.setTime(ev.getNTime());
            switch(c1.get(Calendar.DAY_OF_YEAR)-c2.get(Calendar.DAY_OF_YEAR)){
                case 1:nTimeCB.setSelectedIndex(0);
                       break;
                case 2:nTimeCB.setSelectedIndex(1);
                       break;
                case 3:nTimeCB.setSelectedIndex(2);
                       break;
                case 7:nTimeCB.setSelectedIndex(3);
                       break;
                case 14:nTimeCB.setSelectedIndex(4);
                       break;    
            }
        }

    }

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
            java.util.logging.Logger.getLogger(EditEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEventFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEventFrame().setVisible(true);
            }
        });
    }

    private Event ev;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkLbl;
    private com.toedter.calendar.JDateChooser dateDC;
    private javax.swing.JLabel editLbl;
    private javax.swing.JLabel editTxtLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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
