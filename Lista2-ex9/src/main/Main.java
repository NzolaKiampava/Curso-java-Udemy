/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Conta;
import entidades.Poupanca;

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
        Conta p = new Poupanca(2, 10000, 2000);
        
        p.depositar(90);
        p.levantar(72);
        
        System.out.println(p);
    }
    
}
