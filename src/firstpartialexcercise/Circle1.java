/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexcercise;

/**
 *
 * @author esteb
 */
public class Circle1 {
    private double radius=1;
    private String color="red";
    
public Circle1(){
    radius=1.0;
    color="red";
}
public Circle1(double radius){
    this.radius=radius;
    this.color="red";
}
public Circle1 (String color){
    this.color=color;
    this.radius=1.0;
}
public Circle1(double radius, String color){
    this.radius=radius;
    this.color= color;
}
public double getradius(){
    return this.radius;
}
public String getcolor(){
    return this.color;
}
public void setradius(double radius){
    this.radius=radius;
}
public void setcolor(String color){
    this.color=color;
}
@Override
public String toString(){
    /*String temp;
    temp="Circle[radius" + this.radius + ",Color= " + this.color + "]";
    return temp;*/
    
    return "Circle[radius" + this.radius + ",Color= " + this.color + "]";
}
public double getArea(){
    return this.radius*this.radius*Math.PI;
}
}
