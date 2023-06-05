/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.endicott.ltcj.controller;

import edu.endicott.ltcj.gui.ActivityPanel;
import edu.endicott.ltcj.io.GameLoader;
import edu.endicott.ltcj.models.Activity;

/**
 *
 * @author Tommy Hendricks
 */
public class ActivityOneDemo extends javax.swing.JFrame {
    private ActivityPanel actvityPane = new ActivityPanel();
    private Activity activity;
    private ActivityController activityController = new ActivityController();
    private GameLoader gameLoader = new GameLoader("demos/activity-demo-1");
    
    
    public ActivityOneDemo() {
        initComponents();
       // activity = gameLoader.getActivityModel();
        activityController.displayActivity();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActivityOneDemo().setVisible(true);
            }
        });
        
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}