package models.NutrientFormulas.Proteins;

public class ProteinsMaintaining implements IProteinsBehavior{
    @Override
    public int process(int calories) {
        return (int)(calories*0.3/4);
    }
}
