/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.dao;

import java.util.List;
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
public class DAOImplTest {
    
    public DAOImplTest() {
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
     * Test of save method, of class DAOImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Object object = null;
        DAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object object = null;
        DAOImpl instance = null;
        instance.delete(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class DAOImpl.
     */
    @Test
    public void testList() {
        System.out.println("list");
        DAOImpl instance = null;
        List expResult = null;
        List result = instance.list();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class DAOImpl.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object object = null;
        DAOImpl instance = null;
        Object expResult = null;
        Object result = instance.get(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class DAOImpl.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object object = null;
        DAOImpl instance = null;
        List expResult = null;
        List result = instance.search(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
