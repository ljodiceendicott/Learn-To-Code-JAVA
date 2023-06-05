/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.endicott.ltcj.gui;

import edu.endicott.ltcj.controller.ActivityController;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author Jeff
 */
public class ActivityPanel extends javax.swing.JPanel {
    private RSyntaxTextArea textArea;
    private RTextScrollPane sp;
    private ActivityController activityController;
    private String instructions;
    /**
     * Creates new form Activity and creates a new activityManager
     */
    public ActivityPanel() {
        initComponents();
        this.activityController = new ActivityController();
    }
    public ActivityPanel(ActivityController activityController) {
        initComponents();
        this.activityController = activityController;
    }

    /**
     *
     * @return activityManager
     */
    /*public ActivityManager getActivityManager() {
        return activityManager;
    }*/

    /**
     *
     * @return instructions
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     *
     * @return ide
     */
    /*public IDE getIde() {
        return ide;
    }*/

    /**
     *
     * @param activityManager
     * sets activityManager
     */
    /*public void setActivityManager(ActivityManager activityManager) {
        this.activityManager = activityManager;
    }*/

    /**
     *
     * @param instructions
     * sets instructions
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     *
     * @param ide
     * sets IDE
     */
    /*public void setIde(IDE ide) {
        this.ide = ide;
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn = new javax.swing.JButton();
        hintBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        activityDescription = new javax.swing.JTextArea();
        checkCodeBtn = new javax.swing.JButton();
        descriptionLabel = new javax.swing.JLabel();
        terminalLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        terminal = new javax.swing.JTextArea();
        runBtn = new javax.swing.JButton();
        IDE = new edu.endicott.ltcj.gui.IDE();

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        hintBtn.setText("Hint");
        hintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintBtnActionPerformed(evt);
            }
        });

        activityDescription.setColumns(20);
        activityDescription.setRows(5);
        activityDescription.setText("Activity Description");
        jScrollPane1.setViewportView(activityDescription);

        checkCodeBtn.setText("Check");
        checkCodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCodeBtnActionPerformed(evt);
            }
        });

        descriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        descriptionLabel.setText("Activity One - Intro to Variables");

        terminalLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        terminalLabel.setText("Output/Terminal");

        terminal.setColumns(20);
        terminal.setRows(5);
        jScrollPane3.setViewportView(terminal);

        runBtn.setText("Run");
        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IDELayout = new javax.swing.GroupLayout(IDE);
        IDE.setLayout(IDELayout);
        IDELayout.setHorizontalGroup(
            IDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        IDELayout.setVerticalGroup(
            IDELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(terminalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                        .addComponent(hintBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(checkCodeBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terminalLabel)
                    .addComponent(runBtn)
                    .addComponent(saveBtn)
                    .addComponent(hintBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkCodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void hintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hintBtnActionPerformed

    private void checkCodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCodeBtnActionPerformed
        // TODO add your handling code here:\
        String code = IDE.getInputtedText();
        //        System.out.println(code);
        //        if (code.contains("String")){
            //            System.out.println(code.charAt(code.lastIndexOf("String") + 7));
            //            if (Character.isUpperCase(code.charAt(code.lastIndexOf("String") + 7))) {
                //                JOptionPane.showMessageDialog(null, "test", "Title", 1);
                //            }
            //        }
        activityController.checkAnswers(code);
        // Need more implementation of the controller
    }//GEN-LAST:event_checkCodeBtnActionPerformed

    private void runBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBtnActionPerformed
        // TODO add your handling code here:
        // Insert code for finished compiler here
       // activityController.displayErrors();
    }//GEN-LAST:event_runBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.endicott.ltcj.gui.IDE IDE;
    private javax.swing.JTextArea activityDescription;
    private javax.swing.JButton checkCodeBtn;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JButton hintBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton runBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextArea terminal;
    private javax.swing.JLabel terminalLabel;
    // End of variables declaration//GEN-END:variables
}
