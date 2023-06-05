/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.endicott.ltcj.gui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jodic
 */
public class GamePanelTest {
    
    public GamePanelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setDisplayText method, of class GamePanel.
     */
    @Test
    public void testSetDisplayText() {
        System.out.println("setDisplayText");
        String s = "";
      //  GamePanel instance = new GamePanel();
       // instance.setDisplayText(s);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of startButtonPressed method, of class GamePanel.
     */
    @Test
    public void testStartButtonPressed() {
        System.out.println("startButtonPressed");
        GamePanel instance = new GamePanel();
        instance.startButtonPressed();    
    }

    /**
     * Test of closeButtonPressed method, of class GamePanel.
     */
    @Test
    public void testCloseButtonPressed() {
        System.out.println("closeButtonPressed");
        GamePanel instance = new GamePanel();
        instance.closeButtonPressed();
    }

    /**
     * Test of launchStartScreen method, of class GamePanel.
     */
    @Test
    public void testLaunchStartScreen() {
        System.out.println("launchStartScreen");
        GamePanel instance = new GamePanel();
        instance.launchStartScreen();
    }

    /**
     * Test of launchEndScreen method, of class GamePanel.
     */
    @Test
    public void testLaunchEndScreen() {
        System.out.println("launchEndScreen");
        GamePanel instance = new GamePanel();
        instance.launchEndScreen();
    }

    /**
     * Test of launchNameScreen method, of class GamePanel.
     */
    @Test
    public void testLaunchNameScreen() {
        System.out.println("launchNameScreen");
        GamePanel instance = new GamePanel();
        instance.launchNameScreen();
    }
    
}
