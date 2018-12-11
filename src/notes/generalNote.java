/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes;

import ToDoList.toDO;
import database.Note;
import database.Task;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

/**
 *
 * @author rami
 */
public class generalNote extends javax.swing.JPanel {

    /**
     * Creates new form generalNote
     */
    public generalNote(Note nt) {
        initComponents();
        n = nt;
        updatePanel();

    }

    public void updatePanel() {
        nameLbl.setText(n.getName());
        SimpleDateFormat format = new SimpleDateFormat("dd MMM s HH:mm aa");
        dateLbl.setText(format.format(n.getTimeAdded()));
        switch (n.getType()) {
            case "text":
                imageLbl.setIcon(new ImageIcon(getClass().getResource("/photos/notepad.png")));
                break;
            case "video":
                imageLbl.setIcon(new ImageIcon(getClass().getResource("/photos/play-button.png")));
                break;
            case "photo":
                imageLbl.setIcon(new ImageIcon(getClass().getResource("/photos/camera.png")));
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        imageLbl = new javax.swing.JLabel();
        imageLbl1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLbl.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        nameLbl.setText("111111111111111111111111");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 13, -1, -1));

        dateLbl.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        dateLbl.setText("dd mmm yyyy");
        add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 46, -1, -1));

        imageLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLblMouseClicked(evt);
            }
        });
        add(imageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 28, 34));

        imageLbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/rubbish-bin.png"))); // NOI18N
        imageLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLbl1MouseClicked(evt);
            }
        });
        add(imageLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 46, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void imageLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLbl1MouseClicked
        // TODO add your handling code here:

        EntityManager em = Persistence.createEntityManagerFactory("gitPU").createEntityManager();
        em.getTransaction().begin();

        em.remove(em.find(Note.class, n.getNoteId()));

        home.user.getNoteCollection().remove(n);
        em.getTransaction().commit();
        em.close();

        prog.home.alterpanel.removeAll();
        prog.home.alterpanel.revalidate();
        prog.home.alterpanel.repaint();
        prog.home.alterpanel.add(new notes());

    }//GEN-LAST:event_imageLbl1MouseClicked

    private void imageLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLblMouseClicked
        // TODO add your handling code here:
        if (n.getType().equals("text")) {
            TextNotePnl x = new TextNotePnl(n);
            x.setVisible(true);
            x.setTitle(n.getName());

            x.setResizable(false);

            x.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } else if (n.getType().equals("video")) {
            String url = n.getPath();

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(url));
                } catch (IOException | URISyntaxException e) {
                    // TODO Auto-generated catch block

                }
            } else {
                Runtime runtime = Runtime.getRuntime();
                try {
                    runtime.exec("xdg-open " + url);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                }
            }
        } else {
            File f = new File("/home/rami/StudyAssistant/notes photos/" +n.getPath());
            
            Desktop dt = Desktop.getDesktop();
            try {
                dt.open(f);
            } catch (IOException ex) {
            }

        }
    }//GEN-LAST:event_imageLblMouseClicked

    private Note n;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel imageLbl;
    private javax.swing.JLabel imageLbl1;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables
}