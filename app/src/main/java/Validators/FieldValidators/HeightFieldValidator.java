package Validators.FieldValidators;

public class HeightFieldValidator implements IFieldValidator{
    private String height;

    public HeightFieldValidator(String height){
        this.height = height;
    }
    @Override
    public Boolean isValidate() {
        return height.length() >= 2;
    }
}
