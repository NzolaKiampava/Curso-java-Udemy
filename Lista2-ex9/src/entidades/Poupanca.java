/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author User02
 */
public class Poupanca extends Conta
{
    private int diaRendimento;
    private int saldoP;

    public Poupanca(int diaRendimento, int saldoP, double saldo)
    {
        super(saldo);
        this.diaRendimento = diaRendimento;
        this.saldoP = saldoP;
    }

    public int getDiaRendimento()
    {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento)
    {
        this.diaRendimento = diaRendimento;
    }

    public int getSaldoP()
    {
        return saldoP;
    }

    public void setSaldoP(int saldoP)
    {
        this.saldoP = saldoP;
    }

    @Override
    public String toString()
    {
        return "Poupanca{" + "diaRendimento=" + diaRendimento + ", saldoP=" + saldoP + ", Saldo da conta= "+this.getSaldo()+'}';
    }
    
    
}
