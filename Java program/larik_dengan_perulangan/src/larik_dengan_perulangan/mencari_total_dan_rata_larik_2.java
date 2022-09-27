
package larik_dengan_perulangan;


public class mencari_total_dan_rata_larik_2 {

    public static void main(String[] args) {
        
        double[] angka = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
double total = 0.0;
for (double num: angka) {
total += num;
}
double rata = total / angka.length;
System.out.format("The average is: %.2f", rata);
    }
}
