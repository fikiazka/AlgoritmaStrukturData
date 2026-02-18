public class MahasiswaMain10{
    public static void main(String[] args) {
        Mahasiswa10 mhs1 = new Mahasiswa10();
        mhs1.nama = "Fiki Azka";
        mhs1.nim = "254107060159";
        mhs1.kelas = "SIB 1";
        mhs1.ipk = 3.70;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB 1C");
        mhs1.updateIPK(3.75);
        mhs1.tampilkanInformasi();

        Mahasiswa10 mhs2 = new Mahasiswa10("Ahmad Arivio", "254107060155", 3.65, "SIB 2C");
        mhs2.updateIPK(3.69);
        mhs2.tampilkanInformasi();

        Mahasiswa10 mhs = new Mahasiswa10("Kiara Vanya", "254107060160", 3.50, "SIB 1C");
        mhs.tampilkanInformasi();
    }
}
