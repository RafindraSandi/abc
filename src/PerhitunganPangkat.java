import java.util.Scanner;

public class PerhitunganPangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();

        double hasil = hitungPangkat(angka, pangkat);

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);

        scanner.close();
    }

     static double hitungPangkat(double angka, int pangkat) {
             double hasil = 1;

             for (int i = 0; i < pangkat; i++) {
                 hasil *= angka;
        }

        return hasil;
    }
}
