import java.util.Scanner;

public class ex1
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner (System.in);
        int max = 0;
        int min = 0;
        int i = 0;
        while(i < 3)
        {

            System.out.println("enter le nombre:");
            int a = s.nextInt();
            if(i == 0 || a <= min)
            {
                min = a;
            }
            if(i == 0 || a >= max)
            {
                max = a;
            }
            i++;
        }
            System.out.printf("le min des nombres est :%d%n",min);
            System.out.printf("le max des nombres est :%d%n",max);
         s.close();

    }
}
