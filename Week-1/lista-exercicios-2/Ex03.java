import java.util.Scanner;

/**
 *
 * @author Nzola Kiampava
 */
public class Ex03
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Integer x = sc.nextInt();
        Integer y = sc.nextInt();

        
        if ((x % y == 0) || (y % x == 0))
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
    
}
