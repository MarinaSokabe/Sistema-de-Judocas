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
public class EnderecoTest {
    private static Endereco endereco;
    
    public EnderecoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                endereco = new Endereco();
		endereco.setBairro("vila leopoldina");
		endereco.setCep("97069583");
		endereco.setCidade("Oeiras");
		endereco.setEstado("PI");
		endereco.setRua("Rua Marcia");
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

    
}
