package models.NutrientFormulas.Carbohidrates;

public class CarbohydratesOnLoss implements ICarbohydratesBehavior {

    @Override
    public int process(int calories) {
        return (int)(calories*0.15/4);
    }
}
