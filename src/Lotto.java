import java.util.Random;

public class Lotto {
    public static void main(String[] args) {


        int nr1 = 0;
        int nr2 = 0;
        final int MAX = 6;
        boolean firstTime = true, stayRule = true;
        int counter = 0;
        while (firstTime || stayRule) {
            firstTime = false;
            nr1 = new Random().nextInt(MAX) + 1;
            nr2 = new Random().nextInt(MAX) + 1;
            stayRule = !(nr1 == nr2 && nr2 == 1);
            counter++;
        }
        int[] agencyNumbers = new int[6];
        int[] myNumbers = new int[6];
        int lucky = 0;
        int nrTickets = 0;

        final int NR = 1;

        // generez sirul agentiei , ideal n6 numere unice altfel e bug :)
        for (int j = 0; j < 6; j++) {
            agencyNumbers[j] = new Random().nextInt(49) + 1; //bug , make sure you fix it
        }

        // bucla while : atata timp cat nu am un bilet cu minim 4 numere ghicite fac ce-i mao jos
        while (lucky <= NR) {
            lucky = 0; // init becasue I play another ticket
            // generez sirul meu , ideal n6 numere unice altfel e bug :)
            for (int j = 0; j < 6; j++) {
                myNumbers[j] = new Random().nextInt(49) + 1; //bug , make sure you fix it
            }
            // gasesc cate am ghicite
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (agencyNumbers[j] == myNumbers[k])
                        lucky++; // buggy until we fix the bug on unique numbers
                }
            }
            // incrementez cu 1 numarul de bilete simple jucate
            nrTickets++;

        }
        // gata bucla atata timp

        System.out.println("am ghicit " + NR + " numar dupa " + nrTickets + " jucate");
        System.out.println("mynr:");
        for (int j = 0; j < 6; j++) {
            System.out.print(myNumbers[j] + ":");
        }

        System.out.println("\nagencynr:");
        for (int j = 0; j < 6; j++) {
            System.out.print(agencyNumbers[j] + ":");
        }
    }
}