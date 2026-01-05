/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author User02
 */
public abstract class Transporte
{
    private boolean ligado;
    protected int velocidade;
    
    public Transporte(){
        
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public boolean isLigado()
    {
        return ligado;
    }

    public void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }
    
    

    public void setVelocidade(int velocidade)
    {
        if (velocidade < 0)
        {
            System.out.println("Velccidade negativa");
            return ;
        }
        this.velocidade = velocidade;
    }
    
    public void liga()
    {
        ligado = true;
    }
    
    public void desliga()
    {
        ligado = false;
        velocidade = 0;
    }
}
