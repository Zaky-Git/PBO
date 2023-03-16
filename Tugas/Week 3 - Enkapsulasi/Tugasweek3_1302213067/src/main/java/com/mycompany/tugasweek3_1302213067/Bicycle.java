/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasweek3_1302213067;

/**
 *
 * @author mzaky
 */
public class Bicycle {
     private int xLoc;
    private int yLoc;
    private int Speed;
    
    public Bicycle(int xLoc, int yLoc, int Speed){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.Speed = Speed;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public void setSpeed(int Speed) {
        if (Speed >= 0){
            this.Speed = Speed;    
        }
        else {
            System.out.println("Invalid Speed");
            
        }
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
        
    public void move(int xLoc, int yLoc){
       this.xLoc = xLoc;
       this.yLoc = yLoc;
       System.out.println("Sepeda berpindah " + xLoc + " " + yLoc);
       
    }
    
    public void accelerat(int Speed){
        if (Speed > this.Speed){
            this.Speed = this.Speed + Speed;
            System.out.println("Sepeda bertambah kecepatan sebanyak " + this.Speed);
        }
    }
    
    
    
}
