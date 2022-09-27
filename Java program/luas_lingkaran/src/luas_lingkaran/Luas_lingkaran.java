
package luas_lingkaran;
import java.util.Scanner;

public class Luas_lingkaran {

    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        double luas,phi=3.14;
        int r;
        
        System.out.println("Masukan jari jari =");
        r=scan.nextInt();
        
        //menghitung luas jari jari
        
        luas=phi*r*r;
        
        //menampilkan hasil luas lingkaran
        System.out.println("luas lingkaran =" +luas);
        
        
    }
    
}
