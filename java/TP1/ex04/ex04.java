import java.util.Scanner;
class ex04
{
    public static void main(String [] args)
    {
        Scanner s  = new Scanner(System.in);
        System.out.printf("Entrer la taille de tableau %n");
        int  a  = s.nextInt();
        int t [] = new int [a];
        int i = 0;
        while(i < a)
        {
            System.out.printf("Enter la valeur t[%d]%n",i);
            t[i] = s.nextInt();
            i++;
        }
        i = 0;
        while (i < a)
        {
            System.out.printf("t[%d] = %d%n", i, t[i]);
            i++;
        }
        System.out.printf("enter l'element cherche%n");
        int b = s.nextInt();
        i = 0;
        while(i < a)
        {
            if (t[i] == b)
            {
                System.out.printf("L'element saisie existe dans le tableau%n");
                break;
            }
            i++;
        }
        if(i == a)
            System.out.printf("L'element saisie n'existe pas dans le tableau%n");
        i = 0;
        while (i < a)
        {
            int occ = 0;
            int j = 0;
            while (j < a)
            {
                 if (t[j] == t[i])
                    occ++;
                j++;
             }
             System.out.printf("%d apparait %d fois%n", t[i], occ);
             i++;
        }
        int somme  = 0;
        float moyenne  = 0;
        int pair  = 0;
        i = 0;
        while (i < a)
        {
            if( t[i] % 2 == 0 )
            {
                somme += t[i];
                pair++;
            }
            i++;
        }
        if (pair  == 0)
            System.out.printf("aucun element pair dand le tableau");
        else
        {
            moyenne  = (float)somme / pair;
            System.out.printf("la moyenne des nombre pair est %.2f%n",moyenne);
        }
        s.close();

    }
}
