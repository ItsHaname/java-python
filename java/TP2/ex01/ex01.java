import java.time.LocalDateTime;

class CompteBancaire
{
    private int id;
    private double solde;
    private LocalDateTime dateCreation;
    private String CIN;

    CompteBancaire(int id, double solde, String CIN)
    {
        this.id = id;
        this.solde = solde;
        this.dateCreation = LocalDateTime.now();
        this.CIN = CIN;
    }
    CompteBancaire(double solde)
    {
        this.solde = solde;
        this.dateCreation = LocalDateTime.now();
    }
    CompteBancaire(double solde, String CIN)
    {
        this.solde = solde;
        this.CIN = CIN;
        this.dateCreation = LocalDateTime.now();
    }
    CompteBancaire(double solde, int id)
    {
        this.solde = solde;
        this.id = id;
        this.dateCreation = LocalDateTime.now();
    }
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public double getSolde()
    {
        return this.solde;
    }
    public void setSolde(double solde)
    {
        this.solde = solde;
    }
    public String getCin()
    {
        return this.CIN;
    }
    public void setCin(String CIN)
    {
        this.CIN = CIN;
    }
    public LocalDateTime getDateCreation()
    {
        return this.dateCreation;
    }
    public void setDateCreation(LocalDateTime dateCreation)
    {
        this.dateCreation = dateCreation;
    }
    public void affiche()
    {
        System.out.printf("ton id est :%d%n",this.id);
        System.out.printf("ton solde est :%.2f%n",this.solde);
        System.out.printf("la date de creation de compte est:%s%n",this.dateCreation);
        System.out.printf("ton CIN est:%s%n",this.CIN);
    }
    public void consulterSolde()
    {
        System.out.printf("voila votre solde:%.2f%n",this.solde);
    }
    public void deposer(double ajouter)
    {
        if (ajouter > 0)
        {
            this.solde += ajouter;
            consulterSolde();
        }
        else
            System.out.printf("montant invalide%n");
    }
    public void retirer(double argent)
    {
        if (argent <= 0)
            System.out.printf("montant invalide%n");
        else if (argent > this.solde)
            System.out.printf("solde insuffisant%n");
        else
        {
            this.solde -= argent;
            consulterSolde();
        }
    }
    public void virement(CompteBancaire a, double montant)
    {
        if ( montant <= 0 )
            System.out.printf("montant invalide%n");
        else if (montant > solde)
            System.out.printf("solde insuffisant%n");
        else
        {
            this.solde -= montant;
            a.solde += montant;
            System.out.printf("Solde du compte emetteur : ");
            consulterSolde();
            System.out.printf("Solde du compte destinataire : ");
            a.consulterSolde();

        }
    }
}
class ex01
{
    public static void main(String[] args)
    {
        CompteBancaire c1 = new CompteBancaire(1, 5000, "EE123456");
        CompteBancaire c2 = new CompteBancaire(3000);
        CompteBancaire c3 = new CompteBancaire(2000, "BK987654");
        CompteBancaire c4 = new CompteBancaire(1500, 4);

        System.out.printf("%n--- Compte 1 ---%n");
        c1.affiche();
        System.out.printf("%n--- Compte 2 ---%n");
        c2.affiche();
        System.out.printf("%n--- Compte 3 ---%n");
        c3.affiche();
        System.out.printf("%n--- Compte 4 ---%n");
        c4.affiche();

        CompteBancaire compteA = new CompteBancaire(10, 25000, "EE111111");
        CompteBancaire compteB = new CompteBancaire(20, 8000, "JB222222");

        System.out.printf("%n--- Soldes initiaux ---%n");
        compteA.consulterSolde();
        compteB.consulterSolde();

        System.out.printf("%n--- Tests sur le compte A ---%n");
        compteA.deposer(2000);
        compteA.deposer(-500);
        compteA.retirer(1000);
        compteA.retirer(100000);
        compteA.retirer(0);
        compteA.consulterSolde();

        System.out.printf("%n--- Virement de 10000 dh ---%n");
        compteA.virement(compteB, 10000);
    }
}

