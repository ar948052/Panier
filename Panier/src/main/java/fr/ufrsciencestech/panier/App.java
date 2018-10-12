package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.modele.Orange;
import fr.ufrsciencestech.panier.modele.Panier;
import fr.ufrsciencestech.panier.vue.Console;
import fr.ufrsciencestech.panier.vue.FenetreAWT;
import fr.ufrsciencestech.panier.vue.FenetreSwing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Tests TP1
        //System.out.println( "Hello World!" );
        
        //Panier pVide = new Panier(2);
        
        /*p.ajouter(new Orange(5, "France"));
        p.ajouter(new Orange(0.8, "Allemagne"));
        p.ajouter(new Orange(6.9, "Pologne"));
        p.ajouter(new Orange(5.6, "eee"));
        
        System.out.println(p.toString());
        
        p.boycotteOrigine("France");
        
        p.ajouter(new Orange(5.3, "France"));
        
        System.out.println(p.toString());
        
        if(p.estPlein()) System.out.println("plein");
        else System.out.println("erreur");
        if(pVide.estVide()) System.out.println("vide");
        
        System.out.println(p.getPrix());*/
        
        //TP2        
        Panier p = new Panier(40);
        Console c = new Console();
        FenetreSwing fs = new FenetreSwing(p);
        FenetreAWT fa = new FenetreAWT(p);
        
        p.addObserver(c);
        p.addObserver(fs);
        p.addObserver(fa);
        
        
        p.ajouter(new Orange(0.8, "Allemagne"));
        p.ajouter(new Orange(6.9, "Pologne"));
        p.ajouter(new Orange(5.6, "eee"));
        p.ajouter(new Orange(5.5, "eeee"));
        p.retirer();
    }
}
