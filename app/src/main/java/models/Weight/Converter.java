package models.Weight;

public class Converter {
    private final IWeight weight;

    public Converter(IWeight weight){
        this.weight = weight;
    }

    public Kilogram convertToKilogram(){
        return new Kilogram(weight.getWeight()*2.205);
    }

    public Ib convert(){
        return new Ib(weight.getWeight()/2.205);
    }
}
