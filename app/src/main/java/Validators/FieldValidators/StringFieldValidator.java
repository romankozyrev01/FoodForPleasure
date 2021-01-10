package Validators.FieldValidators;

public class StringFieldValidator implements IFieldValidator {
    private String text;

    public StringFieldValidator(String text) {
        this.text = text;
    }

    @Override
    public Boolean isValidate() {
        return text.length() >= 2;
    }
}
