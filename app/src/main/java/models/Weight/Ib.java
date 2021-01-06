package models.Weight;

public class Ib implements IWeight {
    private final double weight;

    public Ib(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

}
