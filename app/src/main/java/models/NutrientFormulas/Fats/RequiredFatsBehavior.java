package models.NutrientFormulas.Fats;

public class RequiredFatsBehavior {
    IFatsOption fatsBehavior;

    public RequiredFatsBehavior(IFatsOption fatsBehavior){
        this.fatsBehavior = fatsBehavior;
    }

    public void setFatsBehavior(IFatsOption fatsBehavior) {
        this.fatsBehavior = fatsBehavior;
    }

    public int getRequiredFats(int calories){
        return fatsBehavior.process(calories);
    }
}
