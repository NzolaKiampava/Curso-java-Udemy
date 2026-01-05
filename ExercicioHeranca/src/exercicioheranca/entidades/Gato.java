/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioheranca.entidades;

/**
 *
 * @author User02
 */
public class Gato extends Mamifero
{
   private boolean cauda;
   
    public Gato(String nome, int idade, String cor_dos_olhos)
    {
        super(nome, idade, cor_dos_olhos);
    }

    public boolean isCauda()
    {
        return cauda;
    }

    public void setCauda(boolean cauda)
    {
        this.cauda = cauda;
    }
    
    public void Arranhar(){
        System.out.println("Gato arranhando!");
    }
    public void Miar(){
        System.out.println("Gato miando!");
    }
    
   @Override
    public void Aleitar()
    {
        System.out.println("Gato tomando leite!");
    }
    
   @Override
    public void Comunicar()
    {
        System.out.println("Gato comunicando!");
    }

    @Override
    public String toString()
    {
        return "Gato{" + "cauda=" + cauda + '}';
    }
    
    
}
