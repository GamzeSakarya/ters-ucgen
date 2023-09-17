import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = 1; i <= basamakSayisi; i++) {
            // Boşlukları yazdırma
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdırma
            for (int k = 1; k <= (basamakSayisi - i + 1) * 2 - 1; k++) {
                System.out.print("*");
            }

            // Bir sonraki satıra geç
            System.out.println();
        }

        scanner.close();
    }
}

