import java.util.Scanner;

class ex03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entrer un nombre:");   // S majuscule
        int a = s.nextInt();                        // parenthèses ()

        int i = 1;
        int somme = 0;
        while (i < a) {
            if (a % i == 0)
                somme += i;
            i++;
        }
        if (somme == a)
            System.out.println("le nombre saisi est parfait");
        else
            System.out.println("le nombre saisi n'est pas parfait");

        System.out.println("les nombres parfaits entre 1 et " + a + " :");
        int k = 1;
        while (k <= a) {
            int sommeK = 0;
            int j = 1;
            while (j < k) {
                if (k % j == 0)
                    sommeK += j;
                j++;
            }
            if (sommeK == k)
                System.out.print(k + " ");
            k++;
        }
        System.out.println();
        s.close();
    }
}
