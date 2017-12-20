/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class CalcularTest {
    
    public CalcularTest() {
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
     * Test of getNum01 method, of class Calcular.
     */
    @Test
    public void testGetNum01() {
        System.out.println("getNum01");
        Calcular instance = new Calcular();
        float expResult = 0.0F;
        float result = instance.getNum01();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum01 method, of class Calcular.
     */
    @Test
    public void testSetNum01() {
        System.out.println("setNum01");
        float num01 = 0.0F;
        Calcular instance = new Calcular();
        instance.setNum01(num01);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum02 method, of class Calcular.
     */
    @Test
    public void testGetNum02() {
        System.out.println("getNum02");
        Calcular instance = new Calcular();
        float expResult = 0.0F;
        float result = instance.getNum02();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum02 method, of class Calcular.
     */
    @Test
    public void testSetNum02() {
        System.out.println("setNum02");
        float num02 = 0.0F;
        Calcular instance = new Calcular();
        instance.setNum02(num02);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soma method, of class Calcular.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        float num01 = 0.0F;
        float num02 = 0.0F;
        Calcular instance = new Calcular();
        float expResult = 0.0F;
        float result = instance.soma(num01, num02);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
