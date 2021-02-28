package models.NutrientFormulas.Carbohidrates;

public class RequiredCarbohydratesBehavior {
    ICarbohydratesBehavior carbohydratesBehavior;

    public RequiredCarbohydratesBehavior(ICarbohydratesBehavior carbohydratesBehavior){
        this.carbohydratesBehavior = carbohydratesBehavior;
    }

    public void setCarbohydratesBehavior(ICarbohydratesBehavior carbohydratesBehavior) {
        this.carbohydratesBehavior = carbohydratesBehavior;
    }

    public int getRequiredCarbohydrates(int calories){
        return carbohydratesBehavior.process(calories);
    }
}

// TODO: 28.02.2021 Do classes renaming in NutrientFormulas package