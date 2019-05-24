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
 * @author 31704786
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

    
    @Test
    public void criaRgTestNumero(){
        Rg r = new Rg ("123456789", "SP");
        assertEquals("123456789", r.getNumero());
    }  
    
    @Test
    public void criaRgTestOrgaoExpedidor(){
        Rg r = new Rg ("123456789", "SP");
        assertEquals("SP", r.getOrgaoExpedidor());
    }    
}
