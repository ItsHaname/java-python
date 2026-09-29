/**
 * @(#)Proprietaire.java
 *
 *
 * @author
 * @version 1.00 2026/9/29
 */


public class Proprietaire {
	private String cin, nom, prenom;
	private int age;


    public Proprietaire(String c, String n, String p, int a) {
    	this.cin=c;
    	this.nom=n;
    	this.prenom=p;
    	this.age=a;
    }

    public String getCin(){
    	return this.cin;
    }
    public String getNom(){
    	return this.nom;
    }
    public String getPrenom(){
    	return this.prenom;
    }
    public int getAge(){
    	return this.age;
    }

    public void setCin(String c){
    	this.cin=c;
    }
    public void setNom(String n){
    	this.nom=n;
    }
    public void setPrenom(String p){
    	this.prenom=p;
    }
    public void setAge(int a){
    	this.age=a;
    }

    public void afficherProp(){
    	System.out.println("CIN = "+this.cin);
    	System.out.println("Nom = "+this.nom);
    	System.out.println("Prenom = "+this.prenom);
    	System.out.println("Age = "+this.age);
    }


}
