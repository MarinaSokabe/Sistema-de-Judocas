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
		entidade.setNome("Lucifer");
		entidade.setTelefone1("049274850");
                entidade.setTelefone2("849720472");
                entidade.setCnpj("12345678907");
                
                endereco = new Endereco();
                endereco.setBairro("Ranco");
                endereco.setCep("00000000");
                endereco.setCidade("oeiras");
                endereco.setEstado("Trevas");
                endereco.setNumero("6600");
                endereco.setRua("Rua inferno astral");
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
    public void NomeTestEntidade(){
        assertTrue(entidade.getNome() == "Lucifer");
        assertNotNull(entidade.getNome());
        assertNotSame("LUCIFER", entidade.getNome().matches("[A-Z]*"));
        assertNotSame("lucifer", entidade.getNome().matches("[a-z]*"));
    
    }
    
    @Test 
    public void telefoneOneTestEntidade(){
        assertTrue(entidade.getTelefone1() == "049274850");
        assertNotNull(entidade.getTelefone1());
        assertTrue(entidade.getTelefone1().length() == 9);
        assertNotSame("049274850", entidade.getTelefone1().matches("[0-9]+"));
    
    } 
    
    @Test
    public void telefoneTwoTestEntidade(){
        assertTrue(entidade.getTelefone2() == "849720472");
        assertNotNull(entidade.getTelefone2());
        assertTrue(entidade.getTelefone2().length() == 9);
        assertNotSame("849720472", entidade.getTelefone2().matches("[0-9]+"));
    }
    
    @Test
    public void cnpjTestEntidade(){
        assertTrue(entidade.getCnpj() == "12345678907" );
        assertNotNull(entidade.getCnpj()) ;
        assertTrue(entidade.getCnpj().length() == 11);
        assertNotSame("12345678907",entidade.getCnpj().matches("[0-9]+")); 
    }
    
    @Test
    public void bairroEntidade(){ 
        assertTrue(endereco.getBairro() == "Ranco");
        assertNotNull(endereco.getBairro());
        assertNotSame("RANCO", endereco.getBairro().matches("[A-Z]*"));
        assertNotSame("Ranco", endereco.getBairro().matches("[a-z]*"));
    }
    
    @Test
    public void cepEntidade(){
        assertTrue(endereco.getCep() == "00000000");
        assertNotNull(endereco.getCep());
        assertTrue(endereco.getCep().length() == 8);
        assertNotSame("00000000", endereco.getCep().matches("[0-9]+"));
    }
    
    @Test
    public void cidadeEntidade(){
        assertTrue(endereco.getCidade()== "oeiras");
        assertNotNull(endereco.getCidade());
        assertNotSame("oeiras", endereco.getCidade().matches("[A-Z]*"));
        assertNotSame("oeiras", endereco.getCidade().matches("[a-z]*"));
    }
    
    @Test
    public void estadoEntidade(){
        assertTrue(endereco.getEstado()== "Trevas");
        assertNotNull(endereco.getEstado());
        assertNotSame("TREVAS", endereco.getEstado().matches("[A-Z]*"));
        assertNotSame("trevas", endereco.getEstado().matches("[a-z]*"));
    }  
    @Test
    public void ruaEntidade(){
        assertTrue(endereco.getRua()== "Rua inferno astral");
        assertNotNull(endereco.getRua());
        assertNotSame("Rua inferno astral", endereco.getRua().matches("[A-Z]*"));
        assertNotSame("Rua inferno astral", endereco.getRua().matches("[a-z]*"));
    } 
    @Test
    public void numeroEntidade(){
        assertTrue(endereco.getNumero() == "6600");
        assertNotNull(endereco.getNumero());
        assertTrue(endereco.getNumero().length() == 4);
        assertNotSame("6600", endereco.getNumero().matches("[0-9]+"));
    }
    
    
}
