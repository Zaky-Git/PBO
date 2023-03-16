/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tugasweek3_1302213067;

/**
 *
 * @author mzaky
 */
public class Tugasweek3_1302213067 {

    public static void main(String[] args) {
        Car Avanza = new Car(20, 10, "BD2012KP", 60);
        Plane Lion = new Plane(30, 21, 120);
        Bicycle Polygon = new Bicycle(42, 32, 20);
        motorCycle Vario = new motorCycle(12, 30, "DE2102PO", 70);

        System.out.println("Mobil Avanza berposisi pada " + Avanza.getxLoc() + " "
                + Avanza.getyLoc() + " dan berplat " + Avanza.getPlateNum() + " berkecepatan " + Avanza.getSpeed() + "KM");

        System.out.println("Pesawat Lion berposisi pada " + Lion.getxLoc() + " "
                + Lion.getyLoc() + " berkecepatan " + Lion.getSpeed() + "KM");

        System.out.println("Sepeda Polygon berposisi pada " + Polygon.getxLoc() + " "
                + Polygon.getyLoc() + " berkecepatan " + Polygon.getSpeed() + "KM");

        System.out.println("Motor Vario berposisi pada " + Vario.getxLoc() + " "
                + Vario.getyLoc() + " dan berplat " + Vario.getPlateNum() + " berkecepatan " + Vario.getSpeed() + "KM");

        kendaraan parent = new kendaraan();
         System.out.println(Avanza.methodParent());
         System.out.println(Avanza.methodParent2());
    }
}
