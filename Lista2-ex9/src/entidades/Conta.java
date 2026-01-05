/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author User02
 */
public class Conta
{
    private double saldo;

    public Conta(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void levantar(double valor){
        this.saldo -= valor;
    }

    @Override
    public String toString()
    {
        return "Conta{" + "saldo=" + saldo + '}';
    }
}
