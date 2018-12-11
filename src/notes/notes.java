package notes;

import database.Note;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static study.assistant.StudyAssistant.prog;
import study.assistant.home;

public class notes extends javax.swing.JPanel {

    List<Note> all = new ArrayList< Note>(home.user.getNoteCollection());

    List<Note> texts = new ArrayList< Note>();
    List<Note> photos = new ArrayList< Note>();
    List<Note> videos = new ArrayList< Note>();

    public notes() {

        initComponents();
        init();
        updatetxt();
        updatephoto();
        updatevideo();

    }

    void init() {

        for (Note a : all) {
            if (a.getType().equals("text")) {

                texts.add(0,a);
            } else if (a.getType().equals("photo")) {

                photos.add(0,a);
            } else {
                videos.add(0,a);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt = new javax.swing.JPanel();
        addEventLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUpwardsLbl = new javax.swing.JLabel();
        txtDownwardsLbl = new javax.swing.JLabel();
        photoss = new javax.swing.JPanel();
        imageUpwardsLbl = new javax.swing.JLabel();
        imageDownwardsLbl = new javax.swing.JLabel();
        videoss = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        videoDownwardsLbl = new javax.swing.JLabel();
        videoUpwardsLbl = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        jLabel1.setText("Notes");

        txt.setBackground(new java.awt.Color(255, 255, 255));
        txt.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        addEventLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addEventLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/add.png"))); // NOI18N
        addEventLbl.setText("Add note");
        addEventLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEventLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addEventLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEventLblMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel2.setText("Photos");

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel4.setText("Texts");

        txtUpwardsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/up_arrow.png"))); // NOI18N
        txtUpwardsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUpwardsLblMouseClicked(evt);
            }
        });

        txtDownwardsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/down-arrow.png"))); // NOI18N
        txtDownwardsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDownwardsLblMouseClicked(evt);
            }
        });

        photoss.setBackground(new java.awt.Color(255, 255, 255));
        photoss.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        imageUpwardsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/up_arrow.png"))); // NOI18N
        imageUpwardsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageUpwardsLblMouseClicked(evt);
            }
        });

        imageDownwardsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/down-arrow.png"))); // NOI18N
        imageDownwardsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageDownwardsLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imageDownwardsLblMouseEntered(evt);
            }
        });

        videoss.setBackground(new java.awt.Color(255, 255, 255));
        videoss.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel3.setText("Videos");

        videoDownwardsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/down-arrow.png"))); // NOI18N
        videoDownwardsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoDownwardsLblMouseClicked(evt);
            }
        });

        videoUpwardsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/up_arrow.png"))); // NOI18N
        videoUpwardsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoUpwardsLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addEventLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(videoUpwardsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(videoDownwardsLbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(videoss, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imageUpwardsLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageDownwardsLbl)
                                .addGap(84, 84, 84))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(photoss, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(txtUpwardsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDownwardsLbl)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEventLbl)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(videoUpwardsLbl)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(videoDownwardsLbl)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDownwardsLbl)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUpwardsLbl)
                                .addGap(3, 3, 3)))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(imageDownwardsLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(imageUpwardsLbl, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photoss, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(videoss, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addEventLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEventLblMouseClicked

        addNote add = new addNote();
        add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add.setSize(422, 600);
        add.setResizable(false);
        add.setLocationRelativeTo(this);
        add.setVisible(true);
        prog.home.setEnabled(false);
        

    }//GEN-LAST:event_addEventLblMouseClicked

    void updatetxt() {

        if (texts.size() > 5 * txtpage) {

            txtDownwardsLbl.setIcon(new ImageIcon(getClass().getResource("/photos/down-arrow.png")));

        } else {

            txtDownwardsLbl.setIcon(null);
            txtDownwardsLbl.disable();

        }
        if (txtpage != 1) {
            txtUpwardsLbl.setIcon(new ImageIcon(getClass().getResource("/photos/up_arrow.png")));
        } else {
            txtUpwardsLbl.setIcon(null);
            txtDownwardsLbl.disable();
        }

        for (int i = 0; i < 5; i++) {
            if (i + (txtpage - 1) * 5 < texts.size()) {
                txt.add(new generalNote((Note) texts.get(i + 5 * (txtpage - 1))));
            } else {
                txt.add(new JPanel());
            }
        }

    }

    void updatephoto() {

        if (photos.size() > 5 * imagepage) {

            imageDownwardsLbl.setIcon(new ImageIcon(getClass().getResource("/photos/down-arrow.png")));

        } else {

            imageDownwardsLbl.setIcon(null);
            imageDownwardsLbl.disable();

        }
        if (imagepage != 1) {
            imageUpwardsLbl.setIcon(new ImageIcon(getClass().getResource("/photos/up_arrow.png")));
        } else {
            imageUpwardsLbl.setIcon(null);
            imageDownwardsLbl.disable();
        }

        for (int i = 0; i < 5; i++) {
            if (i + (imagepage - 1) * 5 < photos.size()) {
                photoss.add(new generalNote((Note) photos.get(i + 5 * (imagepage - 1))));
            } else {
                photoss.add(new JPanel());
            }
        }

    }

    void updatevideo() {

        if (videos.size() > 5 * videopage) {

            videoDownwardsLbl.setIcon(new ImageIcon(getClass().getResource("/photos/down-arrow.png")));

        } else {

            videoDownwardsLbl.setIcon(null);
            videoDownwardsLbl.disable();

        }
        if (videopage != 1) {
            videoUpwardsLbl.setIcon(new ImageIcon(getClass().getResource("/photos/up_arrow.png")));
        } else {
            videoUpwardsLbl.setIcon(null);
            videoDownwardsLbl.disable();
        }

        for (int i = 0; i < 5; i++) {
            if (i + (videopage - 1) * 5 < videos.size()) {
                videoss.add(new generalNote((Note) videos.get(i + 5 * (videopage - 1))));
            } else {
                videoss.add(new JPanel());
            }
        }

    }
    private void txtUpwardsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpwardsLblMouseClicked
        if (txtpage != 1) {
            txtpage--;
            txt.removeAll();
            txt.revalidate();
            txt.repaint();
            updatetxt();
        }
    }//GEN-LAST:event_txtUpwardsLblMouseClicked

    private void txtDownwardsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDownwardsLblMouseClicked
        // TODO add your handling code here
        txtpage++;
        txt.removeAll();
        txt.revalidate();
        txt.repaint();
        updatetxt();

    }//GEN-LAST:event_txtDownwardsLblMouseClicked

    private void imageUpwardsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageUpwardsLblMouseClicked
        if (imagepage != 1) {
            imagepage--;
            photoss.removeAll();
            photoss.revalidate();
            photoss.repaint();
            updatephoto();

        }
    }//GEN-LAST:event_imageUpwardsLblMouseClicked

    private void imageDownwardsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDownwardsLblMouseClicked
        imagepage++;
        photoss.removeAll();
        photoss.revalidate();
        photoss.repaint();
        updatephoto();


    }//GEN-LAST:event_imageDownwardsLblMouseClicked

    private void videoDownwardsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoDownwardsLblMouseClicked
        // TODO add your handling code here:
        videopage++;
        videoss.removeAll();
        videoss.revalidate();
        videoss.repaint();
        updatevideo();

    }//GEN-LAST:event_videoDownwardsLblMouseClicked

    private void videoUpwardsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoUpwardsLblMouseClicked
        // TODO add your handling code here:        
        if (videopage != 1) {
            videopage--;
            videoss.removeAll();
            videoss.revalidate();
            videoss.repaint();
            updatevideo();
        }
    }//GEN-LAST:event_videoUpwardsLblMouseClicked

    private void imageDownwardsLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDownwardsLblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_imageDownwardsLblMouseEntered

    int txtpage = 1;
    int imagepage = 1;
    int videopage = 1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addEventLbl;
    private javax.swing.JLabel imageDownwardsLbl;
    private javax.swing.JLabel imageUpwardsLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel photoss;
    private javax.swing.JPanel txt;
    private javax.swing.JLabel txtDownwardsLbl;
    private javax.swing.JLabel txtUpwardsLbl;
    private javax.swing.JLabel videoDownwardsLbl;
    private javax.swing.JLabel videoUpwardsLbl;
    private javax.swing.JPanel videoss;
    // End of variables declaration//GEN-END:variables
}
