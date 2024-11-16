import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Transaksi Barang ===");
        System.out.print("Masukkan No Faktur: ");
        String noFaktur = scanner.nextLine();

        System.out.print("Masukkan Kode Barang: ");
        String kodeBarang = scanner.nextLine();

        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();

        double hargaBarang = 0;
        while (true) {
            try {
                System.out.print("Masukkan Harga Barang: ");
                hargaBarang = Double.parseDouble(scanner.nextLine());
                if (hargaBarang <= 0) {
                    throw new NumberFormatException("Harga harus lebih dari 0.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Kesalahan: " + e.getMessage());
            }
        }

        int jumlahBeli = 0;
        while (true) {
            try {
                System.out.print("Masukkan Jumlah Beli: ");
                jumlahBeli = Integer.parseInt(scanner.nextLine());
                if (jumlahBeli <= 0) {
                    throw new NumberFormatException("Jumlah beli harus lebih dari 0.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Kesalahan: " + e.getMessage());
            }
        }

        // Membuat objek transaksi
        Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, jumlahBeli);
        transaksi.hitungTotal();

        // Menampilkan hasil transaksi
        System.out.println("\n=== Detail Transaksi ===");
        System.out.println(transaksi.tampilkanTransaksi(noFaktur));

        scanner.close();
    }
}