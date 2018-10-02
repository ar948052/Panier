/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.vue;

import fr.ufrsciencestech.panier.controller.ControllerButton;
import fr.ufrsciencestech.panier.modele.Panier;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author ar948052
 */
public class FenetreAWT extends Frame implements Observer{
    
    private Panier p;
    private Button plus, moins;
    private Label l;
    
    
    public FenetreAWT(Panier p){
        super();
        this.p = p;
        plus = new Button("+");
        moins = new Button("-");
        l = new Label(this.p.getCapacite()+"");
        
        Dimension db = new Dimension(50,50);
        l.setLocation(150, 50);
        plus.setMinimumSize(db);
        moins.setMinimumSize(db);
        plus.setBackground(Color.yellow);
        plus.setLocation(new Point(50,50));
        moins.setLocation(new Point(300,50));
        this.setMinimumSize(new Dimension(400,400));
        
        this.add(plus);
        this.add(moins);
        this.add(l);
        
        ControllerButton cb = new ControllerButton(p);  
        plus.addActionListener(cb);
        moins.addActionListener(cb);
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }        
        });
        
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        Panier p = (Panier)o;
        this.l.setText(p.getCapacite()+"");
    }
}
