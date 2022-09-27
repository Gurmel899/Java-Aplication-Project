package Soal_no_1;

import java.util.Scanner;

public class class_uas_beraksi {

    public static void main(String[] args) {
        double ntgs, nuts, nuas;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Ntgs");
        ntgs = input.nextDouble();
        System.out.println("Masukan Nuts");
        nuts = input.nextDouble();
        System.out.println("Masukan Nuas");
        nuas = input.nextDouble();
        
        class_uas uas = new class_uas();
        uas.hitungNilaiAkhir(ntgs, nuts, nuas);
        uas.hitungNilaiHuruf();
        uas.cetakNilai();
    }

}
