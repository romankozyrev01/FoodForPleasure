package models;


import models.Weight.IWeight;

import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long meal_id;
    private String name;
    private Integer colories;
    private Integer proteins;
    private Integer fats;
    private Integer carbohidrates;
    private Integer weight;
    private Integer row;

    public void setMealId(Long meal_id) {
        this.meal_id = meal_id;
    }

    public Long getMealId() {
        return meal_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getColories() {
        return colories;
    }

    public void setColories(Integer colories) {
        this.colories = colories;
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

    public Integer getCarbohidrates() {
        return carbohidrates;
    }

    public void setCarbohidrates(Integer carbohidrates) {
        this.carbohidrates = carbohidrates;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }
}
