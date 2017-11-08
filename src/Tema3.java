import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {

        // Sa se calculeze media aritmetica pana ce numarul citit este 0.

        int sum = 0;
        double count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers :");
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0)
                break;

            sum += num;
            count += 1;
        }

        System.out.println("Average: " + sum/count);


    }
}
