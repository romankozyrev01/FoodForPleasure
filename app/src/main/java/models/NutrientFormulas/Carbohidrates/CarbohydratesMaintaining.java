package models.NutrientFormulas.Carbohidrates;

public class CarbohydratesMaintaining implements ICarbohydratesOption {

    @Override
    public int process(int calories) {
        return (int)(calories*0.4/4);
    }
}
