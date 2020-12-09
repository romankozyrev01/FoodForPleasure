package models;


import models.Weight.IWeight;

public class Meal {
    private String uniqueID;
    private String name;
    private IWeight colories;
    private IWeight proteins;
    private IWeight fats;
    private IWeight carbohidrates;
    private IWeight weight;
    private IWeight row;

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public IWeight getColories() {
        return colories;
    }

    public void setColories(IWeight colories) {
        this.colories = colories;
    }

    public IWeight getProteins() {
        return proteins;
    }

    public void setProteins(IWeight proteins) {
        this.proteins = proteins;
    }

    public IWeight getFats() {
        return fats;
    }

    public void setFats(IWeight fats) {
        this.fats = fats;
    }

    public IWeight getCarbohidrates() {
        return carbohidrates;
    }

    public void setCarbohidrates(IWeight carbohidrates) {
        this.carbohidrates = carbohidrates;
    }

    public IWeight getWeight() {
        return weight;
    }

    public void setWeight(IWeight weight) {
        this.weight = weight;
    }

    public IWeight getRow() {
        return row;
    }

    public void setRow(IWeight row) {
        this.row = row;
    }
}
