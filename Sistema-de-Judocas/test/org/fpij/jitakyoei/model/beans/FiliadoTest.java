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
    
    public FiliadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                filiado = new Filiado();
		filiado.setNome("josefina");
		filiado.setCpf("09876543212");
                filiado.setTelefone1("(11)98279492");
		filiado.setDataNascimento(new Date());
		filiado.setDataCadastro(new Date());
		filiado.setId(789L);
		filiado.setRg(new Rg("345678765", "SP"));
                filiado.setEmail("josefina@gmail.com");
        
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
