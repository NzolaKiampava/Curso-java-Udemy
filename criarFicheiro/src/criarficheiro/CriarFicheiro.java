/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package criarficheiro;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author User02
 */
public class CriarFicheiro
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            File novoFicheiro = new File("novo.txt");
            if (novoFicheiro.createNewFile())
                System.out.println("Ficheiro criado: "+novoFicheiro.getName());
            else
                System.out.println("Ficheiro já existe");
        } catch (IOException e)
        {
            System.out.println("Erro ao criar ficheiro: " + e.getMessage());
        }
    }
    
}
