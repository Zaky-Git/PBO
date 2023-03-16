/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tugasweek3_1302213067;

import java.util.HashSet;

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

        System.out.println("\nsetelah di set baru\n");

        Avanza.setxLoc(30);
        Avanza.setyLoc(20);
        Avanza.setSpeed(70);
        Avanza.setPlateNum("BK2022ZM");

        Lion.setxLoc(10);
        Lion.setyLoc(40);
        Lion.setSpeed(200);

        Polygon.setxLoc(10);
        Polygon.setyLoc(30);
        Polygon.setSpeed(30);

        Vario.setxLoc(30);
        Vario.setyLoc(20);
        Vario.setSpeed(140);
        Vario.setPlateNum("BP3094LO");

        System.out.println("Mobil Avanza berposisi pada " + Avanza.getxLoc() + " "
                + Avanza.getyLoc() + " dan berplat " + Avanza.getPlateNum() + " berkecepatan " + Avanza.getSpeed() + "KM");

        System.out.println("Pesawat Lion berposisi pada " + Lion.getxLoc() + " "
                + Lion.getyLoc() + " berkecepatan " + Lion.getSpeed() + "KM");

        System.out.println("Sepeda Polygon berposisi pada " + Polygon.getxLoc() + " "
                + Polygon.getyLoc() + " berkecepatan " + Polygon.getSpeed() + "KM");

        System.out.println("Motor Vario berposisi pada " + Vario.getxLoc() + " "
                + Vario.getyLoc() + " dan berplat " + Vario.getPlateNum() + " berkecepatan " + Vario.getSpeed() + "KM");

        System.out.println("\nSetelah menggunakan move dan accelerat\n");

        Avanza.move(40, 40);
        Avanza.accelerat(20);

        Lion.move(20, 60);
        Lion.accelerat(30);

        Polygon.move(30, 40);
        Polygon.accelerat(20);

        Vario.move(20, 20);
        Vario.accelerat(30);

        System.out.println("");

        System.out.println("Mobil Avanza berposisi pada " + Avanza.getxLoc() + " "
                + Avanza.getyLoc() + " dan berplat " + Avanza.getPlateNum() + " berkecepatan " + Avanza.getSpeed() + "KM");

        System.out.println("Pesawat Lion berposisi pada " + Lion.getxLoc() + " "
                + Lion.getyLoc() + " berkecepatan " + Lion.getSpeed() + "KM");

        System.out.println("Sepeda Polygon berposisi pada " + Polygon.getxLoc() + " "
                + Polygon.getyLoc() + " berkecepatan " + Polygon.getSpeed() + "KM");

        System.out.println("Motor Vario berposisi pada " + Vario.getxLoc() + " "
                + Vario.getyLoc() + " dan berplat " + Vario.getPlateNum() + " berkecepatan " + Vario.getSpeed() + "KM");

        System.out.println("\nketika tidak sesuai kondisi\n");

        Avanza.setSpeed(-20);
        Avanza.setPlateNum("salah");

        System.out.println("");

        System.out.println("Mobil Avanza berposisi pada " + Avanza.getxLoc() + " "
                + Avanza.getyLoc() + " dan berplat " + Avanza.getPlateNum() + " berkecepatan " + Avanza.getSpeed() + "KM");

        System.out.println("Pesawat Lion berposisi pada " + Lion.getxLoc() + " "
                + Lion.getyLoc() + " berkecepatan " + Lion.getSpeed() + "KM");

        System.out.println("Sepeda Polygon berposisi pada " + Polygon.getxLoc() + " "
                + Polygon.getyLoc() + " berkecepatan " + Polygon.getSpeed() + "KM");

        System.out.println("Motor Vario berposisi pada " + Vario.getxLoc() + " "
                + Vario.getyLoc() + " dan berplat " + Vario.getPlateNum() + " berkecepatan " + Vario.getSpeed() + "KM");

    }
}
