package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Matakuliah: ");
        int jumlahData = sc.nextInt();
        sc.nextLine();

        Matakuliah10[] arrayOfMatakuliah10 = new Matakuliah10[jumlahData];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahData; i++) {
            arrayOfMatakuliah10[i] = new Matakuliah10();
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            jumlahJam = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------");

            arrayOfMatakuliah10[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah10[i].cetakInfo();
            System.out.println("--------------------------------");
        }
    }

}
