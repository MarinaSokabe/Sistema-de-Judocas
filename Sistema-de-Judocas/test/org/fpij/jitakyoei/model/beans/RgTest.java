/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

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
public class RgTest {
    
    public RgTest() {
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
     * Test of equals method, of class Rg.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Rg instance = new Rg();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Rg.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Rg instance = new Rg();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Rg.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Rg instance = new Rg();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Rg.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Rg instance = new Rg();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrgaoExpedidor method, of class Rg.
     */
    @Test
    public void testGetOrgaoExpedidor() {
        System.out.println("getOrgaoExpedidor");
        Rg instance = new Rg();
        String expResult = "";
        String result = instance.getOrgaoExpedidor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrgaoExpedidor method, of class Rg.
     */
    @Test
    public void testSetOrgaoExpedidor() {
        System.out.println("setOrgaoExpedidor");
        String orgaoExpedidor = "";
        Rg instance = new Rg();
        instance.setOrgaoExpedidor(orgaoExpedidor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
