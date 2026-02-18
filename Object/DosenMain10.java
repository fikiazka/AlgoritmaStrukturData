public class DosenMain10 {
    public static void main(String[] args) {

        Dosen10 dsn1 = new Dosen10();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Pemrograman";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Basis Data");
        dsn1.tampilInformasi();

        Dosen10 dsn2 = new Dosen10(
                "DSN002",
                "Siti Aisyah",
                true,
                2018,
                "Jaringan Komputer");

        dsn2.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.ubahKeahlian("Keamanan Jaringan");
        dsn2.setStatusAktif(true);
        dsn2.tampilInformasi();
    }
}
