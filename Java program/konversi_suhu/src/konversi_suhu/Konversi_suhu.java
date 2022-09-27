
package konversi_suhu;

import java.util.Scanner;

public class Konversi_suhu {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        double C,R,F,K;
        
         System.out.print("Masukan Bilangan = ");
          
         
         C = input.nextInt(); //input suhu Celcius
          R = C*4/5; // rumus reamur
          F = (C*9/5)+32; //rumus farenfait
          K = C+273.15; //rumus kelfin
        

        System.out.println(" ");
        System.out.println("Hasil Konversi C =" + C);
        System.out.println("Hasil Konversi R =" + R);
        System.out.println("Hasil Konversi F =" + F);
        System.out.println("Hasil Konversi K =" + K);
        
    }
    
}
