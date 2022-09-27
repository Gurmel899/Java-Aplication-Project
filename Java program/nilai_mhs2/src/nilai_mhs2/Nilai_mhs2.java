
package nilai_mhs2;

import java.util.Scanner;

public class Nilai_mhs2 {

    
    public static void main(String[] args) {
       String[]   listNpm = new String [1005];
       String[]   listNama = new String[1005];
       String[][] matkulMhs= new String [1005][15];
       int [][]   sksMhs= new int [1005][15];
       float[][]  nilaiMhs= new float[1005][15];
       float[]    ipMhs= new float[1005];
       
       int N = 0;
       Scanner scan = new Scanner(System.in);
       Scanner scan1 = new Scanner(System.in);
       Scanner scan2 = new Scanner(System.in);
       
        System.out.print("Masukan banyak mahasiswa: ");
        N= scan.nextInt();
        
        System.out.println("n\n");
        for (int i=0;i<N;i++){
            System.out.printf("Mahasiswa ke :%d\n--------\n",(i+1));
            System.out.println("Npm: ");
            listNpm[i]= scan1.nextLine();
            System.out.println("Nama: ");
            listNama[i]=scan1.nextLine();
            
            
            System.out.println("n\n");
            for (int mk=0; mk<9;i++){
                System.out.printf("Mata kuliah ke :%d\n--------\n",(mk+1));
                
                matkulMhs[i][mk]=scan2.nextLine();
                
                System.out.printf("SKS Mata Kuliah ke: %d\n--------------\n",(mk+1));
                
                String tempSks=scan.nextLine();
                sksMhs[i][mk]=Integer.valueOf(tempSks);
                
                 System.out.printf("Nilai Akhir Mata Kuliah: %d\n--------------\n",(mk+1));
                 
                 String tempNilaiAkhir=scan2.nextLine();
                 nilaiMhs[i][mk] = Float.valueOf(tempNilaiAkhir);
                
            }
            
    }
    }   
    
}
