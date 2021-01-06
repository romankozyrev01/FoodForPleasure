package models.Height;

public class Centimeter implements IHeight{
    private final double height;

    public Centimeter(double height) {
        this.height = height;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
