package Services;

import models.NutrientFormulas.Carbohidrates.ICarbohydratesOption;
import models.NutrientFormulas.Carbohidrates.RequiredCarbohydratesBehavior;
import models.NutrientFormulas.Fats.IFatsOption;
import models.NutrientFormulas.Fats.RequiredFatsBehavior;
import models.NutrientFormulas.Proteins.IProteinsOption;
import models.NutrientFormulas.Proteins.RequiredProteinsBehavior;

public class NutrientsService {
    private final IProteinsOption iProteinsOption;
    private final IFatsOption iFatsOption;
    private final ICarbohydratesOption iCarbohydratesOption;
    private final int calories;

    private int requiredProteins;
    private int requiredFats;
    private int requiredCarbohydrates;

    public NutrientsService(IProteinsOption iProteinsOption,
                            IFatsOption iFatsOption,
                            ICarbohydratesOption iCarbohydratesOption,
                            int calories){
        this.iProteinsOption = iProteinsOption;
        this.iFatsOption = iFatsOption;
        this.iCarbohydratesOption = iCarbohydratesOption;
        this.calories = calories;
    }

    public void processNutrients(){
        RequiredProteinsBehavior proteinsBehavior= new RequiredProteinsBehavior(iProteinsOption);
        RequiredFatsBehavior fatsBehavior = new RequiredFatsBehavior(iFatsOption);
        RequiredCarbohydratesBehavior requiredCarbohydratesBehavior = new RequiredCarbohydratesBehavior(iCarbohydratesOption);

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
