package models.MassIndexes;


public interface IMassIndex {
    IWeight getIndex(IWeight weight, IHeight height);
}
