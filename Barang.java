// Kelas Barang: Base class untuk menyimpan informasi barang
public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public String tampilkanInfo() {
        return "Kode: " + kodeBarang + ", Nama: " + namaBarang + ", Harga: " + hargaBarang;
    }
}

