package models.NutrientFormulas.Proteins;

public class RequiredProteinsBehavior {
    IProteinsBehavior proteinsBehavior;

    public RequiredProteinsBehavior(IProteinsBehavior behavior){
        this.proteinsBehavior = behavior;
    }

    public void setProteinsBehavior(IProteinsBehavior proteinsBehavior) {
        this.proteinsBehavior = proteinsBehavior;
    }

    public int getRequiredOfProteins(int calories){
        return proteinsBehavior.process(calories);
    }
}
