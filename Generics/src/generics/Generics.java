/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generics;

/**
 *
 * @author User02
 */
public class Generics
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Printer<Integer> integerPrinter = new Printer<>(23);
        integerPrinter.print();
        
        Printer<Double> doublePrinter = new Printer<>(23.9);
        doublePrinter.print();
        
        Printer<String> stringPrinter = new Printer<>("KIAMPAVA");
        stringPrinter.print();
        
        
        //------------------------------------
        
        Double[] doubleVector = {1.0, 2.8, 4.8};
        System.out.println("Vetor de double: ");
        printVector(doubleVector);
        System.out.println();
        
        Integer[] intVector = {1,2, 3};
        System.out.println("Vetore de inteiros:");
        printVector(intVector);
        System.out.println();
        
        String[] stringVector = {"nzola", "kiampava"};
        System.out.println("Vector de strings:");
        printVector(stringVector);
        System.out.println();
        
        print("Nzola", 2023);
    }
    // metodo generico
    public static<T> void printVector(T v[])
    {
        for (T e : v)
        {
            System.out.print(e + " ");
        }
    }  
    
    public static<T, V> void print(T value, V otherValue)
    {
        System.out.println("Value: "+value+" - OtherValue: "+otherValue);
    }  
}
