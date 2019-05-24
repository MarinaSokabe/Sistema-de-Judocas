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
public class EntidadeTest {
    private static Entidade entidade;
    private static Endereco endereco;
    
    public EntidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                entidade = new Entidade();
		entidade.setEndereco(endereco);
		entidade.setNome("Ranço");
		entidade.setTelefone1("(086)04927485093");
                entidade.setCnpj("12345678907");
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
