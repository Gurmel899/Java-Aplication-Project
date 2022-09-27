
package fibonaci;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fibonaci {
   
    public static void fibonacci(int first, int second, int N) {
        int c = 0, i=2;
                System.out.println(first);
                System.out.println(second);
                do {
                        c = first + second;
                        System.out.println(c);
                        first = second;
                        second = c;
                        i++;
                } while (i < (N-1));
    }
        
    public static void main(String[] args) throws IOException {
          BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
          String jumlahfibo = null;
          System.out.print("Masukkan jumlah deret fibonaci : ");
          jumlahfibo = masuk.readLine();
          int jumlah = 0, first = 1, second = 1;
          jumlah = Integer.parseInt(jumlahfibo);
          
          fibonacci(first, second, jumlah);
    }
}
    

