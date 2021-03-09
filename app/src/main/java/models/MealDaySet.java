package models;

import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;

@Entity
@Table(name = "meal_day_set")
public class MealDaySet {

    @ManyToOne(targetEntity = DaySet.class)
    @JoinColumn(name = "day_set_id")
    private DaySet daySet;

    @ManyToOne(targetEntity = Meal.class)
    @JoinColumn(name = "meal_id")
    private Meal meal;

    public DaySet getDaySet() {
        return daySet;
    }

    public void setDaySet(DaySet daySet) {
        this.daySet = daySet;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
