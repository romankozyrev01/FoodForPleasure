package models;


import models.Gender.IGender;
import models.Height.IHeight;
import models.Weight.IWeight;

import java.util.Date;

public class User {
    private String uniqueID;
    private String firsName;
    private String lastName;
    private IHeight height;    // needed to do it with interfaces
    private IWeight startWeight;
    private IWeight finalWeight;
    private Date birthday;
    private int stackID;
    private IWeight currentWeight;
    private IGender gender;


    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IHeight getHeight() {
        return height;
    }

    public void setHeight(IHeight height) {
        this.height = height;
    }

    public IWeight getStartWeight() {
        return startWeight;
    }

    public void setStartWeight(IWeight startWeight) {
        this.startWeight = startWeight;
    }

    public IWeight getFinalWeight() {
        return finalWeight;
    }

    public void setFinalWeight(IWeight finalWeight) {
        this.finalWeight = finalWeight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getStackID() {
        return stackID;
    }

    public void setStackID(int stackID) {
        this.stackID = stackID;
    }

    public IWeight getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(IWeight currentWeight) {
        this.currentWeight = currentWeight;
    }

    public IGender getGender() {
        return gender;
    }

    public void setGender(IGender gender) {
        this.gender = gender;
    }
}
