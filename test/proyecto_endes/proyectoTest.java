/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_endes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gervasio
 */
public class proyectoTest {
    
    public proyectoTest() {
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
     * Test of main method, of class proyecto.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        proyecto.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of factorial method, of class proyecto.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        proyecto.factorial();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
