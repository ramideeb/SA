/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.assistant.signupp;

/**
 *
 * @author rami
 */
public class non extends javax.swing.JPanel {

    /**
     * Creates new form non
     */
    public non() {
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

        non = new javax.swing.JPanel();
        jTitleTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        non.setBackground(new java.awt.Color(254, 254, 254));

        jTitleTF.setForeground(new java.awt.Color(149, 135, 135));

        jLabel9.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel9.setText("Job title");

        javax.swing.GroupLayout nonLayout = new javax.swing.GroupLayout(non);
        non.setLayout(nonLayout);
        nonLayout.setHorizontalGroup(
            nonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nonLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        nonLayout.setVerticalGroup(
            nonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(nonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(non, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(non, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkEmptyFields(){
        if(jTitleTF.getText().equals(""))
            return true;
        
        
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jTitleTF;
    private javax.swing.JPanel non;
    // End of variables declaration//GEN-END:variables
}
