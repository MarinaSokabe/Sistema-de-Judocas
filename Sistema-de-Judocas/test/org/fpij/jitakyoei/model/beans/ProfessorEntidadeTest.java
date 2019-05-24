/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 
/**
 *
 * @author 31704786
 */
public class ProfessorEntidadeTest {
   private static Filiado filiadoProf;
   private static Professor professor;
   private static Entidade entidade;
    
    public ProfessorEntidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
                filiadoProf = new Filiado();
		filiadoProf.setNome("Mauro");
		filiadoProf.setCpf("6789054326");
		filiadoProf.setId(3456L);	
        
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
     * Test of equals method, of class ProfessorEntidade.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ProfessorEntidade instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ProfessorEntidade.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ProfessorEntidade instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessor method, of class ProfessorEntidade.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        ProfessorEntidade instance = null;
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessor method, of class ProfessorEntidade.
     */
    @Test
    public void testSetProfessor() {
        System.out.println("setProfessor");
        Professor professor = null;
        ProfessorEntidade instance = null;
        instance.setProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidade method, of class ProfessorEntidade.
     */
    @Test
    public void testGetEntidade() {
        System.out.println("getEntidade");
        ProfessorEntidade instance = null;
        Entidade expResult = null;
        Entidade result = instance.getEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidade method, of class ProfessorEntidade.
     */
    @Test
    public void testSetEntidade() {
        System.out.println("setEntidade");
        Entidade entidade = null;
        ProfessorEntidade instance = null;
        instance.setEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
