/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.Date;
import java.util.List;
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
public class FiliadoTest {
    private static Filiado filiado;
     private static Endereco endereco;
    
    public FiliadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                filiado = new Filiado();
		filiado.setNome("josefina");
		filiado.setCpf("09876543212");
                filiado.setTelefone1("982794928");
                filiado.setTelefone2("982719498");
		filiado.setDataNascimento(new Date());
		filiado.setDataCadastro(new Date());
		filiado.setId(7897L);
		filiado.setRg(new Rg("345678765", "SP"));
                filiado.setEmail("josefina@gmail.com");
                filiado.setEndereco(endereco);
                
                endereco = new Endereco();
                endereco.setBairro("parnaiba");
                endereco.setCep("39485762");
                endereco.setCidade("oeiras");
                endereco.setEstado("PI");
                endereco.setRua("Rua inferno astral");
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
    public void NomeTestFiliado(){
        assertTrue(filiado.getNome() == "josefina");
        assertNotNull(filiado.getNome());
        assertNotSame("JOSEFINA", filiado.getNome().matches("[A-Z]*"));
        assertNotSame("josefina", filiado.getNome().matches("[a-z]*"));
    
    }
    
    @Test 
    public void telefoneOneTestFiliado(){
        assertTrue(filiado.getTelefone1() == "982794928");
        assertNotNull(filiado.getTelefone1());
        assertTrue(filiado.getTelefone1().length() == 9);
        assertNotSame("982794928", filiado.getTelefone1().matches("[0-9]+"));
        assertTrue(Integer.parseInt(filiado.getTelefone1()) > 0);
    
    } 
    
    @Test
    public void telefoneTwoTestFiliado(){
        assertTrue(filiado.getTelefone2() == "982719498");
        assertNotNull(filiado.getTelefone2());
        assertTrue(filiado.getTelefone2().length() == 9);
        assertNotSame("982719498", filiado.getTelefone2().matches("[0-9]+"));
         assertTrue(Integer.parseInt(filiado.getTelefone2()) > 0);
    }
    @Test
    public void emailTestFiliado(){
        assertTrue(filiado.getEmail() == "josefina@gmail.com");
        assertNotNull(filiado.getEmail());
        assertNotSame("josefina@gmail.com", filiado.getNome().matches("\"^[\\\\w\\\\.-]+@([\\\\w\\\\-]+\\\\.)+[A-Z]{2,4}$\""));
    }
    
    @Test
    public void cpfTestFiliado(){
        assertTrue(filiado.getCpf() == "09876543212" );
        assertNotNull(filiado.getCpf());
        assertTrue(filiado.getCpf().length() == 11);
        assertNotSame("09876543212",filiado.getCpf().matches("[0-9]+")); 
    }
    
    @Test
    public void testaDateFiliado(){
        assertNotNull(filiado.getDataCadastro());
        assertNotNull(filiado.getDataNascimento());
    }
    
    @Test
    public void idTestFiliado(){
        assertTrue(filiado.getId() == 7897L);
        assertNotNull(filiado.getId());
      
    }
    
    @Test
    public void RgTestNumeroFiliado(){
        Rg r = new Rg ("123456789", "SP");
        assertEquals("123456789", r.getNumero());
        assertNotNull(r.getNumero());
        assertTrue(r.getNumero().length() == 9 );
        assertNotSame("123456789", r.getOrgaoExpedidor().matches("[0-9]+"));
        assertTrue(Integer.parseInt(r.getNumero()) > 0);
    }  
    
    @Test
    public void RgTestOrgaoExpedidorEntidadeFilProf(){
        Rg r = new Rg ("123456789", "SP");
        assertEquals("SP", r.getOrgaoExpedidor());
        assertNotNull(r.getOrgaoExpedidor());
        assertNotSame("SP",r.getOrgaoExpedidor().matches("[A-Z]*"));
        assertNotSame("sp",r.getOrgaoExpedidor().matches("[a-z]*"));   
        
    }
            
    @Test
    public void bairroEndereco(){ 
        assertTrue(endereco.getBairro() == "parnaiba");
        assertNotNull(endereco.getBairro());
        assertNotSame("PARNAIBA", endereco.getBairro().matches("[A-Z]*"));
        assertNotSame("parnaiba", endereco.getBairro().matches("[a-z]*"));
    }
    
    @Test
    public void cepEndereco(){
        assertTrue(endereco.getCep() == "39485762");
        assertNotNull(endereco.getCep());
        assertTrue(endereco.getCep().length() == 8);
        assertNotSame("39485762", endereco.getCep().matches("[0-9]+"));
        assertTrue(Integer.parseInt(endereco.getCep()) > 0);
    }
    
    @Test
    public void cidadeEndereco(){
        assertTrue(endereco.getCidade()== "oeiras");
        assertNotNull(endereco.getCidade());
        assertNotSame("OEIRAS", endereco.getCidade().matches("[A-Z]*"));
        assertNotSame("oeiras", endereco.getCidade().matches("[a-z]*"));
    }
    
    @Test
    public void estadoEndereco(){
        assertTrue(endereco.getEstado()== "PI");
        assertNotNull(endereco.getEstado());
        assertNotSame("PI", endereco.getEstado().matches("[A-Z]*"));
        assertNotSame("pi", endereco.getEstado().matches("[a-z]*"));
    }  
    @Test
    public void ruaEndereco(){
        assertTrue(endereco.getRua()== "Rua inferno astral");
        assertNotNull(endereco.getRua());
        assertNotSame("RUA INFERNO ASTRAL", endereco.getRua().matches("[A-Z]*"));
        assertNotSame("rua inferno astral", endereco.getRua().matches("[a-z]*"));
    } 
    @Test
    public void numeroEndereco(){
        assertTrue(endereco.getNumero() == "6666");
        assertNotNull(endereco.getNumero());
        assertTrue(endereco.getNumero().length() == 4);
        assertNotSame("6666", endereco.getNumero().matches("[0-9]+"));
        assertTrue(Integer.parseInt(endereco.getNumero()) > 0);
    }
}
