import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.println("Input Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.println("Input Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.println("Input Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.println("Input Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Membuat Objek Barang Pembayaran

            BarangPembayaran barangPembayaran = new BarangPembayaran(namaBarang, jumlahBeli, jumlahBeli);

            // Membuat Objek Faktur

            Faktur faktur = new Faktur(noFaktur, namaPelanggan, barangPembayaran);

            // Menampilkan Faktur

            faktur.cetakFaktur();
        } catch (Exception e) {
            // Menangkap Exception yang terjadi Selama Penginputan

            System.out.println("Terjadi kesalahan saat memproses input: " + e.getMessage());
        }
    }
}