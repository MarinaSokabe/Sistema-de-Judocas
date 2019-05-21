/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.business;

import java.util.List;
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
public class ProfessorBOImplTest {
    
    public ProfessorBOImplTest() {
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
     * Test of createProfessor method, of class ProfessorBOImpl.
     */
    @Test
    public void testCreateProfessor() throws Exception {
        System.out.println("createProfessor");
        Professor professor = null;
        ProfessorBOImpl instance = null;
        instance.createProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfessor method, of class ProfessorBOImpl.
     */
    @Test
    public void testUpdateProfessor() throws Exception {
        System.out.println("updateProfessor");
        Professor professor = null;
        ProfessorBOImpl instance = null;
        instance.updateProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listAll method, of class ProfessorBOImpl.
     */
    @Test
    public void testListAll() throws Exception {
        System.out.println("listAll");
        ProfessorBOImpl instance = null;
        List<Professor> expResult = null;
        List<Professor> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchProfessor method, of class ProfessorBOImpl.
     */
    @Test
    public void testSearchProfessor() throws Exception {
        System.out.println("searchProfessor");
        Professor professor = null;
        ProfessorBOImpl instance = null;
        List<Professor> expResult = null;
        List<Professor> result = instance.searchProfessor(professor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
