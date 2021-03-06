package Services;

import models.NutrientFormulas.Carbohidrates.ICarbohydratesBehavior;
import models.NutrientFormulas.Carbohidrates.RequiredCarbohydratesBehavior;
import models.NutrientFormulas.Fats.IFatsBehavior;
import models.NutrientFormulas.Fats.RequiredFatsBehavior;
import models.NutrientFormulas.Proteins.IProteinsBehavior;
import models.NutrientFormulas.Proteins.RequiredProteinsBehavior;

public class NutrientsService {
    private final IProteinsBehavior iProteinsBehavior;
    private final IFatsBehavior iFatsBehavior;
    private final ICarbohydratesBehavior iCarbohydratesBehavior;
    private final int calories;

    private int requiredProteins;
    private int requiredFats;
    private int requiredCarbohydrates;

    public NutrientsService(IProteinsBehavior iProteinsBehavior,
                            IFatsBehavior iFatsBehavior,
                            ICarbohydratesBehavior iCarbohydratesBehavior,
                            int calories){
        this.iProteinsBehavior = iProteinsBehavior;
        this.iFatsBehavior = iFatsBehavior;
        this.iCarbohydratesBehavior = iCarbohydratesBehavior;
        this.calories = calories;
    }

    public void processNutrients(){
        RequiredProteinsBehavior proteinsBehavior= new RequiredProteinsBehavior(iProteinsBehavior);
        RequiredFatsBehavior fatsBehavior = new RequiredFatsBehavior(iFatsBehavior);
        RequiredCarbohydratesBehavior requiredCarbohydratesBehavior = new RequiredCarbohydratesBehavior(iCarbohydratesBehavior);

        this.requiredProteins = proteinsBehavior.getRequiredOfProteins(this.calories);
        this.requiredFats = fatsBehavior.getRequiredFats(this.calories);
        this.requiredCarbohydrates = requiredCarbohydratesBehavior.getRequiredCarbohydrates(this.calories);
    }

    public int getRequiredProteins() {
        this.processNutrients();
        return requiredProteins;
    }

    public int getRequiredCarbohydrates() {
        this.processNutrients();
        return requiredCarbohydrates;
    }

    public int getRequiredFats() {
        this.processNutrients();
        return requiredFats;
    }
}
