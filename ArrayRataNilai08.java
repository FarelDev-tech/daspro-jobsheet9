import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiMhs[];
        int lulus = 0;
        int totalNilaiLulus = 0;
        int totalNilaiTidakLulus = 0;
        double rataLulus = 0;
        double rataTidakLulus = 0;

        // Modifikasi
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        nilaiMhs = new int[sc.nextInt()];

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Modifikasi Tambahan ajah
        for(int i = 0; i < nilaiMhs.length; i++) {
            if(nilaiMhs[i] > 70) {
                lulus++;
            } 
        }

        // Modifikasi
        for(int i = 0; i < nilaiMhs.length; i++) {
            if(nilaiMhs[i] > 70) {
                totalNilaiLulus += nilaiMhs[i];
            } else {
                totalNilaiTidakLulus += nilaiMhs[i];
            }
        }

        // Modifikasi
        rataLulus = totalNilaiLulus / lulus;
        rataTidakLulus = totalNilaiTidakLulus / (nilaiMhs.length - lulus);

        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Rata-rata Nilai Lulus: " + rataLulus);
        System.out.println("Rata-rata Nilai Tidak Lulus: " + rataTidakLulus);
    }
}
