package models.NutrientFormulas.Proteins;

public class ProteinsOnLoss implements IProteinsOption {
    @Override
    public int process(int calories) {
        return (int)(calories*0.45/4);
    }
}
