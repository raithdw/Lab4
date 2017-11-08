public class Tema9 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int min = 0;
        // Creating array of grade values
        int[] numbers = new int[] {82, 70, 99, 90, 92, 75, 87, 85, 91, 100, 91, 87};

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        double average = (double) sum / numbers.length;
        System.out.printf("    min:  " + min);
        System.out.printf("%n    max:  " + max);
        System.out.printf("%naverage:  %.1f", average);
    }
}
//Sir de numere cu sum, min, max. Dublat nu mai tin minte cum se face :D