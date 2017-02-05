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
public class Rectangle {
    private float lenght=1.0f;
    private float width=1.0f;
    
    public Rectangle(){
        lenght=1.0f;
        width=1.0f;
    }
    public Rectangle(float lenght, float widht){
        this.lenght=lenght;
        this.width=widht;        
                
    }
    public float getlength(){
        return this.lenght;
    }
    public void setlenght(float lenght){
        this.lenght=lenght;
    }
    public float getwidth(){
        return this.width;
    }
    public void setwidth(float width){
        this.width=width;
    }
    public double getArea(){
        return this.lenght*this.width;
    }
    public double getPerimeter(){
        return this.lenght+this.width;
    }
    @Override
    public String toString(){
        return "Rectangle[" + this.lenght + this.width + "]";
    }
}
