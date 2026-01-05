/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author User02
 */
public class Veiculo implements IComMotor
{

    @Override
    public String motor()
    {
        return "Motor";
    }

    @Override
    public void movimento(double x, double y)
    {
        System.out.println("Movimento");
    }
    
}
