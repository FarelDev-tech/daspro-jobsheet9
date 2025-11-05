import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiMhs[] = new int[10];
        double totalNilai = 0;
        double rata2;

        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        for(int i = 0; i < nilaiMhs.length; i++) {
            totalNilai += nilaiMhs[i];
        }

        rata2 = totalNilai / nilaiMhs.length;
        System.out.println("Rata-rata Nilai Mahasiswa: " + rata2);
    }
}
