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
public class EntidadeTest {
    
    public EntidadeTest() {
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
     * Test of equals method, of class Entidade.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Entidade instance = new Entidade();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Entidade.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Entidade instance = new Entidade();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Entidade.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Entidade instance = new Entidade();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Entidade.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Entidade instance = new Entidade();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone1 method, of class Entidade.
     */
    @Test
    public void testGetTelefone1() {
        System.out.println("getTelefone1");
        Entidade instance = new Entidade();
        String expResult = "";
        String result = instance.getTelefone1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone1 method, of class Entidade.
     */
    @Test
    public void testSetTelefone1() {
        System.out.println("setTelefone1");
        String telefone1 = "";
        Entidade instance = new Entidade();
        instance.setTelefone1(telefone1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone2 method, of class Entidade.
     */
    @Test
    public void testGetTelefone2() {
        System.out.println("getTelefone2");
        Entidade instance = new Entidade();
        String expResult = "";
        String result = instance.getTelefone2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone2 method, of class Entidade.
     */
    @Test
    public void testSetTelefone2() {
        System.out.println("setTelefone2");
        String telefone2 = "";
        Entidade instance = new Entidade();
        instance.setTelefone2(telefone2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Entidade.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Entidade instance = new Entidade();
        Endereco expResult = null;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Entidade.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereco endereco = null;
        Entidade instance = new Entidade();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCnpj method, of class Entidade.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        Entidade instance = new Entidade();
        String expResult = "";
        String result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnpj method, of class Entidade.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        String cnpj = "";
        Entidade instance = new Entidade();
        instance.setCnpj(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Entidade.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Entidade instance = new Entidade();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyProperties method, of class Entidade.
     */
    @Test
    public void testCopyProperties() {
        System.out.println("copyProperties");
        Entidade entidade = null;
        Entidade instance = new Entidade();
        instance.copyProperties(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
