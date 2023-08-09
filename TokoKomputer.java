import java.util.Scanner;

public class TokoKomputer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama Barang: ");
        String namaBarang = input.nextLine();
        System.out.println("Harga Barang: ");
        double HargaBarang = input.nextDouble();
        System.out.println("Jumlah Beli: ");
        double jumlahBeli = input.nextDouble();
        double total = HargaBarang*jumlahBeli;
        double diskon = 0.1*total;
        System.out.println("Masukkan Pembayaran: ");
        double bayar=input.nextDouble(); 
        double kembalian =  bayar-(total-diskon);
        System.out.println("Total: "+total);
        System.out.println("Diskon: "+diskon);
        System.out.println("Bayar: "+bayar);
        System.out.println("Kembalian: "+kembalian);
    }
}
