
package matriks;


public class Perkalian_Matriks_dengan_Inputan {
    public static void main(String[] args) {
        
int r1 = 2, c1 = 3;
int r2 = 3, c2 = 2;
int[][] matrik1 = { {3, -2, 5}, {3, 0, 4} };
int[][] matrik2 = { {2, 3}, {-9, 0}, {0, 4} };
// Perkalian Matriks
int[][] product = new int[r1][c2];
for(int i = 0; i < r1; i++) {
for (int j = 0; j < c2; j++) {
for (int k = 0; k < c1; k++) {
product[i][j] += matrik1[i][k] * matrik2[k][j];
}
}
// Menampilkan Hasil Perkalian Matriks
System.out.println("Hasil Perkalian Matriks: ");
for(int[] row : product) {
for (int column : row) {
System.out.print(column + " ");
}
System.out.println();
}
}
    }
}

    

