/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Aluno;
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
public class AlunoFormTest {
    
    public AlunoFormTest() {
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
     * Test of setAluno method, of class AlunoForm.
     */
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        Aluno aluno = null;
        AlunoForm instance = null;
        instance.setAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAluno method, of class AlunoForm.
     */
    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        AlunoForm instance = null;
        Aluno expResult = null;
        Aluno result = instance.getAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populaProfessorCombo method, of class AlunoForm.
     */
    @Test
    public void testPopulaProfessorCombo() {
        System.out.println("populaProfessorCombo");
        AlunoForm instance = null;
        instance.populaProfessorCombo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populaEntidadeCombo method, of class AlunoForm.
     */
    @Test
    public void testPopulaEntidadeCombo() {
        System.out.println("populaEntidadeCombo");
        AlunoForm instance = null;
        instance.populaEntidadeCombo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidade method, of class AlunoForm.
     */
    @Test
    public void testGetEntidade() {
        System.out.println("getEntidade");
        AlunoForm instance = null;
        Entidade expResult = null;
        Entidade result = instance.getEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessor method, of class AlunoForm.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        AlunoForm instance = null;
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidade method, of class AlunoForm.
     */
    @Test
    public void testSetEntidade() {
        System.out.println("setEntidade");
        Entidade entidade = null;
        AlunoForm instance = null;
        instance.setEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessor method, of class AlunoForm.
     */
    @Test
    public void testSetProfessor() {
        System.out.println("setProfessor");
        Professor professor = null;
        AlunoForm instance = null;
        instance.setProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
