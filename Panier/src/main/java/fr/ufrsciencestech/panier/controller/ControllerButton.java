/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.controller;

import fr.ufrsciencestech.panier.modele.Orange;
import fr.ufrsciencestech.panier.modele.Panier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ar948052
 */
public class ControllerButton implements ActionListener{

    Panier p;
    
    public ControllerButton(Panier p){
        this.p = p;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        JButton jb = (JButton)e.getSource();
        /*switch(jb.getName()){
            case "plus":
                p.ajouter(new Orange());
                break;
            case "moins":
                p.retirer();
                break;
            default:
                break;
                
        }*/
        
        if(jb.getName().equals("plus")) p.ajouter(new Orange());
        if(jb.getName().equals("moins")) p.retirer();
    }
    
}
