package models.NutrientFormulas.Fats;

public class FatsOnGain implements IFatsBehavior {

    @Override
    public int process(int calories) {
        return (int)(calories*0.125/9);
    }
}
