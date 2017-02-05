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
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
  
public Employee(int id,String firstname,String lastname,int salary){
    this.id=id;
    this.firstname=firstname;
    this.lastname=lastname;
    this.salary=salary;
            
}
public int getid (){
    return this.id;
}
public String getfirstname(){
    return this.firstname;
}
public String getlastname(){
    return this.lastname;
}
public String getname(){
   return  this.firstname + " " + this.lastname;
    
}
public int getsalary(){
    return this.salary;
}
public void setsalary(int salary){
    this.salary=salary;
}
public int getAnnualsalary(){
    return this.salary*12;
}
public int raiseSalary(int percent){
    this.salary *= this.salary*percent/100;
    return this.salary;
}
@Override
public String toString(){
      return "Employee[ id " + this.id + ", name " + this.getname() + ", salary" + this.salary + "]";
      
}
}