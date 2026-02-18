import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf, status;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextDouble();

        if (tugas < 0 || tugas > 100 ||
                kuis < 0 || kuis > 100 ||
                uts < 0 || uts > 100 ||
                uas < 0 || uas > 100) {
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("nilai tidak valid");
            System.out.println("===============================");
            System.out.println("===============================");
        }

        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            status = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            status = "ANDA TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            status = "ANDA TIDAK LULUS";
        }

        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(status);

        sc.close();
    }
}