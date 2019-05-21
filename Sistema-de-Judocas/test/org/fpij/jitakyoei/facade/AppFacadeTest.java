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
public class AppFacadeTest {
    
    public AppFacadeTest() {
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
     * Test of createAluno method, of class AppFacade.
     */
    @Test
    public void testCreateAluno() {
        System.out.println("createAluno");
        Aluno aluno = null;
        AppFacade instance = new AppFacadeImpl();
        instance.createAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAluno method, of class AppFacade.
     */
    @Test
    public void testUpdateAluno() {
        System.out.println("updateAluno");
        Aluno aluno = null;
        AppFacade instance = new AppFacadeImpl();
        instance.updateAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAluno method, of class AppFacade.
     */
    @Test
    public void testSearchAluno() {
        System.out.println("searchAluno");
        Aluno aluno = null;
        AppFacade instance = new AppFacadeImpl();
        List<Aluno> expResult = null;
        List<Aluno> result = instance.searchAluno(aluno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAlunos method, of class AppFacade.
     */
    @Test
    public void testListAlunos() {
        System.out.println("listAlunos");
        AppFacade instance = new AppFacadeImpl();
        instance.listAlunos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProfessor method, of class AppFacade.
     */
    @Test
    public void testCreateProfessor() {
        System.out.println("createProfessor");
        Professor professor = null;
        AppFacade instance = new AppFacadeImpl();
        instance.createProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateProfessor method, of class AppFacade.
     */
    @Test
    public void testUpdateProfessor() {
        System.out.println("updateProfessor");
        Professor professor = null;
        AppFacade instance = new AppFacadeImpl();
        instance.updateProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProfessor method, of class AppFacade.
     */
    @Test
    public void testSearchProfessor() {
        System.out.println("searchProfessor");
        Professor professor = null;
        AppFacade instance = new AppFacadeImpl();
        List<Professor> expResult = null;
        List<Professor> result = instance.searchProfessor(professor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listProfessores method, of class AppFacade.
     */
    @Test
    public void testListProfessores() {
        System.out.println("listProfessores");
        AppFacade instance = new AppFacadeImpl();
        List<Professor> expResult = null;
        List<Professor> result = instance.listProfessores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEntidade method, of class AppFacade.
     */
    @Test
    public void testCreateEntidade() {
        System.out.println("createEntidade");
        Entidade entidade = null;
        AppFacade instance = new AppFacadeImpl();
        instance.createEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEntidade method, of class AppFacade.
     */
    @Test
    public void testUpdateEntidade() {
        System.out.println("updateEntidade");
        Entidade entidade = null;
        AppFacade instance = new AppFacadeImpl();
        instance.updateEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEntidade method, of class AppFacade.
     */
    @Test
    public void testSearchEntidade() {
        System.out.println("searchEntidade");
        Entidade entidade = null;
        AppFacade instance = new AppFacadeImpl();
        List<Entidade> expResult = null;
        List<Entidade> result = instance.searchEntidade(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listEntidade method, of class AppFacade.
     */
    @Test
    public void testListEntidade() {
        System.out.println("listEntidade");
        AppFacade instance = new AppFacadeImpl();
        List<Entidade> expResult = null;
        List<Entidade> result = instance.listEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createProfessorEntidade method, of class AppFacade.
     */
    @Test
    public void testCreateProfessorEntidade() {
        System.out.println("createProfessorEntidade");
        List<ProfessorEntidade> relacionamentos = null;
        AppFacade instance = new AppFacadeImpl();
        instance.createProfessorEntidade(relacionamentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AppFacadeImpl implements AppFacade {

        public void createAluno(Aluno aluno) {
        }

        public void updateAluno(Aluno aluno) {
        }

        public List<Aluno> searchAluno(Aluno aluno) {
            return null;
        }

        public void listAlunos() {
        }

        public void createProfessor(Professor professor) {
        }

        public void updateProfessor(Professor professor) {
        }

        public List<Professor> searchProfessor(Professor professor) {
            return null;
        }

        public List<Professor> listProfessores() {
            return null;
        }

        public void createEntidade(Entidade entidade) {
        }

        public void updateEntidade(Entidade entidade) {
        }

        public List<Entidade> searchEntidade(Entidade entidade) {
            return null;
        }

        public List<Entidade> listEntidade() {
            return null;
        }

        public void createProfessorEntidade(List<ProfessorEntidade> relacionamentos) {
        }
    }
    
}
