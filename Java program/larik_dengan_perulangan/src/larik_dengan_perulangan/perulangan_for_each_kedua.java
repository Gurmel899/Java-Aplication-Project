
package larik_dengan_perulangan;


public class perulangan_for_each_kedua {
    
    public static void main(String[] args) {
        
        // deklarasi dan insialisasi angka
        int[] angka = {3, 4, 5, -5, 0, 12};
        int total = 0;
       // perulangan each for
        for (int angk: angka) {
        total += angk;
}
        System.out.println("Sum = " + total);
    }
}
