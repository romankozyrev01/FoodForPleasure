package models.NutrientFormulas.Proteins;

public class ProteinsOnGain implements IProteinsOption {

    @Override
    public int process(int calories) {
        return (int)(calories * 0.3/4);
    }
}
