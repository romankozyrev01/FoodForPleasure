package models.MassIndexes;


import models.Height.IHeight;
import models.Weight.IWeight;

public interface INormalMass {
    IWeight getNormalMass(IWeight weight, IHeight height);
}
