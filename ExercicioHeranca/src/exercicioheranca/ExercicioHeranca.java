/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioheranca;

import exercicioheranca.entidades.Cao;
import exercicioheranca.entidades.Gato;
import exercicioheranca.entidades.Homem;

/**
 *
 * @author User02
 */
public class ExercicioHeranca
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Homem h = new Homem(true, "Daniel", 12, "azul");
        
        System.out.println(h);
        h.Comunicar();
        System.out.println("\n");
        
        Gato g = new Gato("Garfield", 5, "verde");
        g.setCauda(true);
        System.out.println(g);
        g.Aleitar();
        
        System.out.println("");
        
        Cao c = new Cao("Pitboo", 2, "preto");
        c.setCauda(false);
        System.out.println(c);
        c.Aleitar();
    }
    
}
