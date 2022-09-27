
package larik1_dimensi;

public class Larik1_dimensi {

   
    public static void main(String[] args) {
        
        int[] data; 
    
// Memesan/Alokasi 5 Variabel Integer     
        data = new int[5]; 
        
// Inisialisasi Larik
        data[0] = 10; 
        data[1] = 20; 
        data[2] = 30; 
        data[3] = 40; 
        data[4] = 50; 
        System.out.println("Isi Larik Pertama " + data[0]);
        System.out.println("Isi Larik Kedua " + data[1]);
        System.out.println("Isi Larik Ketiga " + data[2]);
        System.out.println("Isi Larik Keempat " + data[3]);
        System.out.println("Isi Larik Kelima " + data[4]);
    }
    
}
