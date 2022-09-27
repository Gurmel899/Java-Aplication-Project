
package larik_dengan_perulangan;


public class duplikasi_isi_larik {
 
    public static void main(String[] args) {
    
        int [] angka = {1, 2, 3, 4, 5, 6};
int [] angkapositif = angka; // duplikasi larik

System.out.println("Hasil Duplikasi Larik");
for (int angk: angkapositif) {
System.out.print(angk + ", ");
}
System.out.println();
System.out.println("Isi Larik Awal");
for (int angk: angka) {
System.out.print(angk + ", ");
}
    }
}
