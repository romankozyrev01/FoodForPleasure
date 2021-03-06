package models.NutrientFormulas.Fats;

public class RequiredFatsBehavior {
    IFatsBehavior fatsBehavior;

    public RequiredFatsBehavior(IFatsBehavior fatsBehavior){
        this.fatsBehavior = fatsBehavior;
    }

    public void setFatsBehavior(IFatsBehavior fatsBehavior) {
        this.fatsBehavior = fatsBehavior;
    }

    public int getRequiredFats(int calories){
        return fatsBehavior.process(calories);
    }
}
