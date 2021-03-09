package models.NutrientFormulas.Carbohidrates;

public class CarbohydratesOnLoss implements ICarbohydratesOption {

    @Override
    public int process(int calories) {
        return (int)(calories*0.15/4);
    }
}
