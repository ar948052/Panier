/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.modele;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

/**
 *
 * @author ar948052
 */
public class Panier extends Observable{
    private ArrayList<Orange> listeOrange;
    private int capacitePanier = 5;
    
    public int getCapacite(){
        return listeOrange.size();
    }
        
    public Panier(int cp){
        listeOrange = new ArrayList();
        capacitePanier = capacitePositive(cp);
    }
    
    
    private int capacitePositive(int cp){
        Scanner scn = new Scanner(System.in);
        while(cp<0.0){
            System.out.println("La capacite doit etre positive");
            cp = scn.nextInt();
        }
        return cp;
    }
    
    public boolean estPlein(){
        return capacitePanier == listeOrange.size();
    }
    
    public boolean estVide(){
        return 0 == listeOrange.size();
    }
    
    public void ajouter(Orange o){
        if(!estPlein() && o != null){
            listeOrange.add(o);
            this.setChanged();
            this.notifyObservers();
        }
        
    }
    
    public void retirer(){
        if(!estVide()) {
            listeOrange.remove(listeOrange.size()-1);
            this.setChanged();
            this.notifyObservers();
        }
    }
    
    public double getPrix(){
        double somme = 0;
        
        for(Orange o : listeOrange){
            somme += o.getPrix();
        }
        
        return somme;
    }
    
    public void boycotteOrigine(String s){        
        ArrayList<Orange> al = new ArrayList();
        
        for(Orange o: listeOrange){
            if(!o.getOrigine().equals(s)) al.add(o);
        }
        
        this.listeOrange = new ArrayList(al);
    }

    @Override
    public String toString(){
        String s = "";
        for(Orange o : listeOrange){
            s += o.toString() + "\n";
        } 
        return s;
    }
    
    @Override
    public boolean equals(Object obj){
        Panier p;
        if(obj.getClass() == this.getClass()){ 
            p = (Panier)obj;
            if(this.capacitePanier != p.capacitePanier) return false;
            if(this.listeOrange.size() != p.listeOrange.size()) return false;

            for(int i = 0; i < listeOrange.size(); i++){
                if(!this.listeOrange.get(i).equals(p.listeOrange.get(i))) return false;
            }
            return true;
        }
        return false;
    }
}
