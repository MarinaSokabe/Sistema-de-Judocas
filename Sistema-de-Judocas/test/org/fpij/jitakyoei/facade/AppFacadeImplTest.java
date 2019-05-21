/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.facade;

import java.util.List;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.beans.ProfessorEntidade;
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
public class AppFacadeImplTest {
    
    public AppFacadeImplTest() {
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
     * Test of createAluno method, of class AppFacadeImpl.
     */
    @Test
    public void testCreateAluno() {
        System.out.println("createAluno");
        Aluno aluno = null;
        AppFacadeImpl instance = null;
        instance.createAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAluno method, of class AppFacadeImpl.
     */
    @Test
    public void testUpdateAluno() {
        System.out.println("updateAluno");
        Aluno aluno = null;
        AppFacadeImpl instance = null;
        instance.updateAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAluno method, of class AppFacadeImpl.
     */
    @Test
    public void testSearchAluno() {
        System.out.println("searchAluno");
        Aluno aluno = null;
        AppFacadeImpl instance = null;
        List<Aluno> expResult = null;
        List<Aluno> result = instance.searchAluno(aluno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAlunos method, of class AppFacadeImpl.
     */
    @Test
    public void testListAlunos() {
        System.out.println("listAlunos");
        AppFacadeImpl instance = null;
        instance.listAlunos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProfessor method, of class AppFacadeImpl.
     */
    @Test
    public void testCreateProfessor() {
        System.out.println("createProfessor");
        Professor professor = null;
        AppFacadeImpl instance = null;
        instance.createProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProfessores method, of class AppFacadeImpl.
     */
    @Test
    public void testListProfessores() {
        System.out.println("listProfessores");
        AppFacadeImpl instance = null;
        List<Professor> expResult = null;
        List<Professor> result = instance.listProfessores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProfessor method, of class AppFacadeImpl.
     */
    @Test
    public void testSearchProfessor() {
        System.out.println("searchProfessor");
        Professor professor = null;
        AppFacadeImpl instance = null;
        List<Professor> expResult = null;
        List<Professor> result = instance.searchProfessor(professor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfessor method, of class AppFacadeImpl.
     */
    @Test
    public void testUpdateProfessor() {
        System.out.println("updateProfessor");
        Professor professor = null;
        AppFacadeImpl instance = null;
        instance.updateProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEntidade method, of class AppFacadeImpl.
     */
    @Test
    public void testCreateEntidade() {
        System.out.println("createEntidade");
        Entidade entidade = null;
        AppFacadeImpl instance = null;
        instance.createEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listEntidade method, of class AppFacadeImpl.
     */
    @Test
    public void testListEntidade() {
        System.out.println("listEntidade");
        AppFacadeImpl instance = null;
        List<Entidade> expResult = null;
        List<Entidade> result = instance.listEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEntidade method, of class AppFacadeImpl.
     */
    @Test
    public void testSearchEntidade() {
        System.out.println("searchEntidade");
        Entidade entidade = null;
        AppFacadeImpl instance = null;
        List<Entidade> expResult = null;
        List<Entidade> result = instance.searchEntidade(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEntidade method, of class AppFacadeImpl.
     */
    @Test
    public void testUpdateEntidade() {
        System.out.println("updateEntidade");
        Entidade entidade = null;
        AppFacadeImpl instance = null;
        instance.updateEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProfessorEntidade method, of class AppFacadeImpl.
     */
    @Test
    public void testCreateProfessorEntidade() {
        System.out.println("createProfessorEntidade");
        List<ProfessorEntidade> relacionamentos = null;
        AppFacadeImpl instance = null;
        instance.createProfessorEntidade(relacionamentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
