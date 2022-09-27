package Soal_no_1;

public class class_uas {

    private double ntgs, nuts, nuas;

    public double nakhir;
    private String grade;

    public class_uas() {

    }

    public double getntgs() {
        return ntgs;
    }

    public void setntgs(double ntgs) {
        this.ntgs = ntgs;
    }

    public double getnuts() {
        return nuts;
    }

    public void setnuts(double nuts) {
        this.nuts = nuts;
    }

    public double getnuas() {
        return nuas;
    }

    public void setnuas(double nuas) {
        this.nuas = nuas;
    }

    public void hitungNilaiAkhir(double ntgs, double nuts, double nuas) {
        this.ntgs = ntgs;
        this.nuts = nuts;
        this.nuas = nuas;
        this.nakhir = (ntgs * 0.3) + (nuts * 0.3) + (nuas * 0.4);
    }

    public void hitungNilaiHuruf() {
        if (nakhir >= 80 && nakhir <= 100) {
            this.grade = "A";
        } else if (nakhir >= 75 && nakhir <= 79.99) {
            this.grade = "B+";
        } else if (nakhir >= 70 && nakhir <= 74.99) {
            this.grade = "B";
        } else if (nakhir >= 65 && nakhir <= 69.99) {
            this.grade = "C+";
        } else if (nakhir >= 60 && nakhir <= 64.99) {
            this.grade = "C";
        } else if (nakhir >= 45 && nakhir <= 59.99) {
            this.grade = "D";
        } else {
            this.grade = "E";
        }
    }

    public void cetakNilai() {
        System.out.println("\nHASIL:");
        System.out.print("Nilai Tugas: " + ntgs);
        System.out.print("\nNilai UTS: " + nuts);
        System.out.print("\nNilai UAS: " + nuas);
        System.out.print("\nNilai Akhir: " + nakhir);
        System.out.print("\nNilai Huruf: " + grade + "\n");
    }
}
