package models.MassIndexes;



public class BrokeIndex implements INormalMass {
    @Override
    public IWeight getNormalMass(IWeight weight, IHeight height) {
        return new Kilogram(height.getHeight()-100);
    }
}
