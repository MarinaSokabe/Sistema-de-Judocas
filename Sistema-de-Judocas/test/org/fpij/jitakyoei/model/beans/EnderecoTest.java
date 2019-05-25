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
		endereco.setCidade("oeiras");
		endereco.setEstado("PI");
		endereco.setRua("Rua Marcia");
                endereco.setNumero("6666");
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
    public void bairroEndereco(){ 
        assertTrue(endereco.getBairro() == "vila leopoldina");
        assertNotNull(endereco.getBairro());
        assertNotSame("VILA LEOPOLDINA", endereco.getBairro().matches("[A-Z]*"));
        assertNotSame("vila leopoldina", endereco.getBairro().matches("[a-z]*"));
    }
    
    @Test
    public void cepEndereco(){
        assertTrue(endereco.getCep() == "97069583");
        assertNotNull(endereco.getCep());
        assertTrue(endereco.getCep().length() == 8);
        assertNotSame("97069583", endereco.getCep().matches("[0-9]+"));
        assertTrue(Integer.parseInt(endereco.getCep()) > 0); 
    }
    
    @Test
    public void cidadeEndereco(){
        assertTrue(endereco.getCidade()== "oeiras");
        assertNotNull(endereco.getCidade());
        assertNotSame("oeiras", endereco.getCidade().matches("[A-Z]*"));
        assertNotSame("oeiras", endereco.getCidade().matches("[a-z]*"));
    }
    
    @Test
    public void estadoEntidade(){
        assertTrue(endereco.getEstado()== "PI");
        assertNotNull(endereco.getEstado());
        assertNotSame("PI", endereco.getEstado().matches("[A-Z]*"));
        assertNotSame("pi", endereco.getEstado().matches("[a-z]*"));
    }  
    @Test
    public void ruaEntidade(){
        assertTrue(endereco.getRua()== "Rua Marcia");
        assertNotNull(endereco.getRua());
        assertNotSame("Rua Marcia", endereco.getRua().matches("[A-Z]*"));
        assertNotSame("Rua Marcia", endereco.getRua().matches("[a-z]*"));
    } 
    @Test
    public void numeroEntidade(){
        assertTrue(endereco.getNumero() == "6666");
        assertNotNull(endereco.getNumero());
        assertTrue(endereco.getNumero().length() == 4);
        assertNotSame("6666", endereco.getNumero().matches("[0-9]+"));
        assertTrue(Integer.parseInt(endereco.getNumero()) > 0);
    }
    
    
}
