package models.Weight;

public class Kilogram implements IWeight {
    private final double weight;

    public Kilogram(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

}
