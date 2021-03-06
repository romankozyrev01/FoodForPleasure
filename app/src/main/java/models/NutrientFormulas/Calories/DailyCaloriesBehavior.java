package models.NutrientFormulas.Calories;

public class DailyCaloriesBehavior implements IDailyCaloriesBehavior {
    Double weight;
    Integer height;
    Integer age;

    public DailyCaloriesBehavior(Double weight, Integer height, Integer age){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int process() {
        return (int)(10 * weight + 6.25 * height + 5 * age - 161);
    }
}
