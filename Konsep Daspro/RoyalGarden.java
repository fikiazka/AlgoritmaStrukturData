public class RoyalGarden {

    public static int hitungPendapatanCabang(int[] stok) {
        int[] harga = {75000, 50000, 60000, 10000};
        int total = 0;

        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    public static String cekStatusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    public static void main(String[] args) {

        int[][] stokBunga = {
                {10, 5, 15, 7},  
                {6, 11, 9, 12},  
                {2, 10, 10, 5},   
                {5, 7, 12, 9}     
        };
        
        System.out.println("Pendapatan RoyalGarden");
        System.out.println("==============================");

        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = hitungPendapatanCabang(stokBunga[i]);
            String status = cekStatusCabang(pendapatan);

            System.out.println("Royal Garden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("------------------------------");
        }
    }
}