/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioheranca.entidades;

/**
 *
 * @author User02
 */
public class Mamifero
{
    private String nome;
    private int idade;
    private String cor_dos_olhos;

    public Mamifero(String nome, int idade, String cor_dos_olhos)
    {
        this.nome = nome;
        this.idade = idade;
        this.cor_dos_olhos = cor_dos_olhos;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public String getCor_dos_olhos()
    {
        return cor_dos_olhos;
    }

    public void Aleitar(){
        System.out.println("Mamifero aleitar");
    }
    
    public void Comunicar(){
        System.out.println("Mamifero comunicar");
    }

    @Override
    public String toString()
    {
        return "Mamifero{" + "nome=" + nome + ", idade=" + idade + ", cor_dos_olhos=" + cor_dos_olhos + '}';
    }
    
    
}
