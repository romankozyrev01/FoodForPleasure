package models.MassIndexes;


public class MassIndex implements IMassIndex {
    @Override
    public IWeight getIndex(IWeight weight, IHeight height) {
        return new Kilogram(weight.getWeight()/Math.pow(height.getHeight(),2));
    }
}
