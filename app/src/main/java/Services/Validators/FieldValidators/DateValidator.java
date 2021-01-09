package Services.Validators.FieldValidators;

public class DateValidator implements IFieldValidator {
    private String date;

    public DateValidator(String date){
        this.date = date;
    }

    @Override
    public Boolean isValidate() {
        return date != null;
    }
}
