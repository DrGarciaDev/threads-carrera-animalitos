/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class Principal {
    public static void main(String[] args){
        Liebre HiloLiebre = new Liebre();
        Tortuga HiloTortuga = new Tortuga();
        
        Thread HT = new Thread(HiloTortuga);
        Guepardo HiloGuepardo = new Guepardo();
        
        System.out.println("COMIENZA LA CARRERA");
        
        HiloLiebre.start();
        HT.start();
        HiloGuepardo.start();
    }
}
