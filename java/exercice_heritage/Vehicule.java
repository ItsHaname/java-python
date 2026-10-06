/**
 * @(#)Vehicule.java
 *
 *
 * @author
 * @version 1.00 2026/10/6
 */

import java.time.Year;

public class Vehicule {
    private String marq, matr;
    private int annee;

    public Vehicule(String mr, String ma, int a) {
        this.marq=mr;
        this.matr=ma;
        this.annee=a;
    }
    public Vehicule(String mr, String mtr){
        this.marq=mr;
        this.matr=mtr;
    }
    public Vehicule(int a){
        this.annee=a;
    }

    // Getters
    public String getMarq(){
        return this.marq;
    }
    public String getMatr(){
        return this.matr;
    }
    public int getAnnee(){
        return this.annee;
    }

    // Setters
    public void setMarq(String mr){
        this.marq=mr;
    }
    public void setMatr(String ma){
        this.matr=ma;
    }
    public void setAnnee(int a){
        this.annee=a;
    }

    public int calculerAge(){
        return Year.now().getValue()-this.annee;
    }

    public void afficher(){
        System.out.println("Marque : "+this.marq+" Matricule :"+this.matr+" Annee : "+this.annee+" Age : "+calculerAge()+" ans");
    }
}
