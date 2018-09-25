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
        
        Panier p = new Panier(5);
        
        p.ajouter(new Orange(5, "France"));
        p.ajouter(new Orange(0.8, "Allemagne"));
        p.ajouter(new Orange(6.9, "Pologne"));
        
        System.out.println(p.toString());
        
        p.boycotteOrigine("France");
        
        System.out.println(p.toString());
    }
}
