
package luas_segitiga;
import java.util.Scanner;

public class Luas_Segitiga {

    
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       
       int a,t;
       double luas;
       
        System.out.println("Masukan alas");
        a=input.nextInt();
        
        System.out.println("Masukan tinggi");
        t=input.nextInt();
        
        luas= 0.5*a*t;
        
        System.out.println("Luas segitiga" + luas);
        
        
    }
    
}
