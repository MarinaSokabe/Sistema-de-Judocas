/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.util;

import java.awt.Component;
import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31522051
 */
public class CloseTabIconTest {
    
    public CloseTabIconTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of paintIcon method, of class CloseTabIcon.
     */
    @Test
    public void testPaintIcon() {
        System.out.println("paintIcon");
        Component component = null;
        Graphics g = null;
        int x = 0;
        int y = 0;
        CloseTabIcon instance = new CloseTabIcon();
        instance.paintIcon(component, g, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIconWidth method, of class CloseTabIcon.
     */
    @Test
    public void testGetIconWidth() {
        System.out.println("getIconWidth");
        CloseTabIcon instance = new CloseTabIcon();
        int expResult = 0;
        int result = instance.getIconWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIconHeight method, of class CloseTabIcon.
     */
    @Test
    public void testGetIconHeight() {
        System.out.println("getIconHeight");
        CloseTabIcon instance = new CloseTabIcon();
        int expResult = 0;
        int result = instance.getIconHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
