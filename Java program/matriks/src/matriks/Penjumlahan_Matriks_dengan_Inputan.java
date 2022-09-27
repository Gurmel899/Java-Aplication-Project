
package matriks;


public class Penjumlahan_Matriks_dengan_Inputan {
    public static void main(String[] args) {
        
        int rows = 2, columns = 3;
int[][] matrik1 = { {2, 3, 4}, {5, 2, 3} };
int[][] matrik2 = { {-4, 5, 3}, {5, 6, 3} };
// Menjumlahkan Matriks
int[][] sum = new int[rows][columns];
for(int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
sum[i][j] = matrik1[i][j] + matrik2[i][j];
}
}
// Menampilkan Hasil Matriks
System.out.println("Penjumlahan Matriks Adalah: ");
for(int[] row : sum) {
for (int column : row) {
System.out.print(column + " ");
}
System.out.println();
}
}
    }

