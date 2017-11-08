import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {

        //Sa se calculeze media aritmetica a doua numere.

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        float Avg;
        System.out.println("Enter the 1st number :");
        a = input.nextInt();
        System.out.println("Enter the 2nd number :");
        b = input.nextInt();
        Avg = (a + b) / 2;
        System.out.println("The Average Is : " + Avg);

    }
}

        /* Imi place sa lucrez cu Scanner, mi se pare foarte tare. Initial am facut foarte simplu cu 2 numere cunoscute, dar nu mi-a placut :)

        int a = 30;
        int b = 12;
        int c = (a+b)/2;
        System.out.println("Average Is : " + c);


         */