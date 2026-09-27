import java.util.Scanner;
class ex05
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
        i = 0;
        while ( i < a / 2 )
        {
            int tmp = t[i];
            t[i] = t[a - i - 1];
            t[a - i - 1] = tmp;
            i++;
        }
        System.out.printf("%n");
        i = 0;
        System.out.printf("%nTableau inverse :%n");
        while ( i < a )
        {
            System.out.printf(" t[%d] = %d%n", i, t[i]);
            i++;
        }
        i = a - 1;
        int tmp = t[a - 1];
        while (i > 0)
        {
            t[i] = t[i - 1];
            i--;
        }
        t[i] = tmp;
        System.out.printf("%nTableau decale :%n");
        i = 0;
        while (i < a)
        {
            System.out.printf("t[%d] = %d%n", i, t[i]);
            i++;
        }
         i = 0;
        while (i < a)
        {
            int j = i + 1;
            while(j < a)
            {
                if (t[j] < t[i])
                {
                    tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
                j++;
            }
            i++;
        }
        System.out.printf("%nTableau trie :%n");
         i = 0;
        while (i < a)
        {
            System.out.printf("t[%d] = %d%n", i, t[i]);
            i++;
        }
        i = 0;
        while (i < a - 1)
        {
            if (t[i] > t[i + 1])
            {
                System.out.printf("le tableau n'est pas bien trie");
                break;
            }
            i++;
        }
        if ( i == a - 1 )
            System.out.printf("le tableau est bien trie%n");
        i = 0;
        while (i < a - 1)
        {
            if (t[i] == t[i + 1])
             {
                System.out.printf("le tableau contient un doublon : %d%n", t[i]);
                break;
            }
            i++;
        }
        if (i == a - 1)
            System.out.printf("tous les elements sont uniques%n");
        s.close();
    }
}

