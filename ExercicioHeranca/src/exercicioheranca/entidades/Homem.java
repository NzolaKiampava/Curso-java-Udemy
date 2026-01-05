/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioheranca.entidades;

/**
 *
 * @author User02
 */
public class Homem extends Mamifero
{
    private boolean casado;
    
    public Homem(boolean casado, String nome, int idade, String cor_dos_olhos)
    {
        super(nome, idade, cor_dos_olhos);
        this.casado = casado;
    }

    public void setCasado(boolean casado)
    {
        this.casado = casado;
    }
    
    public boolean isCasado()
    {
        return casado;
    }
    
    public void Rir(){
        System.out.println("Homem rindo!");
    }
    
    public void Falar(){
        System.out.println("Homem falando!");
    }
   
    @Override
    public void Aleitar(){
        System.out.println("Homem tomando leite!");
    }
    
    @Override
    public void Comunicar(){
        System.out.println("Homem comunicando!");
    }

    @Override
    public String toString()
    {
       return "Homem\nIdade: " + this.getIdade() + "\ncasado=" + casado;
    }
    
    
    
}
