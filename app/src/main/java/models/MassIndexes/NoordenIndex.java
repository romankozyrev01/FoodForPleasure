package models.MassIndexes;


public class NoordenIndex implements INormalMass{
    @Override
    public IWeight getNormalMass(IWeight weight, IHeight height) {
        return new Kilogram(height.getHeight() * 0.42);
    }
}
