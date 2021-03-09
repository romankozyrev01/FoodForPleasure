package models.NutrientFormulas.Carbohidrates;

public class CarbohydratesOnGain implements ICarbohydratesOption {

    @Override
    public int process(int calories) {
        return (int)(calories*0.5/4);
    }
}
