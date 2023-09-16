package com.gordeyvasilev.theory57constructors;

public class Car {
    private String carModel2;
    private String carModel;
    private boolean flag;

    // Null constructor (default constructor) For most data types, the default value is null.
    // boolean - false


    // If you specify a return type when declaring a constructor, Java will treat it as a class method rather
    // than a constructor. For example, void Car(String carModel) { }.
    public void Car(String carModel) {
        this.carModel = carModel;
    }

//    public Car(String carModel) {
//        this.carModel = carModel;
//    }


    public String getModelCar() {
        return carModel;
    }

    public String getModelCar2() {
        return carModel;
    }


    public boolean getFlag() {
        return flag;
    }
}