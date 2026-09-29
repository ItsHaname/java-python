/**
 * @(#)CompteBancaire.java
 *
 *
 * @author
 * @version 1.00 2026/9/29
 */


public class CompteBancaire {
	private int num;
	private float solde;
	Proprietaire p;

    public CompteBancaire(int n, float s, Proprietaire pr) {
    	this.num=n;
    	this.solde=s;
    	this.p=pr;
    }

    public int getNum(){
    	return this.num;
    }
    public float getSolde(){
    	return this.solde;
    }
    public Proprietaire getProprietaire(){
    	return this.p;
    }

    public void setNum(int n){
    	this.num=n;
    }
    public void setProprietaire(Proprietaire pr){
    	this.p=pr;
    }

    public void deposer(float montant){
    	if(montant>0){
    		this.solde=this.solde+montant;
    		System.out.println("Depot de "+montant+" effectue");
    	}
    	else{
    		System.out.println("Montant invalide");
    	}
    }

    public void retirer(float montant){
    	if(montant<=0){
    		System.out.println("Montant invalide");
    	}
    	else if(montant>this.solde){
    		System.out.println("Solde insuffisant");
    	}
    	else{
    		this.solde=this.solde-montant;
    		System.out.println("Retrait de "+montant+" effectue");
    	}
    }

    public void afficherCompte(){
    	System.out.println("Num Compte : "+this.num);
    	System.out.println("Solde : "+this.solde);
    	System.out.println("Donnees du proprietaire:");
    	p.afficherProp();
    }

    public static void main(String[] arg){
    	Proprietaire p1= new Proprietaire("EE0002", "ALI", "AHMED", 45);
    	CompteBancaire c1= new CompteBancaire(1234, 1000f, p1);
    	c1.afficherCompte();

    	System.out.println("*****************************");
    	c1.deposer(500f);
    	c1.retirer(200f);
    	c1.retirer(5000f);
    	System.out.println("******************************");
    	c1.afficherCompte();
    }


}
