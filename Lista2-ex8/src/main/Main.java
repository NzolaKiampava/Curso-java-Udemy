/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Carro;

/**
 *
 * @author User02
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Carro carro = new Carro();
        
        carro.setVelocidade(-12);
        carro.setKm(9);
        carro.liga();
        System.out.println(carro);
        
    }
    
}
