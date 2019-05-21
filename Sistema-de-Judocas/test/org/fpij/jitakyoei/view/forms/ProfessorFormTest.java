/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.forms;

import java.util.List;
import org.fpij.jitakyoei.model.beans.Entidade;
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
public class ProfessorFormTest {
    
    public ProfessorFormTest() {
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
     * Test of getProfessor method, of class ProfessorForm.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        ProfessorForm instance = null;
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidadesList method, of class ProfessorForm.
     */
    @Test
    public void testGetEntidadesList() {
        System.out.println("getEntidadesList");
        ProfessorForm instance = null;
        List<Entidade> expResult = null;
        List<Entidade> result = instance.getEntidadesList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidadesList method, of class ProfessorForm.
     */
    @Test
    public void testSetEntidadesList() {
        System.out.println("setEntidadesList");
        List<Entidade> entidadesList = null;
        ProfessorForm instance = null;
        instance.setEntidadesList(entidadesList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
