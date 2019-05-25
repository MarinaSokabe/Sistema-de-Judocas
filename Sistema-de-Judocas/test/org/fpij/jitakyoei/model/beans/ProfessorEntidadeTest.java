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
public class ProfessorEntidadeTest {
    
   private static Filiado filiadoProf;
   private static Professor professor;
   private static Entidade entidade;
   private static Endereco endereco;
   private static Rg Rg;
    
    public ProfessorEntidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        professor = new Professor();
        professor.setFiliado(filiadoProf);
        
        filiadoProf = new Filiado();
        filiadoProf.setNome("Capiroto");
	filiadoProf.setCpf("67890543269");
        filiadoProf.setTelefone1("999999999");
        filiadoProf.setTelefone2("666666666");
        filiadoProf.setEmail("inferno@purgatorio.com");
	filiadoProf.setId(6969L);
        filiadoProf.setEndereco(endereco);
        filiadoProf.setRg(Rg);
        
        entidade = new Entidade();
        entidade.setNome("Desmonio");
        entidade.setCnpj("12345678907");
        entidade.setTelefone1("049274850");
        entidade.setTelefone2("099283746");
        entidade.setEndereco(endereco);
        
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

    /**
     * Test of equals method, of class ProfessorEntidade.

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        ProfessorEntidade instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ProfessorEntidade.
 
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        ProfessorEntidade instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessor method, of class ProfessorEntidade.
    
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        ProfessorEntidade instance = null;
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessor method, of class ProfessorEntidade.
     
    @Test
    public void testSetProfessor() {
        System.out.println("setProfessor");
        Professor professor = null;
        ProfessorEntidade instance = null;
        instance.setProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidade method, of class ProfessorEntidade.
     
    @Test
    public void testGetEntidade() {
        System.out.println("getEntidade");
        ProfessorEntidade instance = null;
        Entidade expResult = null;
        Entidade result = instance.getEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidade method, of class ProfessorEntidade.
     
    @Test
    public void testSetEntidade() {
        System.out.println("setEntidade");
        Entidade entidade = null;
        ProfessorEntidade instance = null;
        instance.setEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
  
    }
  */
    @Test
    public void idTestEntidade(){
        assertTrue(filiadoProf.getId() == 6969L);
        assertNotNull(filiadoProf.getId());
        
    }
    
    @Test
    public void NomeTestEntidadeFilProf(){
        assertTrue(filiadoProf.getNome() == "Capiroto");
        assertNotNull(filiadoProf.getNome());
        assertNotSame("CAPIROTO", filiadoProf.getNome().matches("[A-Z]*"));
        assertNotSame("Capiroto", filiadoProf.getNome().matches("[a-z]*"));
        
        assertTrue(entidade.getNome() == "Desmonio");
        assertNotNull(entidade.getNome());
        assertNotSame("DESMONIO", entidade.getNome().matches("[A-Z]*"));
        assertNotSame("Desmonio", entidade.getNome().matches("[a-z]*"));
    }
    @Test 
    public void telefoneOneTestEntidadeFilProf(){
        assertTrue(filiadoProf.getTelefone1() == "999999999");
        assertNotNull(filiadoProf.getTelefone1());
        assertTrue(filiadoProf.getTelefone1().length() == 9);
        assertNotSame("999999999", filiadoProf.getTelefone1().matches("[0-9]+"));
         assertTrue(Integer.parseInt(filiadoProf.getTelefone1()) > 0);
        
        assertTrue(entidade.getTelefone1() == "049274850");
        assertNotNull(entidade.getTelefone1());
        assertTrue(entidade.getTelefone1().length() == 9);
        assertNotSame("049274850", entidade.getTelefone1().matches("[0-9]+"));
         assertTrue(Integer.parseInt(filiadoProf.getTelefone1()) > 0);
         
    }
    
    @Test
    public void telefoneTwoTestEntidadeFilProf(){
        assertTrue(filiadoProf.getTelefone2() == "666666666");
        assertNotNull(filiadoProf.getTelefone2());
        assertTrue(filiadoProf.getTelefone2().length() == 9);
        assertNotSame("666666666", filiadoProf.getTelefone2().matches("[0-9]+"));
         assertTrue(Integer.parseInt(filiadoProf.getTelefone2()) > 0);
        
        assertTrue(entidade.getTelefone2() == "099283746");
        assertNotNull(entidade.getTelefone2());
        assertTrue(entidade.getTelefone2().length() == 9);
        assertNotSame("099283746", entidade.getTelefone2().matches("[0-9]+"));
        
    }
    
    @Test
    public void emailTestFiliadoProf(){
        assertTrue(filiadoProf.getEmail() == "inferno@purgatorio.com");
        assertNotNull(filiadoProf.getEmail());
        assertNotSame("inferno@purgatorio.com", filiadoProf.getNome().matches("\"^[\\\\w\\\\.-]+@([\\\\w\\\\-]+\\\\.)+[A-Z]{2,4}$\""));
    }
    
    @Test
    public void cpfTestFilProf(){
        assertTrue(filiadoProf.getCpf() == "67890543269" );
        assertNotNull(filiadoProf.getCpf());
        assertTrue(filiadoProf.getCpf().length() == 11);
        assertNotSame("67890543269",filiadoProf.getCpf().matches("[0-9]+")); 
         
    }
    @Test
    public void cnpjTestEntidade(){
    assertTrue(entidade.getCnpj() == "12345678907");
    assertNotNull(entidade.getCnpj());
    assertTrue(entidade.getCnpj().length() == 11);
    assertNotSame("12345678907", entidade.getCnpj().matches("[0-9]+"));
     
    }
    
    @Test
    public void RgTestNumeroEntidadeFilProf(){
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

