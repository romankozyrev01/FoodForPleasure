package models.NutrientFormulas.Proteins;

public class ProteinsMaintaining implements IProteinsOption {
    @Override
    public int process(int calories) {
        return (int)(calories*0.3/4);
    }
}
