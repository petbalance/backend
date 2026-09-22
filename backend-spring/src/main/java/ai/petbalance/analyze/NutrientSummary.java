package ai.petbalance.analyze;

public record NutrientSummary(
        String nutrient,
        double demoMinMg,
        double demoMaxMg,
        String source,
        boolean verified,
        double totalMg,
        int productCount,
        boolean dataComplete,
        String status,
        double rangeRatio
) {}
