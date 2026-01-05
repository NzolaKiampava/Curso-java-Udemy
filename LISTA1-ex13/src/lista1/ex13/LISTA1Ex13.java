/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1.ex13;

/**
 *
 * @author User02
 */
public class LISTA1Ex13
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Livro livrofavorito = new Livro();
        
        livrofavorito.setTitulo("Game of Thrones");
        livrofavorito.setQtdPaginas(500);
        livrofavorito.setPaginasLidas(50);
        System.out.println("O livro " + livrofavorito.getTitulo() + " possui " + livrofavorito.getQtdPaginas() + " paginas");
        livrofavorito.verificarProgresso();
    }
    
}
