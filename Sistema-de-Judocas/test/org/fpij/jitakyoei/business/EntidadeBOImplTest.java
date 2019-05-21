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
public class EntidadeBOImplTest {
    
    public EntidadeBOImplTest() {
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
     * Test of createEntidade method, of class EntidadeBOImpl.
     */
    @Test
    public void testCreateEntidade() throws Exception {
        System.out.println("createEntidade");
        Entidade entidade = null;
        EntidadeBOImpl instance = null;
        instance.createEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listAll method, of class EntidadeBOImpl.
     */
    @Test
    public void testListAll() throws Exception {
        System.out.println("listAll");
        EntidadeBOImpl instance = null;
        List<Entidade> expResult = null;
        List<Entidade> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchEntidade method, of class EntidadeBOImpl.
     */
    @Test
    public void testSearchEntidade() throws Exception {
        System.out.println("searchEntidade");
        Entidade entidade = null;
        EntidadeBOImpl instance = null;
        List<Entidade> expResult = null;
        List<Entidade> result = instance.searchEntidade(entidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateEntidade method, of class EntidadeBOImpl.
     */
    @Test
    public void testUpdateEntidade() throws Exception {
        System.out.println("updateEntidade");
        Entidade entidade = null;
        EntidadeBOImpl instance = null;
        instance.updateEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
