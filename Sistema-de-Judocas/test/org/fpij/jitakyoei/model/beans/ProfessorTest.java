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
        
    }
    
    @Test
    public void telefoneOneNegativoTest(){
        
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
    
}






