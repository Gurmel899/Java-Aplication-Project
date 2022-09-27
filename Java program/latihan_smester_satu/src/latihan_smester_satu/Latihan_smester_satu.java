
package latihan_smester_satu;
import java.util.*;

public class Latihan_smester_satu {

    
    public static void main(String[] args) {
           
            Scanner input = new Scanner(System.in);
             int harga,total;   
             String nbarang;
             System.out.println("masukan nama barang");
             nbarang=input.nextLine();
            System.out.println("masukan harga barang ");
            harga=input.nextInt();
          
            total = (harga * 10 /100);
           
            System.out.println("total keseluruhan adalah :  "  + total);
            
    }
    
}
