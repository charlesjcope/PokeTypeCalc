import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String attackingType = getInput(sc, "What is your attacking type: ");
        String defendingType1 = getInput(sc, "What is your defending type 1: ");
        String defendingType2 = getInput(sc, "(leave null if mono-type) What is your defending type 2: ");

        double effectiveness = AttackCalculator.calculateEffectiveness(attackingType, defendingType1, defendingType2);
        System.out.println("Attack effectiveness: " + effectiveness);
    }

    private static String getInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        return sc.nextLine().trim().toLowerCase();
    }
}

