package models.MassIndexes;



import models.Height.IHeight;
import models.Weight.IWeight;
import models.Weight.Kilogram;

import java.util.Dictionary;

public class MassIndex implements IMassIndex {
    private IHeight height;
    private IWeight weight;
    private String gender;

    public MassIndex(String gender, IWeight weight, IHeight height){
        this.height=height;
        this.weight=weight;
        this.gender=gender;
    }

    @Override
    public IWeight getIndex() {
        return new Kilogram(weight.getWeight()/Math.pow(height.getHeight(),2));
    }


    @Override
    public String toString() {
        weight = getIndex();
        if (gender.equals("Мужчина")) {
            if (weight.getWeight() < 19) {
                return "Недостаточная масса";
            } else if (weight.getWeight() >= 19 && weight.getWeight() <= 24) {
                return "Нормальный вес";
            } else if (weight.getWeight() >= 25 && weight.getWeight() < 30) {
                return "Избыточный вес";
            } else if (weight.getWeight() >= 30 && weight.getWeight() < 40) {
                return "Ожирвение";
            } else if (weight.getWeight() >= 40) {
                return "Избыточный вес";
            }
        } else{
            if (weight.getWeight() < 20) {
                return "Недостаточная масса";
            } else if (weight.getWeight() >= 20 && weight.getWeight() <= 25) {
                return "Нормальный вес";
            } else if (weight.getWeight() >= 26 && weight.getWeight() < 30) {
                return "Избыточный вес";
            } else if (weight.getWeight() >= 30 && weight.getWeight() < 40) {
                return "Ожирвение";
            } else if (weight.getWeight() >= 40) {
                return "Избыточный вес";
            }
        }
        return "Упс... что-то пошло не так.";
    }
}
