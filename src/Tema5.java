public class Tema5 {
//Se se afiseze o tabela de conversie din Fahrenheit in Celsius intre gradul X si gradul Y.

    private static float celsius(float fahrenheit) {
        float celsius;
        celsius = ((float) 5 / 9) * (fahrenheit - 32);
        return celsius;
        //metoda pentru return celsius. pentru ca nu am putut face return in void.
    }


    public static void main(String[] args) {
        float celsiusEquivalent;
        for (float currentFahrenheit = 0; currentFahrenheit <= 20; currentFahrenheit++) {
            celsiusEquivalent = celsius(currentFahrenheit);
            System.out.println("Fahrenheit : " + currentFahrenheit + "  =  Celsius : " + celsiusEquivalent);

        }


    }
}

