package models.MassIndexes;


import models.Height.IHeight;
import models.Weight.IWeight;
import models.Weight.Kilogram;

public class NoordenIndex implements IMassIndex{
    IHeight height;

    public NoordenIndex(IHeight height){
        this.height = height;
    }

    @Override
    public IWeight getIndex() {
        return new Kilogram(height.getHeight() * 0.42);
    }
}
