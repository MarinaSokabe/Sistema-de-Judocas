/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.Date;
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
public class AlunoTest {
    
    private static Aluno aluno;
    private static Filiado filiadoAluno;
    private static Filiado filiadoProf;
    private static Professor professor;
    private static Entidade entidade;
    private static Filiado filiado;
    private static Endereco endereco;
    private static Rg Rg;
        
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                aluno = new Aluno();
		aluno.setFiliado(filiadoAluno);
		aluno.setProfessor(professor);
		aluno.setEntidade(entidade);
                
                professor = new Professor();
                professor.setFiliado(filiadoProf);

                filiadoProf = new Filiado();
                filiadoProf.setNome("Capirot");
                filiadoProf.setCpf("67890543261");
                filiadoProf.setTelefone1("999999991");
                filiadoProf.setTelefone2("666666661");
                filiadoProf.setEmail("inferno1@purgatorio.com");
                filiadoProf.setId(6961L);
                filiadoProf.setEndereco(endereco);
                filiadoProf.setRg(Rg);
        
                
                filiadoAluno = new Filiado();
                filiadoAluno.setNome("Capiroto");
                filiadoAluno.setCpf("67890543269");
                filiadoAluno.setTelefone1("999999999");
                filiadoAluno.setTelefone2("666666666");
                filiadoAluno.setEmail("inferno@purgatorio.com");
                filiadoAluno.setId(6969L);
                filiadoAluno.setEndereco(endereco);
                filiadoAluno.setRg(Rg);
                
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

     
    @Test
    public void idTestAluno(){
        assertTrue(filiadoProf.getId() == 6961L);
        assertNotNull(filiadoProf.getId());
        
    }
    
    @Test
    public void NomeTestAluno(){
        assertTrue(filiadoProf.getNome() == "Capirot");
        assertNotNull(filiadoProf.getNome());
        assertNotSame("CAPIROT", filiadoProf.getNome().matches("[A-Z]*"));
        assertNotSame("Capirot", filiadoProf.getNome().matches("[a-z]*"));
        
        assertTrue(entidade.getNome() == "Desmonio");
        assertNotNull(entidade.getNome());
        assertNotSame("DESMONIO", entidade.getNome().matches("[A-Z]*"));
        assertNotSame("Desmonio", entidade.getNome().matches("[a-z]*"));
    }
    @Test 
    public void telefoneOneTestAluno(){
        assertTrue(filiadoProf.getTelefone1() == "999999991");
        assertNotNull(filiadoProf.getTelefone1());
        assertTrue(filiadoProf.getTelefone1().length() == 9);
        assertNotSame("999999991", filiadoProf.getTelefone1().matches("[0-9]+"));
         assertTrue(Integer.parseInt(filiadoProf.getTelefone1()) > 0);
        
        assertTrue(entidade.getTelefone1() == "049274850");
        assertNotNull(entidade.getTelefone1());
        assertTrue(entidade.getTelefone1().length() == 9);
        assertNotSame("049274850", entidade.getTelefone1().matches("[0-9]+"));
        assertTrue(Integer.parseInt(filiadoProf.getTelefone1()) > 0);
         
    }
    
    @Test
    public void telefoneTwoTestAluno(){
        assertTrue(filiadoProf.getTelefone2() == "666666661");
        assertNotNull(filiadoProf.getTelefone2());
        assertTrue(filiadoProf.getTelefone2().length() == 9);
        assertNotSame("666666661", filiadoProf.getTelefone2().matches("[0-9]+"));
         assertTrue(Integer.parseInt(filiadoProf.getTelefone2()) > 0);
        
        assertTrue(entidade.getTelefone2() == "099283746");
        assertNotNull(entidade.getTelefone2());
        assertTrue(entidade.getTelefone2().length() == 9);
        assertNotSame("099283746", entidade.getTelefone2().matches("[0-9]+"));
        
    }
    
    @Test
    public void emailTestAluno(){
        assertTrue(filiadoProf.getEmail() == "inferno1@purgatorio.com");
        assertNotNull(filiadoProf.getEmail());
        assertNotSame("inferno1@purgatorio.com", filiadoProf.getNome().matches("\"^[\\\\w\\\\.-]+@([\\\\w\\\\-]+\\\\.)+[A-Z]{2,4}$\""));
    }
    
    @Test
    public void cpfTestAluno(){
        assertTrue(filiadoProf.getCpf() == "67890543261" );
        assertNotNull(filiadoProf.getCpf());
        assertTrue(filiadoProf.getCpf().length() == 11);
        assertNotSame("67890543261",filiadoProf.getCpf().matches("[0-9]+")); 
         
    }
    @Test
    public void cnpjTestAluno(){
    assertTrue(entidade.getCnpj() == "12345678907");
    assertNotNull(entidade.getCnpj());
    assertTrue(entidade.getCnpj().length() == 11);
    assertNotSame("12345678907", entidade.getCnpj().matches("[0-9]+"));
     
    }
    
    @Test
    public void RgTestNumeroAluno(){
        Rg r = new Rg ("123456789", "SP");
        assertEquals("123456789", r.getNumero());
        assertNotNull(r.getNumero());
        assertTrue(r.getNumero().length() == 9 );
        assertNotSame("123456789", r.getOrgaoExpedidor().matches("[0-9]+"));
        assertTrue(Integer.parseInt(r.getNumero()) > 0);
         
    }  
    
    @Test
    public void RgTestOrgaoExpedidorAluno(){
        Rg r = new Rg ("123456789", "SP");
        assertEquals("SP", r.getOrgaoExpedidor());
        assertNotNull(r.getOrgaoExpedidor());
        assertNotSame("SP",r.getOrgaoExpedidor().matches("[A-Z]*"));
        assertNotSame("sp",r.getOrgaoExpedidor().matches("[a-z]*"));   
        
    }
    @Test
    public void bairroAluno(){ 
        assertTrue(endereco.getBairro() == "parnaiba");
        assertNotNull(endereco.getBairro());
        assertNotSame("PARNAIBA", endereco.getBairro().matches("[A-Z]*"));
        assertNotSame("parnaiba", endereco.getBairro().matches("[a-z]*"));
    
    }
    
    @Test
    public void cepAluno(){
        assertTrue(endereco.getCep() == "39485762");
        assertNotNull(endereco.getCep());
        assertTrue(endereco.getCep().length() == 8);
        assertNotSame("39485762", endereco.getCep().matches("[0-9]+"));
        assertTrue(Integer.parseInt(endereco.getCep()) > 0);
    }
    
    @Test
    public void cidadeAluno(){
        assertTrue(endereco.getCidade()== "oeiras");
        assertNotNull(endereco.getCidade());
        assertNotSame("OEIRAS", endereco.getCidade().matches("[A-Z]*"));
        assertNotSame("oeiras", endereco.getCidade().matches("[a-z]*"));
    }
    
    @Test
    public void estadoAluno(){
        assertTrue(endereco.getEstado()== "PI");
        assertNotNull(endereco.getEstado());
        assertNotSame("PI", endereco.getEstado().matches("[A-Z]*"));
        assertNotSame("pi", endereco.getEstado().matches("[a-z]*"));
    }  
    @Test
    public void ruaAluno(){
        assertTrue(endereco.getRua()== "Rua inferno astral");
        assertNotNull(endereco.getRua());
        assertNotSame("RUA INFERNO ASTRAL", endereco.getRua().matches("[A-Z]*"));
        assertNotSame("rua inferno astral", endereco.getRua().matches("[a-z]*"));
    } 
    @Test
    public void numeroAluno(){
        assertTrue(endereco.getNumero() == "6666");
        assertNotNull(endereco.getNumero());
        assertTrue(endereco.getNumero().length() == 4);
        assertNotSame("6666", endereco.getNumero().matches("[0-9]+"));
        assertTrue(Integer.parseInt(endereco.getNumero()) > 0);
    }
    
    
    
    
    
}    
  
    
    

