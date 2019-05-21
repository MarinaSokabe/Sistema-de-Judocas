/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view;

import org.fpij.jitakyoei.facade.AppFacade;
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
public class AppViewTest {
    
    public AppViewTest() {
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
     * Test of handleModelChange method, of class AppView.
     */
    @Test
    public void testHandleModelChange() {
        System.out.println("handleModelChange");
        Object obj = null;
        AppView instance = new AppViewImpl();
        instance.handleModelChange(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayException method, of class AppView.
     */
    @Test
    public void testDisplayException() {
        System.out.println("displayException");
        Exception e = null;
        AppView instance = new AppViewImpl();
        instance.displayException(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerFacade method, of class AppView.
     */
    @Test
    public void testRegisterFacade() {
        System.out.println("registerFacade");
        AppFacade facade = null;
        AppView instance = new AppViewImpl();
        instance.registerFacade(facade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AppViewImpl implements AppView {

        public void handleModelChange(Object obj) {
        }

        public void displayException(Exception e) {
        }

        public void registerFacade(AppFacade facade) {
        }
    }
    
}
