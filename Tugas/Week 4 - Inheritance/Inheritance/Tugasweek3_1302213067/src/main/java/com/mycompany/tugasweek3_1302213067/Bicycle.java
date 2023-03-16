/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasweek3_1302213067;

/**
 *
 * @author mzaky
 */
public class Bicycle extends kendaraan {

    public Bicycle(int xLoc, int yLoc, int Speed) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.Speed = Speed;
        System.out.println("kontstruktor child");
    }

    public String methodChild() {
        return "this is method child";
    }

    @Override
    public void move(int xLoc, int yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        System.out.println("Sepeda berpindah " + xLoc + " " + yLoc);

    }

    @Override
    public void accelerat(int Speed) {
        if (Speed > this.Speed) {
            this.Speed = this.Speed + Speed;
            System.out.println("Sepeda bertambah kecepatan sebanyak " + this.Speed);
        }
    }

}
