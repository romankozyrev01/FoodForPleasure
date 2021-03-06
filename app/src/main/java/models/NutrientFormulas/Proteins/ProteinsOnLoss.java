package models.NutrientFormulas.Proteins;

public class ProteinsOnLoss implements IProteinsBehavior{
    @Override
    public int process(int calories) {
        return (int)(calories*0.45/4);
    }
}
