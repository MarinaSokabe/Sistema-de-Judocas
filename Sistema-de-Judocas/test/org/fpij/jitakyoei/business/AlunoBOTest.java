/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.business;

import java.util.List;
import org.fpij.jitakyoei.model.beans.Aluno;
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
public class AlunoBOTest {
    
    public AlunoBOTest() {
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
     * Test of createAluno method, of class AlunoBO.
     */
    @Test
    public void testCreateAluno() throws Exception {
        System.out.println("createAluno");
        Aluno aluno = null;
        AlunoBO instance = new AlunoBOImpl();
        instance.createAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAluno method, of class AlunoBO.
     */
    @Test
    public void testUpdateAluno() throws Exception {
        System.out.println("updateAluno");
        Aluno aluno = null;
        AlunoBO instance = new AlunoBOImpl();
        instance.updateAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAluno method, of class AlunoBO.
     */
    @Test
    public void testSearchAluno() throws Exception {
        System.out.println("searchAluno");
        Aluno aluno = null;
        AlunoBO instance = new AlunoBOImpl();
        List<Aluno> expResult = null;
        List<Aluno> result = instance.searchAluno(aluno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAll method, of class AlunoBO.
     */
    @Test
    public void testListAll() throws Exception {
        System.out.println("listAll");
        AlunoBO instance = new AlunoBOImpl();
        List<Aluno> expResult = null;
        List<Aluno> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AlunoBOImpl implements AlunoBO {

        public void createAluno(Aluno aluno) throws Exception {
        }

        public void updateAluno(Aluno aluno) throws Exception {
        }

        public List<Aluno> searchAluno(Aluno aluno) throws Exception {
            return null;
        }

        public List<Aluno> listAll() throws Exception {
            return null;
        }
    }
    
}
