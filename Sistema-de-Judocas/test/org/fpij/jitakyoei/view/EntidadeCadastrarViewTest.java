/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view;

import javax.swing.JPanel;
import org.fpij.jitakyoei.facade.AppFacade;
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
public class EntidadeCadastrarViewTest {
    
    public EntidadeCadastrarViewTest() {
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
     * Test of getGui method, of class EntidadeCadastrarView.
     */
    @Test
    public void testGetGui() {
        System.out.println("getGui");
        EntidadeCadastrarView instance = null;
        JPanel expResult = null;
        JPanel result = instance.getGui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerFacade method, of class EntidadeCadastrarView.
     */
    @Test
    public void testRegisterFacade() {
        System.out.println("registerFacade");
        AppFacade fac = null;
        EntidadeCadastrarView instance = null;
        instance.registerFacade(fac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
