
package calendar;

import database.Event;
import calendar.AddEventFrame;
import calendar.EventPnl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import study.assistant.home;


public class CalendarPnl extends javax.swing.JPanel {

    public CalendarPnl() {
        initComponents();
        updateEventsPnl();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addEventLbl = new javax.swing.JLabel();
        eventsPnl = new javax.swing.JPanel();
        nextPageLbl = new javax.swing.JLabel();
        previousPageLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel1.setText("Calendar");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        addEventLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addEventLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/add.png"))); // NOI18N
        addEventLbl.setText("Add event ");
        addEventLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEventLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addEventLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEventLblMouseClicked(evt);
            }
        });
        add(addEventLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        eventsPnl.setBackground(new java.awt.Color(254, 254, 254));
        eventsPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventsPnlMouseClicked(evt);
            }
        });
        eventsPnl.setLayout(new java.awt.GridLayout(2, 3, 10, 5));
        add(eventsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 850, 470));

        nextPageLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPageLblMouseClicked(evt);
            }
        });
        add(nextPageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 40, 30));

        previousPageLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousPageLblMouseClicked(evt);
            }
        });
        add(previousPageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 40, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void addEventLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEventLblMouseClicked
        
        AddEventFrame f=new AddEventFrame();
        f.setLocationRelativeTo(this);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setVisible(true);
    }//GEN-LAST:event_addEventLblMouseClicked

    private void eventsPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsPnlMouseClicked
        
    }//GEN-LAST:event_eventsPnlMouseClicked

    private void nextPageLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPageLblMouseClicked
        page++;
        eventsPnl.removeAll();
        eventsPnl.revalidate();
        eventsPnl.repaint();
        updateEventsPnl();
    }//GEN-LAST:event_nextPageLblMouseClicked

    private void previousPageLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousPageLblMouseClicked
        if(page!=1){
        page--;
        eventsPnl.removeAll();
        eventsPnl.revalidate();
        eventsPnl.repaint();
        updateEventsPnl();
        }
    }//GEN-LAST:event_previousPageLblMouseClicked

    public void updateEventsPnl(){
        
        Collection<Event> list = home.user.getEventCollection();
        List events = new ArrayList(list);
        
        if(events.size()>6*page){
            
            nextPageLbl.setIcon(new ImageIcon(getClass().getResource("/photos/right-arrow_1.png")));
            nextPageLbl.enable();
        }
        else{
            nextPageLbl.setIcon(null);
            nextPageLbl.disable();
        }
        if(page!=1){
            previousPageLbl.setIcon(new ImageIcon(getClass().getResource("/photos/left-arrow.png")));
            previousPageLbl.enable();
        }
        else{
            previousPageLbl.setIcon(null);
            previousPageLbl.disable();
        }
        for (int i = 0; i < 6; i++) {
            if(i+6*(page-1)<events.size())
                eventsPnl.add(new EventPnl((Event) events.get(i+6*(page-1))));
            else
                eventsPnl.add(new JPanel());
            eventsPnl.revalidate();
        }
        
        
    }
    private int page=1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addEventLbl;
    private javax.swing.JPanel eventsPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nextPageLbl;
    private javax.swing.JLabel previousPageLbl;
    // End of variables declaration//GEN-END:variables
}
