package models.NutrientFormulas.Fats;

public class FatsMaintaining implements IFatsBehavior{
    @Override
    public int process(int calories) {
        return (int)(calories*0.3/9);
    }
}
