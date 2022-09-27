
package matriks;


public class penjumlahan_matriks {
           
public static void main(String[] args) {
int i, j;
int hasil[][] = new int[2][2];
int [][]matriks1 = { {2, 3}, {4, 5} };
int [][]matriks2 = { {4, 3}, {2, 7} };
System.out.println("Menampilkan elemen matriks pertama: ");
for (i = 0; i < 2; i++) {
for (j = 0; j < 2; j++) {
System.out.println(matriks1[i][j]);


    }
}
System.out.println("Menampilkan elemen matriks kedua: ");
for (i = 0; i < 2; i++) {
for (j = 0; j < 2; j++) {
System.out.println(matriks2[i][j]);
}
}
System.out.println("Hasil penjumlahan matriks: ");
for (i = 0; i < 2; i++) {
for (j = 0; j < 2; j++) {
hasil[i][j] = matriks1[i][j] + matriks2[i][j];
System.out.println(hasil[i][j]);
//System.out.print(hasil[i][j] + "\t");
}
System.out.println();
}
}
}


