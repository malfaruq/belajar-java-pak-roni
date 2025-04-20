import java.util.Scanner;

public class BangunDatar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan (1-3): ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                double luasPersegi = sisi * sisi;
                double kelilingPersegi = 4 * sisi;
                System.out.println("Luas Persegi: " + luasPersegi);
                System.out.println("Keliling Persegi: " + kelilingPersegi);
                break;

            case 2:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                double kelilingPersegiPanjang = 2 * (panjang + lebar);
                System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
                System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                double luasLingkaran = Math.PI * jariJari * jariJari;
                double kelilingLingkaran = 2 * Math.PI * jariJari;
                System.out.println("Luas Lingkaran: " + luasLingkaran);
                System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}