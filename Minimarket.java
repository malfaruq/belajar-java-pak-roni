import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minimarket {
    static class Produk {
        String nama;
        double harga;

        Produk(String nama, double harga) {
            this.nama = nama;
            this.harga = harga;
        }

        @Override
        public String toString() {
            return nama + " - Rp " + harga;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produk> produkList = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\nMenu Minimarket:");
            System.out.println("1. Tampilkan Produk dan Harga");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Pembayaran");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Produk:");
                    if (produkList.isEmpty()) {
                        System.out.println("Tidak ada produk.");
                    } else {
                        for (int i = 0; i < produkList.size(); i++) {
                            System.out.println((i + 1) + ". " + produkList.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nama produk: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga produk: ");
                    double harga = scanner.nextDouble();
                    produkList.add(new Produk(nama, harga));
                    System.out.println("Produk " + nama + " berhasil ditambahkan.");
                    break;

                case 3:
                    System.out.print("Masukkan nomor produk yang ingin dihapus: ");
                    int nomorHapus = scanner.nextInt() - 1; // mengubah ke indeks
                    if (nomorHapus >= 0 && nomorHapus < produkList.size()) {
                        String namaHapus = produkList.get(nomorHapus).nama;
                        produkList.remove(nomorHapus);
                        System.out.println("Produk " + namaHapus + " berhasil dihapus.");
                    } else {
                        System.out.println("Nomor produk tidak valid.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nomor produk yang ingin dibeli: ");
                    int nomorBeli = scanner.nextInt() - 1; // mengubah ke indeks
                    if (nomorBeli >= 0 && nomorBeli < produkList.size()) {
                        System.out.print("Masukkan jumlah: ");
                        int jumlah = scanner.nextInt();
                        double total = produkList.get(nomorBeli).harga * jumlah;
                        System.out.println("Total pembayaran untuk " + jumlah + " " + produkList.get(nomorBeli).nama + " adalah Rp " + total);
                    } else {
                        System.out.println("Nomor produk tidak valid.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan minimarket!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);

        scanner.close();
    }
}