import java.util.Scanner;
class ex02
{
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.printf("enter un nomber:%n");
        int a  = s.nextInt();
        int i = 1;
        int count  = 0;
        while(i <= a)
        {
            if (a % i == 0)
            {
                count++;
            }
            i++;
        }
        if(count == 2 )
            System.out.printf("le nombre saisie est premier %n");
        else
            System.out.printf("le nombre n'est pas premier  %n");
        System.out.println("les nombres premiers entre 1 et " + a + " :");
        int k = 2;
        while (k <= a)
        {
            int j = 2;
            while (j < k && k % j != 0)
                 j++;
            if (j == k)
                System.out.print(k + " ");
            k++;
        }
        System.out.println();
        s.close();

    }

 }
