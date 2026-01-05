/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escreverficheiro;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User02
 */
public class EscreverFicheiro
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try 
        {
            FileWriter escreverFicheiro = new FileWriter("novo.txt", true);
            escreverFicheiro.write("Ola mundo");
            escreverFicheiro.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever ficheiro: " + e.getMessage());
        }
    }
    
}
