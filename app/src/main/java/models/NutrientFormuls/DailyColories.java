package models.NutrientFormuls;

public class DailyColories implements IDailyNutrients{
    Double weight;
    Integer height;
    Integer age;

    public DailyColories(Double weight, Integer height, Integer age){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int process() {
        return (int)(10 * weight + 6.25 * height + 5 * age - 161);
    }
}
