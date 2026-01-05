/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.ex13;

/**
 *
 * @author User02
 */
public class Livro
{
    private String titulo;
    private int qtdPaginas, paginasLidas;

    public Livro(){}

    public Livro(String titulo, int qtdPaginas, int paginasLidas)
    {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }
  

    public String getTitulo()
    {
        return titulo;
    }

    public int getQtdPaginas()
    {
        return qtdPaginas;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setQtdPaginas(int qtdPaginas)
    {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas()
    {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas)
    {
        this.paginasLidas = paginasLidas;
    }
    
    public void verificarProgresso(){
        double perc = ((this.getPaginasLidas()) * (100/this.getQtdPaginas()));
        System.out.println("Voce ja leu " + perc + "por cento do livro");
    }
}
