package models.MassIndexes;


import models.Height.IHeight;
import models.Weight.IWeight;
import models.Weight.Kilogram;

public class BreitmanIndex implements IMassIndex {
    IHeight height;

    public BreitmanIndex(IHeight height){
        this.height = height;
    }

    @Override
    public IWeight getIndex() {
        return new Kilogram(height.getHeight()*0.7-50);
    }
}
