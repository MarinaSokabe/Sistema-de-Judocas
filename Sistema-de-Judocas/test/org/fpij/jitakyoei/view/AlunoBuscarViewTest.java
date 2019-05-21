/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view;

import java.util.List;
import javax.swing.JPanel;
import org.fpij.jitakyoei.facade.AppFacade;
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
public class AlunoBuscarViewTest {
    
    public AlunoBuscarViewTest() {
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
     * Test of getGui method, of class AlunoBuscarView.
     */
    @Test
    public void testGetGui() {
        System.out.println("getGui");
        AlunoBuscarView instance = new AlunoBuscarView();
        JPanel expResult = null;
        JPanel result = instance.getGui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerFacade method, of class AlunoBuscarView.
     */
    @Test
    public void testRegisterFacade() {
        System.out.println("registerFacade");
        AppFacade fac = null;
        AlunoBuscarView instance = new AlunoBuscarView();
        instance.registerFacade(fac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class AlunoBuscarView.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        AlunoBuscarView instance = new AlunoBuscarView();
        instance.buscar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlunoList method, of class AlunoBuscarView.
     */
    @Test
    public void testGetAlunoList() {
        System.out.println("getAlunoList");
        AlunoBuscarView instance = new AlunoBuscarView();
        List<Aluno> expResult = null;
        List<Aluno> result = instance.getAlunoList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAluno method, of class AlunoBuscarView.
     */
    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        AlunoBuscarView instance = new AlunoBuscarView();
        Aluno expResult = null;
        Aluno result = instance.getAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAluno method, of class AlunoBuscarView.
     */
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        Aluno aluno = null;
        AlunoBuscarView instance = new AlunoBuscarView();
        instance.setAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedAluno method, of class AlunoBuscarView.
     */
    @Test
    public void testGetSelectedAluno() {
        System.out.println("getSelectedAluno");
        AlunoBuscarView instance = new AlunoBuscarView();
        Aluno expResult = null;
        Aluno result = instance.getSelectedAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedAluno method, of class AlunoBuscarView.
     */
    @Test
    public void testSetSelectedAluno() {
        System.out.println("setSelectedAluno");
        Aluno selectedAluno = null;
        AlunoBuscarView instance = new AlunoBuscarView();
        instance.setSelectedAluno(selectedAluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
