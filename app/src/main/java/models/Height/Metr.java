package models.Height;

public class Metr implements IHeight {
    private final double height;

    public Metr(double height) {
        this.height = height;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
