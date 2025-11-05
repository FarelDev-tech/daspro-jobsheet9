public class ArrayBilangan08 {
    public static void main(String[] args) {
        int bil[] = new int[4];

        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);

        // Modifikasi
        int bil2[] = {5, 13, -7, 17};

        System.out.println("Modifikasi Array");
        System.out.println(bil2[0]);
        System.out.println(bil2[1]);
        System.out.println(bil2[2]);
        System.out.println(bil2[3]);

        System.out.println("Modifikasi Array Looping");
        for(int i = 0; i < 4; i++) {
            System.out.println(bil2[i]);
        }
    }
}
