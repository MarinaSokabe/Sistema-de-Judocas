/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 31522051
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.fpij.jitakyoei.business.ProfessorBOImplTest.class, org.fpij.jitakyoei.business.AlunoBOImplTest.class, org.fpij.jitakyoei.business.EntidadeBOImplTest.class, org.fpij.jitakyoei.business.EntidadeBOTest.class, org.fpij.jitakyoei.business.ProfessorEntidadeBOTest.class, org.fpij.jitakyoei.business.AlunoBOTest.class, org.fpij.jitakyoei.business.ProfessorBOTest.class, org.fpij.jitakyoei.business.ProfessorEntidadeBOImplTest.class})
public class BusinessSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
