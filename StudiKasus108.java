import java.util.Scanner;

public class StudiKasus108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiMhs[], nilaiTertinggi, nilaiTerendah, totalNilai = 0;
        double rataNilai = 0;

        // Memasukkan banyaknya nilai mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        nilaiMhs = new int[sc.nextInt()];

        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        nilaiTertinggi = nilaiMhs[0];
        nilaiTerendah = nilaiMhs[0];
        // menampilkan nilai tertinggi
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            } else if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        // menghitung rata-rata
        for (int i = 0; i < nilaiMhs.length; i++) {
            totalNilai += nilaiMhs[i];
        }

        rataNilai = (double) totalNilai / nilaiMhs.length;

        System.out.println();

        // menampilkan semua nilai yang telah dimasukkan
        System.out.println("Semua Nilai Mahasiswa: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
        System.out.println();
        // menampilkan nilai tertinggi dan terendah
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println();
        // menampilkan rata-rata
        System.out.println("Rata-rata: " + rataNilai);
        System.out.println();
    }
}
