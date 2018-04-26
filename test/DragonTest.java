/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derek
 */
public class DragonTest {
    
    public DragonTest() {
    }
   
    /**
     * Test of getCost method, of class Dragon.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Dragon instance = new Dragon();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getName method, of class Dragon.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Dragon instance = new Dragon(0.0, "Russell", 9, 8.8, 66.6, 7);
        String expResult = "Russell";
        String result = instance.getName();
        System.out.println("expect: "+ expResult);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getAge method, of class Dragon.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Dragon instance = new Dragon();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getWeight method, of class Dragon.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Dragon instance = new Dragon();
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHeight method, of class Dragon.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Dragon instance = new Dragon();
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getID method, of class Dragon.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Dragon instance = new Dragon();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
}
