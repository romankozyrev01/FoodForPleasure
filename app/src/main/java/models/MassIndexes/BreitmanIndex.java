package models.MassIndexes;


public class BreitmanIndex implements INormalMass {
    @Override
    public IWeight getNormalMass(IWeight weight, IHeight height) {
        return new Kilogram(height.getHeight()*0.7-50);
    }
}
