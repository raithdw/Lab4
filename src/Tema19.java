public class Tema19 {
    private static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] myArray = { 9,24 };
        System.out.println(contains(myArray, 9));
        System.out.println(contains(myArray, 25));
    }
}
