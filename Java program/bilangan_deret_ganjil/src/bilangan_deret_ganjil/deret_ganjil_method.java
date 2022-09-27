
package bilangan_deret_ganjil;
import java.util.*;

public class deret_ganjil_method {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan deret ganjil ke-");
  int deret = input.nextInt();
  System.out.println("\n");
  
  deretGanjil(deret);
  }
  
  public static void deretGanjil(int deret){
    for(int i= 1; i<=deret; i++){
    if(i%2==1){
      System.out.print(i+" ");
    }
  }
}
}