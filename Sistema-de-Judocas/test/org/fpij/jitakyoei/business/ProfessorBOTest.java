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
public class ProfessorBOTest {
    
    public ProfessorBOTest() {
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
     * Test of createProfessor method, of class ProfessorBO.
     */
    @Test
    public void testCreateProfessor() throws Exception {
        System.out.println("createProfessor");
        Professor professor = null;
        ProfessorBO instance = new ProfessorBOImpl();
        instance.createProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfessor method, of class ProfessorBO.
     */
    @Test
    public void testUpdateProfessor() throws Exception {
        System.out.println("updateProfessor");
        Professor professor = null;
        ProfessorBO instance = new ProfessorBOImpl();
        instance.updateProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchProfessor method, of class ProfessorBO.
     */
    @Test
    public void testSearchProfessor() throws Exception {
        System.out.println("searchProfessor");
        Professor professor = null;
        ProfessorBO instance = new ProfessorBOImpl();
        List<Professor> expResult = null;
        List<Professor> result = instance.searchProfessor(professor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listAll method, of class ProfessorBO.
     */
    @Test
    public void testListAll() throws Exception {
        System.out.println("listAll");
        ProfessorBO instance = new ProfessorBOImpl();
        List<Professor> expResult = null;
        List<Professor> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class ProfessorBOImpl implements ProfessorBO {

        public void createProfessor(Professor professor) throws Exception {
        }

        public void updateProfessor(Professor professor) throws Exception {
        }

        public List<Professor> searchProfessor(Professor professor) throws Exception {
            return null;
        }

        public List<Professor> listAll() throws Exception {
            return null;
        }
    }
    
}
