/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

// Name: LevelTest.java			   //
// Date Created: 11/28/21		   //
// Description: Level test model class     //

// Last Edited: Teddy Blazejowski (11/28/21)

package edu.endicott.ltcj.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *  Test for level model
 * 
 * @author teddyblazejowski
 */
public class LevelTest {
    
//    private static Level instance;
//    
    /**
     * Create a new instance before every test method
     * - Restarts/cleans certain fields in the level model
     */
    @BeforeEach
    public void setUp() {
//        instance = new Level(1, "Test", "Start", "End");
    }
    
    /**
     * Test of level constructor method.
     */
    @Test
    public void testLevelInit() {
//        System.out.println("LevelInit");
//        assertEquals(instance.getId(), 1);
//        assertEquals(instance.getName(), "Test");
//        assertEquals(instance.getStartText(), "Start");
//        assertEquals(instance.getEndText(), "End");
//        assertNull(instance.getCurrentActivity());
//        assertEquals(instance.getActivities().size(), 0);
    }
    
    /**
     * Test of setting and getting the current activity
     */
    @Test
    public void testCurrentActivity() {
        System.out.println("CurrentActivity");
        Activity activity = new Activity(1, "path", "code", "instruc");
//        instance.setCurrentActivity(activity);
//        assertEquals(instance.getCurrentActivity(), activity);
    }
    
    /**
     * Test of adding and getting list of activities
     */
    @Test
    public void testActivityList() {
        System.out.println("ActivityList");
        Activity nukedActivity = new Activity(0, "about", "to", "begone");
//        instance.addActivity(nukedActivity);
//        for (int i = 0; i < 5; i++)
//            instance.addActivity(new Activity(1, "path", "code", "instruc"));
//        assertEquals(instance.getActivities().size(), 6);
//        instance.removeActivity(nukedActivity);
//        assertEquals(instance.getActivities().size(), 5);
        
    }
    
}
