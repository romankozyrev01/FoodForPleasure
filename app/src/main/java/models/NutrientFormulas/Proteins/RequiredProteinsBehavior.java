package models.NutrientFormulas.Proteins;

public class RequiredProteinsBehavior {
    IProteinsOption proteinsBehavior;

    public RequiredProteinsBehavior(IProteinsOption behavior){
        this.proteinsBehavior = behavior;
    }

    public void setProteinsBehavior(IProteinsOption proteinsBehavior) {
        this.proteinsBehavior = proteinsBehavior;
    }

    public int getRequiredOfProteins(int calories){
        return proteinsBehavior.process(calories);
    }
}
