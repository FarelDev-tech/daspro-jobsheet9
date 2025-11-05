import java.util.Scanner;

public class StudiKasus308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); // untuk membersihkan buffer agar pesanan bisa diinput dengan benar

        String pesanan[] = new String[jumlahPesanan];
        int harga[] = new int[jumlahPesanan];
        int totalBiaya = 0;
        boolean adaPesanan = false;

        // Memasukkan setiap pesanan
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan Nama Pesanan ke-" + (i + 1) + ": ");
            pesanan[i] = sc.nextLine().trim();
            
            System.out.print("Masukkan Harga Pesanan ke-" + (i + 1) + ": ");
            harga[i] = sc.nextInt();

            sc.nextLine(); // untuk membersihkan buffer
        }

        // Menghitung total biaya
        for (int i = 0; i < pesanan.length; i++) {
            totalBiaya += harga[i];
        }

        System.out.println();
        // Menampilkan daftar pesanan
        System.out.println("Daftar Pesanan: ");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println( (i + 1) + ". " + pesanan[i] + " Rp" + harga[i]);
        }

        // Masih menggunakan kasus pada pemesanan makanan di kafe, buatlah program yangmemungkinkan pengguna untuk memesan makanan dari menu yang tersedia di kafe.Program harus menyimpan daftar nama makanan dalam sebuah array dan memberikanopsi untuk mencari makanan yang diinginkan menggunakan metode linear search.
        // daftar menu makanan yang telah ditentukan sebelumnya dalam bentuk array.Nama-nama makanan telah di-inisialisasi saat deklarasi array.

        // Input nama makanan yang ingin dicari (input dari pengguna).
        System.out.print("Masukkan Nama Makanan yang ingin dicari: ");
        String namaMakanan = sc.nextLine().trim();
        
        // Proses program mencari nama makanan yang dimasukkan pengguna menggunakanalgoritma linear search.o jika makanan ditemukan, program akan menginformasikan pengguna bahwamakanan tersebut tersedia. Jika tidak ditemukan, program akan memberi tahupengguna bahwa makanan yang dicari tidak ada di menu.
        for (int i = 0; i < pesanan.length; i++) {
            if (pesanan[i].equalsIgnoreCase(namaMakanan)) {
                adaPesanan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian penggunanya
        if (adaPesanan) {
            System.out.println("Makanan atau Minuman " + namaMakanan + " tersedia di menu.");
        } else {
            System.out.println("Makanan atau Minuman " + namaMakanan + " tidak tersedia di menu.");
        }
    }
}
