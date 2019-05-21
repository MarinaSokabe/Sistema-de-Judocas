/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view;

import java.util.List;
import javax.swing.JPanel;
import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Professor;
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
public class ProfessorBuscarViewTest {
    
    public ProfessorBuscarViewTest() {
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
     * Test of getGui method, of class ProfessorBuscarView.
     */
    @Test
    public void testGetGui() {
        System.out.println("getGui");
        ProfessorBuscarView instance = new ProfessorBuscarView();
        JPanel expResult = null;
        JPanel result = instance.getGui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerFacade method, of class ProfessorBuscarView.
     */
    @Test
    public void testRegisterFacade() {
        System.out.println("registerFacade");
        AppFacade fac = null;
        ProfessorBuscarView instance = new ProfessorBuscarView();
        instance.registerFacade(fac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedProfessor method, of class ProfessorBuscarView.
     */
    @Test
    public void testGetSelectedProfessor() {
        System.out.println("getSelectedProfessor");
        ProfessorBuscarView instance = new ProfessorBuscarView();
        Professor expResult = null;
        Professor result = instance.getSelectedProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistroFpij method, of class ProfessorBuscarView.
     */
    @Test
    public void testGetRegistroFpij() {
        System.out.println("getRegistroFpij");
        ProfessorBuscarView instance = new ProfessorBuscarView();
        Long expResult = null;
        Long result = instance.getRegistroFpij();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistroFpij method, of class ProfessorBuscarView.
     */
    @Test
    public void testSetRegistroFpij() {
        System.out.println("setRegistroFpij");
        String registroFpij = "";
        ProfessorBuscarView instance = new ProfessorBuscarView();
        instance.setRegistroFpij(registroFpij);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class ProfessorBuscarView.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ProfessorBuscarView instance = new ProfessorBuscarView();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class ProfessorBuscarView.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ProfessorBuscarView instance = new ProfessorBuscarView();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessorList method, of class ProfessorBuscarView.
     */
    @Test
    public void testSetProfessorList() {
        System.out.println("setProfessorList");
        List<Professor> professorList = null;
        ProfessorBuscarView instance = new ProfessorBuscarView();
        instance.setProfessorList(professorList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
