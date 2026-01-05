/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacepolimorfismo;

/**
 *
 * @author User02
 */
public class InterfacePolimorfismo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        IAssociadoISPTEC [] associado = new IAssociadoISPTEC[2];
        
        associado[0] = new Aluno();
        associado[1] = new Professor();
        
        for (IAssociadoISPTEC a : associado)
        {
            System.out.println(a.getIdentificador());
        }
    }
    
}
