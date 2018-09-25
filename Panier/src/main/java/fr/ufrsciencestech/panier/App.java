package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Panier p = new Panier(4);
        Panier pVide = new Panier(2);
        
        p.ajouter(new Orange(5, "France"));
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
        
        System.out.println(p.getPrix());
    }
}
