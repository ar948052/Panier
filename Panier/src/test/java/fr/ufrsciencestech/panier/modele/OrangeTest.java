/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ar948052
 */
public class OrangeTest {
    
    public OrangeTest() {
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
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange(2.0,"France");
        double expResult = 2.0;
        double result = instance.getPrix();
        assertTrue(result == expResult);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Orange instance = new Orange(2.0,"France");
        String expResult = "France";
        String result = instance.getOrigine();
        assertTrue(result.equals(expResult));
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange();
        String result = instance.toString();
        assertTrue((result != "") && (result != null));
    }

    /**
     * Test of equals method, of class Orange.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Orange();
        Orange instance = new Orange();
        assertTrue(instance.equals(obj));
    }
    
    /**
     * Test 2 of equals method, of class Orange.
     */
    @Test
    public void testNotEquals() {
        System.out.println("equals");
        Object obj = new String();
        Orange instance = new Orange();
        assertTrue(!instance.equals(obj));
    }
    
}
