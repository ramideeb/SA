package study.assistant.signupp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author rami
 */
public class st extends javax.swing.JPanel {

    /**
     * Creates new form st
     */
    public st() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        st = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        classCM = new javax.swing.JComboBox<>();
        uniIdTF = new javax.swing.JTextField();
        uniNameTF = new javax.swing.JTextField();

        st.setBackground(new java.awt.Color(254, 254, 254));

        jLabel12.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel12.setText("class");

        jLabel13.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel13.setText("university name");

        jLabel14.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel14.setText("university id");

        classCM.setBackground(new java.awt.Color(254, 254, 254));
        classCM.setForeground(new java.awt.Color(149, 135, 135));
        classCM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        classCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classCMActionPerformed(evt);
            }
        });

        uniIdTF.setBackground(new java.awt.Color(254, 254, 254));
        uniIdTF.setForeground(new java.awt.Color(149, 135, 135));
        uniIdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniIdTFActionPerformed(evt);
            }
        });

        uniNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniNameTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stLayout = new javax.swing.GroupLayout(st);
        st.setLayout(stLayout);
        stLayout.setHorizontalGroup(
            stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(stLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(classCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(uniIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(stLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(uniNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        stLayout.setVerticalGroup(
            stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(classCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(uniNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(uniIdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uniNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniNameTFActionPerformed

    private void classCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classCMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classCMActionPerformed

    private void uniIdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniIdTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniIdTFActionPerformed

    public boolean checkEmptyFields(){
        if(uniIdTF.getText().equals(""))
            return true;
        if(uniNameTF.getText().equals(""))
            return true;
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JComboBox<String> classCM;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel st;
    protected javax.swing.JTextField uniIdTF;
    protected javax.swing.JTextField uniNameTF;
    // End of variables declaration//GEN-END:variables
}
