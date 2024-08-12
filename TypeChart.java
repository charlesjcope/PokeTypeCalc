import java.util.HashMap;
import java.util.Map;

public class TypeChart {
    private static final Map<String, Map<String, Double>> typeChart = new HashMap<>();

    static {
        // Initialize type chart with effectiveness multipliers
        initializeTypeChart();
    }

    private static void initializeTypeChart() {
        // Populate type chart with effectiveness multipliers

        // Normal
        addTypeMatchup("normal", "rock", 0.5);
        addTypeMatchup("normal", "ghost", 0.0);
        addTypeMatchup("normal", "steel", 0.5);

        // Fire
        addTypeMatchup("fire", "fire", 0.5);
        addTypeMatchup("fire", "water", 0.5);
        addTypeMatchup("fire", "rock", 0.5);
        addTypeMatchup("fire", "dragon", 0.5);
        addTypeMatchup("fire", "grass", 2);
        addTypeMatchup("fire", "ice", 2);
        addTypeMatchup("fire", "bug", 2);
        addTypeMatchup("fire", "steel", 2);

        // Water
        addTypeMatchup("water", "water", 0.5);
        addTypeMatchup("water", "grass", 0.5);
        addTypeMatchup("water", "dragon", 0.5);
        addTypeMatchup("water", "fire", 2);
        addTypeMatchup("water", "ground", 2);
        addTypeMatchup("water", "rock", 2);

        // Electric
        addTypeMatchup("electric", "ground", 0);
        addTypeMatchup("electric", "electric", 0.5);
        addTypeMatchup("electric", "grass", 0.5);
        addTypeMatchup("electric", "dragon", 0.5);
        addTypeMatchup("electric", "water", 2);
        addTypeMatchup("electric", "flying", 2);

        // Grass
        addTypeMatchup("grass", "grass", 0.5);
        addTypeMatchup("grass", "fire", 0.5);
        addTypeMatchup("grass", "dragon", 0.5);
        addTypeMatchup("grass", "steel", 0.5);
        addTypeMatchup("grass", "poison", 0.5);
        addTypeMatchup("grass", "bug", 0.5);
        addTypeMatchup("grass", "flying", 0.5);
        addTypeMatchup("grass", "ground", 2);
        addTypeMatchup("grass", "rock", 2);
        addTypeMatchup("grass", "water", 2);

        // Ice
        addTypeMatchup("ice", "fire", 0.5);
        addTypeMatchup("ice", "water", 0.5);
        addTypeMatchup("ice", "ice", 0.5);
        addTypeMatchup("ice", "steel", 0.5);
        addTypeMatchup("ice", "ground", 2);
        addTypeMatchup("ice", "flying", 2);
        addTypeMatchup("ice", "dragon", 2);
        addTypeMatchup("ice", "grass", 2);

        // Fighting
        addTypeMatchup("fighting", "normal", 2);
        addTypeMatchup("fighting", "rock", 2);
        addTypeMatchup("fighting", "steel", 2);
        addTypeMatchup("fighting", "ice", 2);
        addTypeMatchup("fighting", "dark", 2);
        addTypeMatchup("fighting", "poison", 0.5);
        addTypeMatchup("fighting", "flying", 0.5);
        addTypeMatchup("fighting", "psychic", 0.5);
        addTypeMatchup("fighting", "bug", 0.5);
        addTypeMatchup("fighting", "ghost", 0.0);

        // Poison
        addTypeMatchup("poison", "grass", 2);
        addTypeMatchup("poison", "fairy", 2);
        addTypeMatchup("poison", "poison", 0.5);
        addTypeMatchup("poison", "ground", 0.5);
        addTypeMatchup("poison", "rock", 0.5);
        addTypeMatchup("poison", "ghost", 0.5);
        addTypeMatchup("poison", "steel", 0.0);

        // Ground
        addTypeMatchup("ground", "fire", 2);
        addTypeMatchup("ground", "electric", 2);
        addTypeMatchup("ground", "poison", 2);
        addTypeMatchup("ground", "rock", 2);
        addTypeMatchup("ground", "steel", 2);
        addTypeMatchup("ground", "grass", 0.5);
        addTypeMatchup("ground", "bug", 0.5);
        addTypeMatchup("ground", "flying", 0.0);

        // Flying
        addTypeMatchup("flying", "grass", 2);
        addTypeMatchup("flying", "fighting", 2);
        addTypeMatchup("flying", "bug", 2);
        addTypeMatchup("flying", "rock", 0.5);
        addTypeMatchup("flying", "steel", 0.5);
        addTypeMatchup("flying", "electric", 0.5);

        // Psychic
        addTypeMatchup("psychic", "fighting", 2);
        addTypeMatchup("psychic", "poison", 2);
        addTypeMatchup("psychic", "psychic", 0.5);
        addTypeMatchup("psychic", "steel", 0.5);
        addTypeMatchup("psychic", "dark", 0.0);

        // Bug
        addTypeMatchup("bug", "grass", 2);
        addTypeMatchup("bug", "psychic", 2);
        addTypeMatchup("bug", "dark", 2);
        addTypeMatchup("bug", "fighting", 0.5);
        addTypeMatchup("bug", "flying", 0.5);
        addTypeMatchup("bug", "poison", 0.5);
        addTypeMatchup("bug", "ghost", 0.5);
        addTypeMatchup("bug", "steel", 0.5);
        addTypeMatchup("bug", "fire", 0.5);
        addTypeMatchup("bug", "fairy", 0.5);

        // Rock
        addTypeMatchup("rock", "fire", 2);
        addTypeMatchup("rock", "ice", 2);
        addTypeMatchup("rock", "flying", 2);
        addTypeMatchup("rock", "bug", 2);
        addTypeMatchup("rock", "fighting", 0.5);
        addTypeMatchup("rock", "ground", 0.5);
        addTypeMatchup("rock", "steel", 0.5);

        // Ghost
        addTypeMatchup("ghost", "ghost", 2);
        addTypeMatchup("ghost", "psychic", 2);
        addTypeMatchup("ghost", "normal", 0.0);
        addTypeMatchup("ghost", "dark", 0.5);

        // Dragon
        addTypeMatchup("dragon", "dragon", 2);
        addTypeMatchup("dragon", "steel", 0.5);
        addTypeMatchup("dragon", "fairy", 0.0);

        // Dark
        addTypeMatchup("dark", "psychic", 2);
        addTypeMatchup("dark", "ghost", 2);
        addTypeMatchup("dark", "fighting", 0.5);
        addTypeMatchup("dark", "dark", 0.5);
        addTypeMatchup("dark", "fairy", 0.5);

        // Steel
        addTypeMatchup("steel", "rock", 2);
        addTypeMatchup("steel", "ice", 2);
        addTypeMatchup("steel", "fairy", 2);
        addTypeMatchup("steel", "steel", 0.5);
        addTypeMatchup("steel", "fire", 0.5);
        addTypeMatchup("steel", "water", 0.5);
        addTypeMatchup("steel", "electric", 0.5);

        // Fairy
        addTypeMatchup("fairy", "fighting", 2);
        addTypeMatchup("fairy", "dragon", 2);
        addTypeMatchup("fairy", "dark", 2);
        addTypeMatchup("fairy", "poison", 0.5);
        addTypeMatchup("fairy", "steel", 0.5);
        addTypeMatchup("fairy", "fire", 0.5);
    }


    private static void addTypeMatchup(String attackingType, String defendingType, double effectiveness) {
        typeChart.computeIfAbsent(attackingType, k -> new HashMap<>()).put(defendingType, effectiveness);
    }

    public static double getEffectiveness(String attackingType, String defendingType) {
        Map<String, Double> matchups = typeChart.get(attackingType);
        return matchups != null ? matchups.getOrDefault(defendingType, 1.0) : 1.0;
    }
}
