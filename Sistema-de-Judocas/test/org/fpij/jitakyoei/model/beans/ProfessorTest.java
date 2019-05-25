/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 
/**
 *
 * @author 31704786
 */
public class ProfessorTest {
    
    private static Filiado filiadoProf;
    private static Filiado filiado;
    private static Endereco endereco;
    
    public ProfessorTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
        filiadoProf = new Filiado();
        filiadoProf.setId(66666L);
        filiadoProf.setNome("Capiroto");
        filiadoProf.setRegistroCbj("696969");
        //filiadoProf.setDataNascimento(new Date());
        //filiadoProf.setDataCadastro(new Date());
        filiadoProf.setTelefone1("999999999");
        filiadoProf.setTelefone2("666666666");
        filiadoProf.setEmail("inferno@purgatorio.com");
        filiadoProf.setCpf("44632207852");
        filiadoProf.setObservacoes("Quero passar com 100");
        filiadoProf.setEndereco(endereco);
        
        endereco = new Endereco();
	endereco.setBairro("parnaiba");
	endereco.setCep("39485762");
	endereco.setCidade("oeiras");
	endereco.setEstado("PI");
	endereco.setRua("Rua inferno astral");
        endereco.setNumero("6666");
        
    }
    
    //@AfterClass
    //public static void tearDownClass() {
    //}
    
    //@Before
    //public void setUp() {
    //}
    
    //@After
    //public void tearDown() {
    //}
    
   
    
    @Test
    public void idTest(){
        assertTrue(filiadoProf.getId() == 66666L);
        assertNotNull(filiadoProf.getId());
        assertTrue(Integer.parseInt(filiadoProf.getTelefone2()) > 0);
    }
    
    @Test
    public void NomeTest(){
        assertTrue(filiadoProf.getNome() == "Capiroto");
        assertNotNull(filiadoProf.getNome());
        assertNotSame("CAPIROTO", filiadoProf.getNome().matches("[A-Z]*"));
        assertNotSame("capiroto", filiadoProf.getNome().matches("[a-z]*"));
    }
    
    @Test
    public void telefoneOneTest(){
        assertTrue(filiadoProf.getTelefone1() == "999999999");
        assertNotNull(filiadoProf.getTelefone1());
        assertTrue(filiadoProf.getTelefone1().length() == 9);
        assertNotSame("999999999", filiadoProf.getTelefone1().matches("[0-9]+"));
        assertTrue(Integer.parseInt(filiadoProf.getTelefone1()) > 0);
    }
        
    @Test
    public void telefoneTwoTest(){
        assertTrue(filiadoProf.getTelefone2() == "666666666");
        assertNotNull(filiadoProf.getTelefone2());
        assertTrue(filiadoProf.getTelefone2().length() == 9);
        assertNotSame("666666666", filiadoProf.getTelefone2().matches("[0-9]+"));
        
    }
    @Test
    public void telefoneTwoNegativoTest(){
        assertTrue(Integer.parseInt(filiadoProf.getTelefone2()) > 0);
    }
    
    
    @Test
    public void emailTest(){
        assertTrue(filiadoProf.getEmail() == "inferno@purgatorio.com");
        assertNotNull(filiadoProf.getEmail());
        assertNotSame("inferno@purgatorio.com", filiadoProf.getNome().matches("\"^[\\\\w\\\\.-]+@([\\\\w\\\\-]+\\\\.)+[A-Z]{2,4}$\""));
    }
    
    @Test
    public void cpfTest(){
        assertTrue(filiadoProf.getCpf() == "44632207852" );
        assertNotNull(filiadoProf.getCpf());
        assertTrue(filiadoProf.getCpf().length() == 11);
        assertNotSame("44632207852",filiadoProf.getCpf().matches("[0-9]+")); 
    }
    
    
    @Test
    public void obsTest(){
        assertTrue(filiadoProf.getObservacoes() == "Quero passar com 100");
        assertNotNull(filiadoProf.getObservacoes());
 
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






