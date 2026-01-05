/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioheranca.entidades;

/**
 *
 * @author User02
 */
public class Cao extends Mamifero
{
    private boolean cauda;

    public Cao(String nome, int idade, String cor_dos_olhos)
    {
        super(nome, idade, cor_dos_olhos);
    }

    public void setCauda(boolean cauda)
    {
        this.cauda = cauda;
    }

    public boolean isCauda()
    {
        return cauda;
    }
    
    public void Morder(){
        System.out.println("Morde!");
    }
    public void Latir(){
        System.out.println("Late!");
    }
    
    @Override
    public void Aleitar()
    {
        System.out.println("Cao tomando leite!");
    }
    
    @Override
    public void Comunicar() {
        System.out.println("Cao comunicando!");
    }
    @Override
    public String toString()
    {
        return "Cao{" + "cauda=" + cauda + "\nnome" + this.getNome() + '}';
    }
    
}
