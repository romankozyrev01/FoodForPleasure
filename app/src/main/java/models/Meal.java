package models;


import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long meal_id;

    @Column(name = "name")
    private String name;

    @Column(name = "calories")
    private Integer calories;

    @Column(name = "proteins")
    private Integer proteins;

    @Column(name = "fats")
    private Integer fats;

    @Column(name = "carbohydrates")
    private Integer carbohydrates;

    @Column(name = "weight")
    private Integer weight;



    public Long getMealId() {
        return meal_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getProteins() {
        return proteins;
    }

    public void setProteins(Integer proteins) {
        this.proteins = proteins;
    }

    public Integer getFats() {
        return fats;
    }

    public void setFats(Integer fats) {
        this.fats = fats;
    }

    public Integer getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Integer carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
