import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {

        //Sa se calculeze media aritmetica a N numere.

        int n;
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter How Many Numbers To Call Average");

        n = input.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " Numbers");

        for (int i = 0; i < n; i++) {

            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {

            result = result + a[i];

        }

        System.out.println("Average = " + result / n);

    }


}


