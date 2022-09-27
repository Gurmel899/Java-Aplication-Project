
package determinan;

import java.util.Scanner;
public class Determinan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a, b, c;
        double D, x1, x2;
       
        Scanner scanInput = new Scanner(System.in);
        System.out.println("PROGRAM PENCARIAN AKAR PERSAMAAN KUADRAT");
        System.out.print("Nilai a: ");
        a = scanInput.nextInt();
        System.out.print("Nilai b: ");
        b = scanInput.nextInt();
        System.out.print("Nilai c: ");
        c = scanInput.nextInt();
       
        System.out.println("Persamaan yang terbentuk:");
        System.out.print(a + "x^2 ");
        if(b < 0)
        {
            System.out.print("- " + (-b) + "x ");
        }else if(b > 0)
        {
            System.out.print("+ " + b + "x ");
        }
        if(c < 0)
        {
            System.out.println("- " + (-c) + " = 0");
        }else if(c > 0)
        {
            System.out.println("+ " + c + " = 0");
        }else
        {
            System.out.println(" = 0");
        }
       
        D = b * b - (4 * a * c);
        System.out.println("Determinan = " + D);
        if(D < 0)
        {
            System.out.println("Akar-akar persamaan adalah bilangan imajiner");
        }else if(D == 0)
        {
            x1 = -b /(2 * a);
            System.out.println("Memiliki akar persamaan x1 = x2 = " + x1);
        }else
        {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Memiliki akar persamaan x1 = " + x1 + " dan x2 = " + x2);
       
        
        }
    
    }
    
}
