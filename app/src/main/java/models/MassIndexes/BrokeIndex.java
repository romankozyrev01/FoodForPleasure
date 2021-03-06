package models.MassIndexes;


import models.Height.IHeight;
import models.Weight.IWeight;
import models.Weight.Kilogram;

public class BrokeIndex implements IMassIndex {
    IHeight height;

    public BrokeIndex(IHeight height){
        this.height = height;
    }
    @Override
    public IWeight getIndex() {
        return new Kilogram(height.getHeight()-100);
    }
}
