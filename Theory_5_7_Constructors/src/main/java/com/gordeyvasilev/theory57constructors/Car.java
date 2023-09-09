package com.gordeyvasilev.theory57constructors;

public class Car {
    private String carModel2;
    private String carModel;
    private boolean flag;

    // Нулевой конструктор (конструктор поумолчанию)
    // для большинства типов данных значением по умолчанию является нулевая величина
    // boolean - false


    // Если при описании конструктора указать тип возвращаемого значения, то Java воспримет его как метод класса,
    // а не конструктор. Например, void Car(String carModel) { }
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