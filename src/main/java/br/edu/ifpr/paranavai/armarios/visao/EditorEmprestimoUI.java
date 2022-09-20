/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.visao;

import java.awt.Color;

/**
 *
 * @author Luis
 */
public class EditorEmprestimoUI extends javax.swing.JFrame {

    /**
     * Creates new form EditorEmprestimoUI
     */
    public EditorEmprestimoUI() {
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

        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        raField = new javax.swing.JTextField();
        loginLbl = new javax.swing.JButton();
        loginLbl1 = new javax.swing.JButton();
        raField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginLbl2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label2.setText("DEVOLUÇÃO");

        label1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        label1.setText("EMPRÉSTIMO");

        raField.setForeground(new java.awt.Color(153, 153, 153));
        raField.setText("RA");
        raField.setToolTipText("RA");
        raField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                raFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                raFieldFocusLost(evt);
            }
        });

        loginLbl.setText("Emprestar");
        loginLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLblActionPerformed(evt);
            }
        });

        loginLbl1.setText("Devolver");
        loginLbl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLbl1ActionPerformed(evt);
            }
        });

        raField2.setForeground(new java.awt.Color(153, 153, 153));
        raField2.setText("RA");
        raField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                raField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                raField2FocusLost(evt);
            }
        });

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setToolTipText("   ");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });

        loginLbl2.setText("Armário");
        loginLbl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLbl2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(loginLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(129, 129, 129)
                        .addComponent(loginLbl1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label2)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(raField))
                        .addGap(69, 69, 69)
                        .addComponent(raField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(label1)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(label2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(raField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(loginLbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(loginLbl1)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(label1)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        raField.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLblActionPerformed
        new EditorFeedbackUI().setVisible(true);
    }//GEN-LAST:event_loginLblActionPerformed

    private void loginLbl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLbl1ActionPerformed
        new EditorFeedbackUI().setVisible(true);
    }//GEN-LAST:event_loginLbl1ActionPerformed

    private void loginLbl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLbl2ActionPerformed
        // TODO add your handling code here:
        new EditorArmariosUI().setVisible(true);
    }//GEN-LAST:event_loginLbl2ActionPerformed

    private void raFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_raFieldFocusGained
        // TODO add your handling code here:
        if(raField.getText().equals("RA")){
            raField.setText("");
            raField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_raFieldFocusGained

    private void raFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_raFieldFocusLost
        // TODO add your handling code here:
        if(raField.getText().equals("")){
            raField.setText("RA");
            raField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_raFieldFocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        jPasswordField1.setText("");
        jPasswordField1.setForeground(Color.black);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void raField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_raField2FocusGained
        // TODO add your handling code here:
        if(raField2.getText().equals("RA")){
            raField2.setText("");
            raField2.setForeground(Color.black);
        }
    }//GEN-LAST:event_raField2FocusGained

    private void raField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_raField2FocusLost
        // TODO add your handling code here:
        if(raField2.getText().equals("")){
            raField2.setText("RA");
            raField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_raField2FocusLost

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
            java.util.logging.Logger.getLogger(EditorEmprestimoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorEmprestimoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorEmprestimoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorEmprestimoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorEmprestimoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JButton loginLbl;
    private javax.swing.JButton loginLbl1;
    private javax.swing.JButton loginLbl2;
    private javax.swing.JTextField raField;
    private javax.swing.JTextField raField2;
    // End of variables declaration//GEN-END:variables
}