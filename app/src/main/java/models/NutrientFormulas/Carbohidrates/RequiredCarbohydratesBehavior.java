package models.NutrientFormulas.Carbohidrates;

public class RequiredCarbohydratesBehavior {
    ICarbohydratesOption carbohydratesBehavior;

    public RequiredCarbohydratesBehavior(ICarbohydratesOption carbohydratesBehavior){
        this.carbohydratesBehavior = carbohydratesBehavior;
    }

    public void setCarbohydratesBehavior(ICarbohydratesOption carbohydratesBehavior) {
        this.carbohydratesBehavior = carbohydratesBehavior;
    }

    public int getRequiredCarbohydrates(int calories){
        return carbohydratesBehavior.process(calories);
    }
}

// TODO: 28.02.2021 Do classes renaming in NutrientFormulas package