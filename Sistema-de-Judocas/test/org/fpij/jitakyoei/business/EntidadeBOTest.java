/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.business;

import java.util.List;
import org.fpij.jitakyoei.model.beans.Entidade;
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
public class EntidadeBOTest {
    
    public EntidadeBOTest() {
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
     * Test of createEntidade method, of class EntidadeBO.
     */
    @Test
    public void testCreateEntidade() throws Exception {
        System.out.println("createEntidade");
        Entidade entidade = null;
        EntidadeBO instance = new EntidadeBOImpl();
        instance.createEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEntidade method, of class EntidadeBO.
     */
    @Test
    public void testUpdateEntidade() throws Exception {
        System.out.println("updateEntidade");
        Entidade entidade = null;
        EntidadeBO instance = new EntidadeBOImpl();
        instance.updateEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEntidade method, of class EntidadeBO.
     */
    @Test
    public void testSearchEntidade() throws Exception {
        System.out.println("searchEntidade");
        Entidade entidade = null;
        EntidadeBO instance = new EntidadeBOImpl();
        List<Entidade> expResult = null;
        List<Entidade> result = instance.searchEntidade(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAll method, of class EntidadeBO.
     */
    @Test
    public void testListAll() throws Exception {
        System.out.println("listAll");
        EntidadeBO instance = new EntidadeBOImpl();
        List<Entidade> expResult = null;
        List<Entidade> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EntidadeBOImpl implements EntidadeBO {

        public void createEntidade(Entidade entidade) throws Exception {
        }

        public void updateEntidade(Entidade entidade) throws Exception {
        }

        public List<Entidade> searchEntidade(Entidade entidade) throws Exception {
            return null;
        }

        public List<Entidade> listAll() throws Exception {
            return null;
        }
    }
    
}
