package models.MassIndexes;


import models.Height.IHeight;
import models.Weight.IWeight;
import models.Weight.Kilogram;

public class MassIndex implements IMassIndex {
    @Override
    public IWeight getIndex(IWeight weight, IHeight height) {
        return new Kilogram(weight.getWeight()/Math.pow(height.getHeight(),2));
    }
}
