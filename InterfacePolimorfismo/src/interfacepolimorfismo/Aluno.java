/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacepolimorfismo;

/**
 *
 * @author User02
 */
public class Aluno implements IAssociadoISPTEC
{
    int numeroAluno = 2;
    
    @Override
    public int getIdentificador()
    {
        return this.numeroAluno;
    }
    
}
