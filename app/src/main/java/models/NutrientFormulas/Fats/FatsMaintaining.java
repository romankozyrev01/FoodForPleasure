package models.NutrientFormulas.Fats;

public class FatsMaintaining implements IFatsOption {
    @Override
    public int process(int calories) {
        return (int)(calories*0.3/9);
    }
}
