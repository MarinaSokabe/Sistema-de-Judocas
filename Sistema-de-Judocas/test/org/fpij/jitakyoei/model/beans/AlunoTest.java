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
        
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                aluno = new Aluno();
		aluno.setFiliado(filiadoAluno);
		aluno.setProfessor(professor);
		aluno.setEntidade(entidade);
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
    public void alunoTestNome(){
        assertEquals("josefina", aluno.getFiliado().getNome());
    }  
    
    @Test
    public void alunoTestCPF(){
        assertEquals("09876543212", aluno.getFiliado().getCpf());
    }
    
    @Test
    public void alunoTestTelefone(){
        assertEquals("(11)98279492", aluno.getFiliado().getTelefone1());
    }
    
    @Test
    public void alunoTestDataNascc(){
        assertEquals(new Date(), aluno.getFiliado().getDataNascimento());
    } 
    
    @Test
    public void alunoTestDataCad(){
        assertEquals(new Date(), aluno.getFiliado().getDataCadastro());
    }  
    @Test
    public void alunoTestId(){
        assertEquals(789L, aluno.getFiliado().getId());
    }
    
    
    
}    
  
    
    

