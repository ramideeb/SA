/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courses;

import ToDoList.TaskPnl;
import ToDoList.TaskPnl1;
import calendar.EventPnl;
import database.Course;
import database.CoursesSelected;
import database.Event;
import database.Note;
import database.Task;
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import notes.generalNote;
import study.assistant.home;

/**
 *
 * @author rami
 */
public class CoursePanel extends javax.swing.JPanel {

    /**
     * Creates new form CoursePanel
     */
    public CoursePanel(Course c) {
        initComponents();
        this.c = c;
        updatePanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        notesPnl = new javax.swing.JPanel();
        tasksPnl = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        eventsPnl = new javax.swing.JPanel();
        notesPreviousLbl = new javax.swing.JLabel();
        notesNextLbl = new javax.swing.JLabel();
        tasksPreviousLbl = new javax.swing.JLabel();
        eventPreviousLbl = new javax.swing.JLabel();
        eventNextLbl = new javax.swing.JLabel();
        taskNextLbl = new javax.swing.JLabel();
        cNameLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Outline");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel2.setText("Tasks");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/organize.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/notebook(1).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Book");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel6.setText("Notes");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        notesPnl.setPreferredSize(new java.awt.Dimension(372, 106));
        notesPnl.setLayout(new java.awt.GridLayout(1, 1));
        add(notesPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        tasksPnl.setLayout(new java.awt.GridLayout(1, 1));
        add(tasksPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 372, 110));

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel7.setText("Events");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 81, -1));

        eventsPnl.setPreferredSize(new java.awt.Dimension(307, 251));
        eventsPnl.setLayout(new java.awt.GridLayout(1, 1));
        add(eventsPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 320, 260));

        notesPreviousLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/back.png"))); // NOI18N
        notesPreviousLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesPreviousLblMouseClicked(evt);
            }
        });
        add(notesPreviousLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        notesNextLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/right-arrow_1.png"))); // NOI18N
        notesNextLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesNextLblMouseClicked(evt);
            }
        });
        add(notesNextLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        tasksPreviousLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/back.png"))); // NOI18N
        tasksPreviousLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksPreviousLblMouseClicked(evt);
            }
        });
        add(tasksPreviousLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        eventPreviousLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/back.png"))); // NOI18N
        eventPreviousLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventPreviousLblMouseClicked(evt);
            }
        });
        add(eventPreviousLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        eventNextLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/right-arrow_1.png"))); // NOI18N
        eventNextLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventNextLblMouseClicked(evt);
            }
        });
        add(eventNextLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

        taskNextLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/right-arrow_1.png"))); // NOI18N
        taskNextLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskNextLblMouseClicked(evt);
            }
        });
        add(taskNextLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, -1, -1));

        cNameLbl.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        cNameLbl.setText("Digital Circuits I");
        add(cNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 180, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void notesPreviousLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesPreviousLblMouseClicked
        if (npage != 1) {
            npage--;
            updateNotesPnl();
        }
    }//GEN-LAST:event_notesPreviousLblMouseClicked

    private void notesNextLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesNextLblMouseClicked
        npage++;
        updateNotesPnl();
    }//GEN-LAST:event_notesNextLblMouseClicked

    private void taskNextLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskNextLblMouseClicked
        tpage++;
        updateTasksPnl();
    }//GEN-LAST:event_taskNextLblMouseClicked

    private void tasksPreviousLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksPreviousLblMouseClicked
        if (tpage != 1) {
            tpage--;
            updateTasksPnl();
        }
    }//GEN-LAST:event_tasksPreviousLblMouseClicked

    private void eventPreviousLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventPreviousLblMouseClicked
        if (epage != 1) {
            epage--;
            updateEventsPnl();
        }
    }//GEN-LAST:event_eventPreviousLblMouseClicked

    private void eventNextLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventNextLblMouseClicked
        epage++;
        updateEventsPnl();
    }//GEN-LAST:event_eventNextLblMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        EntityManager em = Persistence.createEntityManagerFactory("gitPU").createEntityManager();
        em.getTransaction().begin();

        CoursesSelected co = null;
        List<CoursesSelected> a = new ArrayList<CoursesSelected>(home.user.getCoursesSelectedCollection());

        for (CoursesSelected q : a) {
            if (q.getCourseId().getId() == c.getId()) {
                co = q;
            }

        }

        if (co.getDownloaded() == BigInteger.ZERO) {
            try {
                saveFileFromUrlWithJavaIO("/home/rami/StudyAssistant/notes photos/" + c.getName() + ".pdf", c.getBook());
                saveFileFromUrlWithJavaIO("/home/rami/StudyAssistant/notes photos/" + c.getName() + "o.pdf", c.getOutline());

            } catch (IOException ex) {
            }
            CoursesSelected cc = em.find(CoursesSelected.class, co.getSeq());
            cc.setDownloaded(BigInteger.ONE);

            for (CoursesSelected q : a) {
                if (q.getCourseId().getId() == c.getId()) {
                    q.setDownloaded(BigInteger.ONE);
                }

            }

        } else {
            String url = "/home/rami/StudyAssistant/notes photos/" + c.getName() + ".pdf";

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.open(new File(url));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        em.getTransaction().commit();
        em.close();


    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       
        EntityManager em = Persistence.createEntityManagerFactory("gitPU").createEntityManager();
        em.getTransaction().begin();

        CoursesSelected co = null;
        List<CoursesSelected> a = new ArrayList<CoursesSelected>(home.user.getCoursesSelectedCollection());

        for (CoursesSelected q : a) {
            if (q.getCourseId().getId() == c.getId()) {
                co = q;
            }

        }

        if (co.getDownloaded() == BigInteger.ZERO) {
            try {
                saveFileFromUrlWithJavaIO("/home/rami/StudyAssistant/notes photos/" + c.getName() + ".pdf", c.getBook());
                saveFileFromUrlWithJavaIO("/home/rami/StudyAssistant/notes photos/" + c.getName() + "o.pdf", c.getOutline());

            } catch (IOException ex) {
            }
            CoursesSelected cc = em.find(CoursesSelected.class, co.getSeq());
            cc.setDownloaded(BigInteger.ONE);

            for (CoursesSelected q : a) {
                if (q.getCourseId().getId() == c.getId()) {
                    q.setDownloaded(BigInteger.ONE);
                }

            }

        } else {
            String url = "/home/rami/StudyAssistant/notes photos/" + c.getName() + "o.pdf";

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.open(new File(url));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        em.getTransaction().commit();
        em.close();


    }//GEN-LAST:event_jLabel4MouseClicked

    public static void saveFileFromUrlWithJavaIO(String fileName, String fileUrl)
            throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(fileUrl).openStream());
            fout = new FileOutputStream(fileName);

            byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }

    public void updateNotesPnl() {

        Collection<Note> t = home.user.getNoteCollection();
     
        ArrayList<Note> notes = new ArrayList<Note>();
       
        for (Note n : t) {
            if (n.getCourseId().getId() == c.getId()) {
                notes.add(n);
            }
        }
 if (notes.size() == 0) {
            return;
        }
        
        if (npage != 1) {
            notesPreviousLbl.setIcon(new ImageIcon(getClass().getResource("/photos/back.png")));
            notesPreviousLbl.enable();
        } else {
            notesPreviousLbl.setIcon(null);
            notesPreviousLbl.disable();
        }
        if (npage >= notes.size()) {
            notesNextLbl.setIcon(null);
            notesNextLbl.disable();
        } else {
            notesNextLbl.setIcon(new ImageIcon(getClass().getResource("/photos/right-arrow_1.png")));
            notesNextLbl.enable();
        }

        notesPnl.removeAll();
        notesPnl.revalidate();
        notesPnl.repaint();
        notesPnl.add(new generalNote(notes.get(npage - 1)));

    }

    public void updateEventsPnl() {

        Collection<Event> t = home.user.getEventCollection();
    
        ArrayList<Event> events = new ArrayList<Event>();

        for (Event n : t) {
            if (n.getCourse().getId() == c.getId()) {
                events.add(n);
            }
        }
          if (events.size() == 0) {
            return;
        }

        if (epage != 1) {
            eventPreviousLbl.setIcon(new ImageIcon(getClass().getResource("/photos/back.png")));
            eventPreviousLbl.enable();
        } else {
            eventPreviousLbl.setIcon(null);
            eventPreviousLbl.disable();
        }
        if (epage >= events.size()) {
            eventNextLbl.setIcon(null);
            eventNextLbl.disable();
        } else {
            eventNextLbl.setIcon(new ImageIcon(getClass().getResource("/photos/right-arrow_1.png")));
            eventNextLbl.enable();
        }

        eventsPnl.removeAll();
        eventsPnl.revalidate();
        eventsPnl.repaint();

        eventsPnl.add(new EventPnl(events.get(epage - 1)));
    }

    public void updateTasksPnl() {

        ArrayList<Task> t = new ArrayList<Task>(home.user.getTaskCollection());
     
        ArrayList<Task> tasks = new ArrayList<Task>();
        for (Task ts : t) {
            if (ts.getCourse().getId() == c.getId()) {
                tasks.add(ts);
            }
             
        }  
        if (tasks.size() == 0) {
            return;
        }
        if (tpage != 1) {
            tasksPreviousLbl.setIcon(new ImageIcon(getClass().getResource("/photos/back.png")));
            tasksPreviousLbl.enable();
        } else {
            tasksPreviousLbl.setIcon(null);
            tasksPreviousLbl.disable();
        }
        if (tpage >= tasks.size()) {
            taskNextLbl.setIcon(null);
            taskNextLbl.disable();
        } else {
            taskNextLbl.setIcon(new ImageIcon(getClass().getResource("/photos/right-arrow_1.png")));
            taskNextLbl.enable();
        }
        tasksPnl.removeAll();
        tasksPnl.revalidate();
        tasksPnl.repaint();
        tasksPnl.add(new TaskPnl1(tasks.get(tpage - 1)));
    }

    public void updatePanels() {
        cNameLbl.setText(c.getName());

        
        updateNotesPnl();
        updateTasksPnl();
        updateEventsPnl();
    }

    private Course c;

    private int tpage = 1;
    private int npage = 1;
    private int epage = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cNameLbl;
    private javax.swing.JLabel eventNextLbl;
    private javax.swing.JLabel eventPreviousLbl;
    private javax.swing.JPanel eventsPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel notesNextLbl;
    private javax.swing.JPanel notesPnl;
    private javax.swing.JLabel notesPreviousLbl;
    private javax.swing.JLabel taskNextLbl;
    private javax.swing.JPanel tasksPnl;
    private javax.swing.JLabel tasksPreviousLbl;
    // End of variables declaration//GEN-END:variables
}
