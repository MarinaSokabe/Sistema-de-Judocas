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
public class DAOTest {
    
    public DAOTest() {
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
     * Test of save method, of class DAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Object object = null;
        DAO instance = new DAOImpl();
        boolean expResult = false;
        boolean result = instance.save(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object object = null;
        DAO instance = new DAOImpl();
        instance.delete(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class DAO.
     */
    @Test
    public void testList() {
        System.out.println("list");
        DAO instance = new DAOImpl();
        List expResult = null;
        List result = instance.list();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class DAO.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object object = null;
        DAO instance = new DAOImpl();
        Object expResult = null;
        Object result = instance.get(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class DAO.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Object object = null;
        DAO instance = new DAOImpl();
        List expResult = null;
        List result = instance.search(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DAOImpl implements DAO {

        public boolean save(E object) throws IllegalArgumentException {
            return false;
        }

        public void delete(E object) throws IllegalArgumentException {
        }

        public List<E> list() throws IllegalArgumentException {
            return null;
        }

        public E get(E object) throws IllegalArgumentException {
            return null;
        }

        public List<E> search(E object) throws IllegalArgumentException {
            return null;
        }
    }
    
}
