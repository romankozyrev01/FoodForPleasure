package models.MassIndexes;


public class TatonIndex implements INormalMass {
    @Override
    public IWeight getNormalMass(IWeight weight, IHeight height) {
        return new Kilogram(height.getHeight()-(100+(height.getHeight()-100)/20));
    }
}
