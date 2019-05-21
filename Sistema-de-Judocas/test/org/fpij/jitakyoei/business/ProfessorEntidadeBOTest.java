/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.business;

import java.util.List;
import org.fpij.jitakyoei.model.beans.ProfessorEntidade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31522051
 */
public class ProfessorEntidadeBOTest {
    
    public ProfessorEntidadeBOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of createProfessorEntidade method, of class ProfessorEntidadeBO.
     */
    @Test
    public void testCreateProfessorEntidade() throws Exception {
        System.out.println("createProfessorEntidade");
        List<ProfessorEntidade> relacionamentos = null;
        ProfessorEntidadeBO instance = new ProfessorEntidadeBOImpl();
        instance.createProfessorEntidade(relacionamentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ProfessorEntidadeBOImpl implements ProfessorEntidadeBO {

        public void createProfessorEntidade(List<ProfessorEntidade> relacionamentos) throws Exception {
        }
    }
    
}
