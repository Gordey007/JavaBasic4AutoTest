package com.gordeyvasilev.theory64subclassingcapabilities.override.transport.testtransport;

import com.gordeyvasilev.theory64subclassingcapabilities.override.transport.basictransport.Vehicle;
import com.gordeyvasilev.theory64subclassingcapabilities.override.transport.derivedtransport.Bicycle;

public class Demo1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Bicycle bicycle = new Bicycle();

        // System.out.println(vehicle.maxSpeed); // protected
        // System.out.println(bicycle.maxSpeed); // protected vehicle

        // vehicle.showSpeed(); // protected
        bicycle.showSpeed();
    }
}