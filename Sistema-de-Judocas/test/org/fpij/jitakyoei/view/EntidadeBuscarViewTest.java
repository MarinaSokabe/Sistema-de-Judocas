/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view;

import javax.swing.JPanel;
import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Entidade;
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
public class EntidadeBuscarViewTest {
    
    public EntidadeBuscarViewTest() {
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
     * Test of getGui method, of class EntidadeBuscarView.
     */
    @Test
    public void testGetGui() {
        System.out.println("getGui");
        EntidadeBuscarView instance = new EntidadeBuscarView();
        JPanel expResult = null;
        JPanel result = instance.getGui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerFacade method, of class EntidadeBuscarView.
     */
    @Test
    public void testRegisterFacade() {
        System.out.println("registerFacade");
        AppFacade fac = null;
        EntidadeBuscarView instance = new EntidadeBuscarView();
        instance.registerFacade(fac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedEntidade method, of class EntidadeBuscarView.
     */
    @Test
    public void testGetSelectedEntidade() {
        System.out.println("getSelectedEntidade");
        EntidadeBuscarView instance = new EntidadeBuscarView();
        Entidade expResult = null;
        Entidade result = instance.getSelectedEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class EntidadeBuscarView.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        EntidadeBuscarView instance = new EntidadeBuscarView();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class EntidadeBuscarView.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        EntidadeBuscarView instance = new EntidadeBuscarView();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
