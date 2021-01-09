package models.MassIndexes;


import models.Height.IHeight;
import models.Weight.IWeight;
import models.Weight.Kilogram;

public class TatonIndex implements IMassIndex {
    IHeight height;

    public TatonIndex(IHeight height){
        this.height = height;
    }
    @Override
    public IWeight getIndex() {
        return new Kilogram(height.getHeight()-(100+(height.getHeight()-100)/20));
    }
}
