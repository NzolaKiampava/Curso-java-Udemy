import java.util.Scanner;

/**
 *
 * @author Nzola Kiampava
 */
public class Ex01
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Integer x = sc.nextInt();
        
        if (x > 0)
            System.out.println("NAO NEGATIVO");
        else
            System.out.println("NEGATIVO");
    }
    
}
