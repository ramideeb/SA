package study.assistant.signupp;

import database.Department;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
        Vector <Department> t;

    public st() {
        initComponents();
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("gitPU");

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

                        String jpql ;
        jpql = "SELECT d FROM Department d";
        Query query = em.createQuery(jpql);  
        
         t = new  Vector<Department> ();       
         
        t= (Vector<Department>) query.getResultList();
        
        for(int i=0;i<t.size();i++){
            Department.addItem(  t.get(i).getName());
        }
            em.close();
           emf.close();
           
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
        jLabel15 = new javax.swing.JLabel();
        Department = new javax.swing.JComboBox<>();

        st.setBackground(new java.awt.Color(254, 254, 254));

        jLabel12.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel12.setText("class");

        jLabel13.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel13.setText("university name");

        jLabel14.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel14.setText("university id");

        classCM.setBackground(new java.awt.Color(254, 254, 254));
        classCM.setForeground(new java.awt.Color(149, 135, 135));
        classCM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Freshman", "Sophomore", "Junior", "Senior" }));
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

        jLabel15.setFont(new java.awt.Font("URW Gothic L", 0, 15)); // NOI18N
        jLabel15.setText("Department");

        javax.swing.GroupLayout stLayout = new javax.swing.GroupLayout(st);
        st.setLayout(stLayout);
        stLayout.setHorizontalGroup(
            stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uniIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(stLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel15))
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uniNameTF)
                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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
                .addGap(18, 18, 18)
                .addGroup(stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(uniIdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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
    public javax.swing.JComboBox<String> Department;
    protected javax.swing.JComboBox<String> classCM;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel st;
    protected javax.swing.JTextField uniIdTF;
    protected javax.swing.JTextField uniNameTF;
    // End of variables declaration//GEN-END:variables
}
