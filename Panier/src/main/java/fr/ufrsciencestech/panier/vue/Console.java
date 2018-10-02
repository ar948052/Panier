/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.vue;

import java.util.Observable;
import java.util.Observer;
import fr.ufrsciencestech.panier.modele.*; 

/**
 *
 * @author ar948052
 */
public class Console implements Observer{
    
    public Console(){
            
        System.out.println("Contenance de base: 0");
    }

    @Override
    public void update(Observable o, Object arg) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Panier p = (Panier) o;
        System.out.println("Nouvelle contenance: " + p.getCapacite());
    }
    
}
