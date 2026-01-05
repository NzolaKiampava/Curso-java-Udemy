/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author User02
 */
public class Carro extends Transporte
{
    private int km;

    public int getKm()
    {
        return km;
    }
    
    public Carro(){}

    public void setKm(int km)
    {
        if (km < 0 || km > 999999)
        {
            System.out.println("KM do carro <0 ou > 999999");
            return ;
        }
        this.km = km;
    }
    
    @Override
    public void setVelocidade(int velocidade)
    {
        if (velocidade < 0 || velocidade > 200)
        {
            System.out.println("Velccidade do carro negativa ou >200");
            return ;
        }
        this.velocidade = velocidade;
    }
    
    @Override
    public String toString()
    {
        return "Carro: \n" + "Velocidade= "+this.velocidade+"\n Ligado= "+this.isLigado()+"\n" +
            "KM= "+km;
    }
}
