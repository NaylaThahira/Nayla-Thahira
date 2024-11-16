// Kelas Transaksi: Subclass dari Barang, menangani transaksi pembelian
public class Transaksi extends Barang {
    private int jumlahBeli;
    private double total;

    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.jumlahBeli = jumlahBeli;
    }

    public void hitungTotal() {
        try {
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0.");
            }
            total = hargaBarang * jumlahBeli;
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
            total = 0;
        }
    }

    public String tampilkanTransaksi(String noFaktur) {
        return "No Faktur    : " + noFaktur + "\n" +
               "Kode Barang  : " + kodeBarang + "\n" +
               "Nama Barang  : " + namaBarang + "\n" +
               "Harga Barang : " + hargaBarang + "\n" +
               "Jumlah Beli  : " + jumlahBeli + "\n" +
               "Total        : " + total;
    }
}
