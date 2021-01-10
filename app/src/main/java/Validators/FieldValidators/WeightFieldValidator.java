package Validators.FieldValidators;

public class WeightFieldValidator implements IFieldValidator{
    private String weight;

    public WeightFieldValidator(String weight){
        this.weight = weight;
    }
    @Override
    public Boolean isValidate() {
        return weight.length() >= 2;
    }
}
