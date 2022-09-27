
package ip_mahasiswa;
import java.util.Scanner;

public class Ip_mahasiswa {

    
    public static void main(String[] args) {

   //  Buatlah program untuk membaca sederetan biodata mahasiswa kemudian menentukan
// mahasiswa dengan IP Tertinggi.
    
         String nama[] = new String[1005];
         String jurusan[] = new String[1005];
         float ip[] = new float[1005];
            
         
         int banyakMahasiswa = 0;
         Scanner scan1 = new Scanner(System.in);
         Scanner scan2 = new Scanner(System.in);
         Scanner scan3 = new Scanner(System.in);
         Scanner scan4 = new Scanner(System.in);
         System.out.print("Masukkan Banyak Mahasiswa: ");
         banyakMahasiswa = scan1.nextInt();
         
         System.out.print("\n\n");
         for (int i=0; i<banyakMahasiswa; i++) {
             System.out.println("Mahasiswa ke - " + (i+1));
             System.out.println("-------------------------");
             
             System.out.print("Nama: ");
             nama[i] = scan2.nextLine();
             System.out.println();
             
             System.out.print("Jurusan: ");
             jurusan[i] = scan3.nextLine();
             System.out.println();
             
             
             System.out.print("IP: ");
             String temp = scan4.nextLine();
             ip[i] = Float.valueOf(temp);
             System.out.println();
         }
         
         int index = -1;
         double tempIp = 0;
         for (int i=0; i<banyakMahasiswa; i++) {
          if (ip[i] > tempIp) {
          tempIp = ip[i]; 
          index = i;
          }
         }
         
         System.out.println("\n\n");
         System.out.println("Mahasiswa dengan IP tertinggi adalah " + nama[index] + " dari jurusan " + jurusan[index] + " dengan IP " + ip[index]);
         
         scan1.close();
         scan2.close();
         scan3.close();
         scan4.close();

     }
}
    
    

