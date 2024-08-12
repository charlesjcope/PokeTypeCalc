public class AttackCalculator {
    public static double calculateEffectiveness(String attackingType, String defendingType1, String defendingType2) {
        double effectiveness1 = TypeChart.getEffectiveness(attackingType, defendingType1);
        double effectiveness2 = TypeChart.getEffectiveness(attackingType, defendingType2);
        return effectiveness1 * effectiveness2;
    }
}
