/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author NzolaKiampava
 */
public class Printer<T>
{
    T valueToPrint;
    
    public Printer(T valueToPrint)
    {
        this.valueToPrint = valueToPrint;
    }

    public T getValueToPrint()
    {
        return valueToPrint;
    }

    public void setValueToPrint(T valueToPrint)
    {
        this.valueToPrint = valueToPrint;
    }
    
    public void print()
    {
        System.out.println("VALUE TO PRINT: "+valueToPrint);
    }
}
