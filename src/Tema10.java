import java.util.Scanner;

public class Tema10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float distance;
        float mps;
        System.out.print("Input turtle distance in km: ");
        float km = scanner.nextFloat();

        System.out.print("Input hours: ");
        float hr = scanner.nextFloat();

        distance = km/hr;
        mps = (distance *5)/18 ;
        System.out.println("Turtle speed in meters/second is "+mps);

        scanner.close();

    }
}
// Turtle travel distance in D km and H hours with scanner (^_^).