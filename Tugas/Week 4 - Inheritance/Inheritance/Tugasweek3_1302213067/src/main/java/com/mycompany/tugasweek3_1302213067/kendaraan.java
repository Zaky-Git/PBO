/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasweek3_1302213067;

/**
 *
 * @author mzaky
 */
public class kendaraan {

    protected int xLoc;
    protected int yLoc;
    protected String plateNum;
    protected int Speed;

    public kendaraan() {
        System.out.println("konstruktor parent");
    }

    public String methodParent() {
        return "this is method parent";
    }
    
    

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public void setSpeed(int Speed) {
        if (Speed >= 0) {
            this.Speed = Speed;
        } else {
            System.out.println("Invalid Speed");

        }
    }

    public String getPlateNum() {
        return plateNum;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getxLoc() {
        return xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void move(int xLoc, int yLoc) {
    }

    public void accelerat(int Speed) {
    }

}
