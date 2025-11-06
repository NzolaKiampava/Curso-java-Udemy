import java.util.Scanner;

/**
 *
 * @author Nzola Kiampava
 */
public class Ex07
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Float x = sc.nextFloat();
        Float y = sc.nextFloat();
        
        if (x == 0 && y == 0) 
            System.out.println("Origem");
        if (x > 0 && y > 0)
            System.out.println("Q1");
        if (x < 0 && y > 0)
            System.out.println("Q2");
        if (x < 0 && y < 0)
            System.out.println("Q3");
        if (x > 0 && y < 0)
            System.out.println("Q4");
    }
    
}
