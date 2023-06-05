/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.endicott.ltcj.codeevaluators;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mor
 */
public class StyleEvaluatorTest {
    
    public StyleEvaluatorTest() {
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
     * Test of showMistake method, of class StyleEvaluator.
     */
    @Test
    public void testShowMistake() {
        System.out.println("showMistake");
        ArrayList Mistake = null;
        StyleEvaluator instance = null;
        //instance.showMistake(Mistake);
    }

    /**
     * Test of setLevelPoints method, of class StyleEvaluator.
     */
    @Test
    public void testSetLevelPoints() {
        System.out.println("setLevelPoints");
        double levelPoints = 0.0;
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);
        instance.setLevelPoints(levelPoints);
    }

    /**
     * Test of getLevelPoints method, of class StyleEvaluator.
     */
    @Test
    public void testGetLevelPoints() {
        System.out.println("getLevelPoints");
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        double expResult = 0.0;
        double result = instance.getLevelPoints();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setTotalPoints method, of class StyleEvaluator.
     */
    @Test
    public void testSetTotalPoints() {
        System.out.println("setTotalPoints");
        double totalPoints = 0.0;
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        instance.setTotalPoints(totalPoints);
    }

    /**
     * Test of getTotalPoints method, of class StyleEvaluator.
     */
    @Test
    public void testGetTotalPoints() {
        System.out.println("getTotalPoints");
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        double expResult = 0.0;
        double result = instance.getTotalPoints();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setIndentPoints method, of class StyleEvaluator.
     */
    @Test
    public void testSetIndentPoints() {
        System.out.println("setIndentPoints");
        double indentPoints = 0.0;
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);
        instance.setIndentPoints(indentPoints);
    }

    /**
     * Test of getIndentPoints method, of class StyleEvaluator.
     */
    @Test
    public void testGetIndentPoints() {
        System.out.println("getIndentPoints");
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        double expResult = 0.0;
        double result = instance.getIndentPoints();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setNamePoints method, of class StyleEvaluator.
     */
    @Test
    public void testSetNamePoints() {
        System.out.println("setNamePoints");
        double namePoints = 0.0;
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        instance.setNamePoints(namePoints);
    }

    /**
     * Test of getGoodNamePoints method, of class StyleEvaluator.
     */
    @Test
    public void testGetGoodNamePoints() {
        System.out.println("getGoodNamePoints");
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        double expResult = 0.0;
        double result = instance.getGoodNamePoints();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setCommentPoints method, of class StyleEvaluator.
     */
    @Test
    public void testSetCommentPoints() {
        System.out.println("setCommentPoints");
        double commentPoints = 0.0;
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);
        instance.setCommentPoints(commentPoints);
    }

    /**
     * Test of getCommentPoints method, of class StyleEvaluator.
     */
    @Test
    public void testGetCommentPoints() {
        System.out.println("getCommentPoints");
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        double expResult = 0.0;
        double result = instance.getCommentPoints();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getWasViolated method, of class StyleEvaluator.
     */
    @Test
    public void testGetWasViolated() {
        System.out.println("getWasViolated");
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        boolean expResult = false;
        boolean result = instance.getWasViolated();
        assertEquals(expResult, result);
    }

    /**
     * Test of getViolationList method, of class StyleEvaluator.
     */
    @Test
    public void testGetViolationList() {
        System.out.println("getViolationList");
        StyleEvaluator instance = new StyleEvaluator(0, 0, 0, 0, 0);;
        ArrayList<String> expResult = null;
        // TODO: Set value for instance so method does not return null
        //ArrayList<String> result = instance.getViolationList();
        //assertEquals(expResult, result);
    }
    
}
