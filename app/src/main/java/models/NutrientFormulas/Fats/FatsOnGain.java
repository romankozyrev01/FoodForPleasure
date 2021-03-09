package models.NutrientFormulas.Fats;

public class FatsOnGain implements IFatsOption {

    @Override
    public int process(int calories) {
        return (int)(calories*0.125/9);
    }
}
