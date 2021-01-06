package models.MassIndexes;


import models.Height.IHeight;
import models.Weight.IWeight;
import models.Weight.Kilogram;

public class NoordenIndex implements INormalMass{
    @Override
    public IWeight getNormalMass(IWeight weight, IHeight height) {
        return new Kilogram(height.getHeight() * 0.42);
    }
}
