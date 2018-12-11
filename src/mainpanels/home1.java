
package mainpanels;
import ToDoList.TaskPnl;
import calendar.EventPnl;
import database.Event;
import database.Note;
import database.Task;
import java.awt.FlowLayout;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import notes.NotesPnl2;
import study.assistant.home;
import study.assistant.notification;


public class home1 extends javax.swing.JPanel {

  
    Vector<notification> nlist = new Vector<notification>();
    int npage=1;

    public home1() {
        initComponents();
        updateNotificationsPnl();
         updateEventsPnl();
         updateTasksPnl();
    }
    
    public void updateEventsPnl(){
        Vector<Event> e=new Vector<Event>(home.user.getEventCollection());
        if(e.size()!=0){
            eventsPnl.add(new EventPnl(e.get(0)));
        }
        
    }
    
    public void updateTasksPnl(){
        Vector<Task> t=new Vector<Task>(home.user.getTaskCollection());
        if(t.size()!=0){
            tasksPnl.add(new TaskPnl(t.get(0)));
        }
    }
    
    
    

    public void updateNotificationsPnl() {
        try{
        EntityManager em=Persistence.createEntityManagerFactory("gitPU").createEntityManager();
        em.getTransaction().begin();
        Query q=em.createQuery("SELECT e FROM Event e WHERE e.nF = 1 ");
        List<Event> notifiableEventsList =new ArrayList<Event>(home.user.getEventCollection());
        for(int i=0;i<notifiableEventsList.size();i++){
        if(notifiableEventsList.get(i).getNF()!= BigInteger.ONE)
        {
        notifiableEventsList.remove(notifiableEventsList.get(i));
        
        }else if(notifiableEventsList.get(i).getUsername()!= home.user){
            notifiableEventsList.remove(notifiableEventsList.get(i));
            
        
        }
            
            }
        
        ArrayList<Task> tasksList=new ArrayList<Task>(home.user.getTaskCollection());
       // ArrayList<Event> notifiableEventsList=new ArrayList<Event>(q.getResultList());
        SimpleDateFormat format=new SimpleDateFormat("dd MMM HH:mm aa");
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        for(Event e:notifiableEventsList){
            c2.setTime(e.getNTime());
            if(c1.get(Calendar.DAY_OF_YEAR)==c2.get(Calendar.DAY_OF_YEAR)){
                nlist.add(new notification(e.getName(),format.format(e.getTime())));
            }
        }
        for(Task t:tasksList){
            nlist.add(new notification(t.getName(),format.format(t.getDueTime())));
            
        }
        if(npage!=1){
            nLeftLbl.setIcon(new ImageIcon(getClass().getResource("/photos/back.png")));
            nLeftLbl.enable();
        }
        else{
            nLeftLbl.setIcon(null);
            nLeftLbl.disable();
        }
        if(npage==nlist.size()){
            nRightLbl.setIcon(null);
            nRightLbl.disable();
        }
        notificationsPnl.add(nlist.get(npage-1));
        notificationsPnl.removeAll();
        notificationsPnl.revalidate();
        notificationsPnl.repaint();
        notificationsPnl.add(nlist.get(npage-1));
        }
        catch(Exception ex){
            System.out.println("Hello");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nRightLbl = new javax.swing.JLabel();
        nLeftLbl = new javax.swing.JLabel();
        notificationsPnl = new javax.swing.JPanel();
        eventsPnl = new javax.swing.JPanel();
        tasksPnl = new javax.swing.JPanel();

        setBackground(new java.awt.Color(254, 254, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nRightLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/right-arrow_1.png"))); // NOI18N
        nRightLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nRightLblMouseClicked(evt);
            }
        });
        add(nRightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, -1));

        nLeftLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/back.png"))); // NOI18N
        nLeftLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nLeftLblMouseClicked(evt);
            }
        });
        add(nLeftLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        notificationsPnl.setBackground(new java.awt.Color(59, 59, 59));
        add(notificationsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 320, 70));

        eventsPnl.setPreferredSize(new java.awt.Dimension(307, 251));
        eventsPnl.setLayout(new java.awt.GridLayout(1, 1));
        add(eventsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 350, 260));

        tasksPnl.setLayout(new java.awt.GridLayout(1, 1));
        add(tasksPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 660, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void nLeftLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nLeftLblMouseClicked
        if (npage != 1) {
            npage--;
            updateNotificationsPnl();

        } 
        
    }//GEN-LAST:event_nLeftLblMouseClicked

    private void nRightLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nRightLblMouseClicked
            npage++;
            updateNotificationsPnl();
        


    }//GEN-LAST:event_nRightLblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eventsPnl;
    private javax.swing.JLabel nLeftLbl;
    private javax.swing.JLabel nRightLbl;
    private javax.swing.JPanel notificationsPnl;
    private javax.swing.JPanel tasksPnl;
    // End of variables declaration//GEN-END:variables
}
