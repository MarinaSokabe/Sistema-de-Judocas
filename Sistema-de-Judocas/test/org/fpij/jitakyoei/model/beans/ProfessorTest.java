/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

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
public class ProfessorTest {
    private static Filiado filiadoProf;
    private static Professor professor;
    
    
    public ProfessorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                professor = new Professor();
		professor.setFiliado(filiadoProf);
        
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
    public void criaProfessorTest(){
        Professor p = new Professor();
        
    
    
    }
}






