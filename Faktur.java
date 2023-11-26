public class Faktur {
    private String noFaktur;
    private String namaPelanggan;
    private BarangPembayaran barangPembayaran;

    public Faktur(String noFaktur, String namaPelanggan, BarangPembayaran barangPembayaran) {
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.barangPembayaran = barangPembayaran;
    }

    public void cetakFaktur() {
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nama Barang: " + barangPembayaran.getNamaBarang());
        System.out.println("Harga Barang: " + barangPembayaran.getHargaBarang());
        System.out.println("Jumlah Beli: " + barangPembayaran.getJumlahBeli());
        System.out.println("Total Bayar: " + barangPembayaran.hitungTotalBayar());
    }
}
