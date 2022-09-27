
package larik_dengan_perulangan;


public class mencari_total_dan_rata_lariki {
    
    public static void main(String[] args) {
        
        int [] angka = { 10, 20, 30, 40, 50, 60 };
double total = 0;
for (double num: angka) {
total += num;
}
double rata = total / angka.length;
System.out.println("The average is: " + rata);
        
    }
}
