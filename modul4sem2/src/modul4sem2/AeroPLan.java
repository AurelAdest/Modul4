/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4sem2;

/**
 *
 * @author aurel
 */
public class AeroPLan extends Vehicle {
    
    @Override
    public void walk(){
        System.out.println("Aroplan Flying");
    }
    public void fuel(){
        System.out.println("");
    }
    public static void main(String[] args){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
   }

