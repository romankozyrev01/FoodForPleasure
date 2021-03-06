package models.NutrientFormulas.Proteins;

public class ProteinsOnGain implements IProteinsBehavior {

    @Override
    public int process(int calories) {
        return (int)(calories * 0.3/4);
    }
}
