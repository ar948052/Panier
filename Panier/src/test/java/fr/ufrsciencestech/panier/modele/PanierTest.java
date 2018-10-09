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
import static org.mockito.Mockito.*;

/**
 *
 * @author ar948052
 */
public class PanierTest {
    Panier pvide, pplein, p1, p2;
    Orange o1, o2;
    
    public PanierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pvide = new Panier(4);
        p1 = new Panier(4);
        p2 = new Panier(4);
        pplein = new Panier(4);
        o1 = new Orange();
        o2 = new Orange(0.50, "Espagne");
        p1.ajouter(o1);
        p2.ajouter(o1);
        p2.ajouter(o2);
        pplein.ajouter(o1);
        pplein.ajouter(o1);
        pplein.ajouter(o2);
        pplein.ajouter(o2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCapacite method, of class Panier.
     */
    @Test
    public void testGetCapacite() {
        System.out.println("getCapacite");
        int expResult = 4;
        int result = pplein.getCapacite();
        assertTrue(expResult == result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        boolean result = pplein.estPlein();
        assertTrue(result);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        boolean result = pvide.estVide();
        assertTrue(result);
    }

    /**
     * Test of ajouter method, of class Panier.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        p1.ajouter(o1);
    }

    /**
     * Test of retirer method, of class Panier.
     */
    @Test
    public void testRetirer() {
        System.out.println("retirer");
        p1.retirer();
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double result = p2.getPrix();
        assertTrue(result == 1.50);
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        String s = "Belgique";
        p1.ajouter(new Orange(5.0, s));
        p1.boycotteOrigine(s);
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String result = pplein.toString();
        assertTrue(!result.equals("") && (result != null));
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        assertTrue(p1.equals(p1));
    }
    
    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testNotEquals() {
        System.out.println("equals");
        Object s = new String();
        assertTrue(!p1.equals(s));
    }
    
    @Test
    public void testAjoutOrangeNull() {
        Orange onull = null;
        p1.ajouter(onull);
        assertTrue(p1.getCapacite() == 1);
    }
    
    @Test
    public void testPrixPanierA2Oranges() {
        Orange omock1 = mock(Orange.class);
        Orange omock2 = mock(Orange.class);
        when(omock1.getPrix()).thenReturn(1.0);
        when(omock2.getPrix()).thenReturn(0.5);
        pvide.ajouter(omock1);
        pvide.ajouter(omock2);
        assertTrue(pvide.getCapacite() == 2);
        assertTrue(pvide.getPrix() == 1.5);        
    }
    
}
