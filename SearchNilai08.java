import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNilai[];
        int key = 0;
        int hasil = 0;

        // Masukkan banyaknya nilai arrNilai dari inputan user
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        arrNilai = new int[sc.nextInt()];

        for(int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan Nilai yang dicari: ");
        key = sc.nextInt();

        for(int i = 0; i < arrNilai.length; i++) {
            if(arrNilai[i] == key) {
                hasil = i + 1;
                break;
            }
        }

        // Modifikasi
        if(hasil != 0) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
