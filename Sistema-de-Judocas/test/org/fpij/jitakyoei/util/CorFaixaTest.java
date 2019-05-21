/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.util;

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
public class CorFaixaTest {
    
    public CorFaixaTest() {
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
     * Test of values method, of class CorFaixa.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        CorFaixa[] expResult = null;
        CorFaixa[] result = CorFaixa.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class CorFaixa.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        CorFaixa expResult = null;
        CorFaixa result = CorFaixa.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class CorFaixa.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        CorFaixa instance = null;
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CorFaixa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CorFaixa instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoresFaixa method, of class CorFaixa.
     */
    @Test
    public void testGetCoresFaixa() {
        System.out.println("getCoresFaixa");
        List<CorFaixa> expResult = null;
        List<CorFaixa> result = CorFaixa.getCoresFaixa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
