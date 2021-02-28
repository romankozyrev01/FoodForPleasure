package models.NutrientFormulas.Carbohidrates;

public class CarbohydratesOnGain implements ICarbohydratesBehavior{

    @Override
    public int process(int calories) {
        return (int)(calories*0.5/4);
    }
}
