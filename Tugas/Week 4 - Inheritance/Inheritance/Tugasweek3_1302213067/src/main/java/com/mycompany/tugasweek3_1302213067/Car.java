/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasweek3_1302213067;

/**
 *
 * @author mzaky
 */
public class Car extends kendaraan {

    public Car(int xLoc, int yLoc, String plateNum, int Speed) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.Speed = Speed;
        this.plateNum = plateNum;
        System.out.println("kontstruktor child");
    }

    public void setPlateNum(String plateNum) {
        if (plateNum.length() == 8) {
            this.plateNum = plateNum;
        } else {
            System.out.println("PLat harus 8 digit!");
        }
    }
    
    @Override
    public String methodParent(){
        return "this method overridden by Child";
    }
    
    public String methodParent2(){
        return super.methodParent();
    }

    public String methodChild() {
        return "this is method child";
    }

    @Override
    public void move(int xLoc, int yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        System.out.println("Mobil berpindah " + xLoc + " " + yLoc);
    }

    @Override
    public void accelerat(int Speed) {
        if (Speed > this.Speed) {
            this.Speed = this.Speed + Speed;
            System.out.println("Mobil bertambah kecepatan sebanyak " + this.Speed);
        }
    }

}
