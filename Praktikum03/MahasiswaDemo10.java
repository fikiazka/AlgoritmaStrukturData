package Praktikum03;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Mahasiswa10[] arrayOfMahasiswa = new Mahasiswa10[3];
        arrayOfMahasiswa[0] = new Mahasiswa10();
        arrayOfMahasiswa[0].nim = "254107060159";
        arrayOfMahasiswa[0].nama = "FIKI AZKA";
        arrayOfMahasiswa[0].kelas = "SIB - 1C";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa10();
        arrayOfMahasiswa[1].nim = "254107060123";
        arrayOfMahasiswa[1].nama = "ACHMAD ARIVIO";
        arrayOfMahasiswa[1].kelas = "SIB - 1C";
        arrayOfMahasiswa[1].ipk = (float) 3.70;

        arrayOfMahasiswa[2] = new Mahasiswa10();
        arrayOfMahasiswa[2].nim = "254107060159";
        arrayOfMahasiswa[2].nama = "ARDIANSYAH";
        arrayOfMahasiswa[2].kelas = "SIB - 1B";
        arrayOfMahasiswa[2].ipk = (float) 3.50;

        System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[1].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM    : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[2].ipk);

    }
}
