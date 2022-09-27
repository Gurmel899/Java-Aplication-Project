
package bilangan_m;
import java.util.Scanner;

public class Bilangan_M {

    
    public static void main(String[] args) {
        
  int M, N = 0;
  
  Scanner scan1 = new Scanner(System.in);
  Scanner scan2 = new Scanner(System.in);
  
  System.out.print("Nilai M: ");
  M = scan1.nextInt();
  System.out.print("Nilai N: ");
  N = scan2.nextInt();
  
  System.out.print("-------------\n\n");
  int tempM = M;
  while (M > N) {
   int temp = M;
   M -= N;
   System.out.println(temp + " - " + N + " = " + M);
  }
  
  System.out.print("\n\nJadi " + tempM + " mod " + N + " = " + M);
  
  
  
  scan1.close();
  scan2.close();
 }
}
    
    

