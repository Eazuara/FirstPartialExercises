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
public class Circle {   // clase donde delcaramos variables
    private double radius=1.0;
   
 public Circle(){
        this(1.0);
    }
    public Circle(double radius){ //metodo done incluiremos radio
        this.radius=radius;
    }
    public double getradius(){
        return this.radius=radius;
    }
 
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString(){
        return "Circle[radius="+this.radius+"]";
    }
}
