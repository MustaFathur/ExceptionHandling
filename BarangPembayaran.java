public class BarangPembayaran extends Barang implements Pembayaran {
    private int jumlahBeli;

    public BarangPembayaran(String namaBarang, double hargaBarang, int jumlahBeli) {
        super(namaBarang, hargaBarang);
        this.jumlahBeli = jumlahBeli;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }

}
