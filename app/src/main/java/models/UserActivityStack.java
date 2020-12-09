package models;

import models.Meal;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_activity_stack")
public class UserActivityStack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @OneToMany
    @JoinColumn(name = "meal_id")
    public List<Meal> mealList;

    @OneToMany
    @JoinColumn(name = "activity_id")
    public List<Activity> activityList;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    public Date date;

    public Long getId() {
        return id;
    }

    public List<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public void addActivity(Activity activity){
        this.activityList.add(activity);
    }

    public void addMeal(Meal meal){
        this.mealList.add(meal);
    }
}
