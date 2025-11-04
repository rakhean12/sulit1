import java.util.Scanner;

public class PengirimanSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Panjang (cm): ");
        double p = input.nextDouble();

        System.out.print("Lebar (cm): ");
        double l = input.nextDouble();

        System.out.print("Tinggi (cm): ");
        double t = input.nextDouble();

        double volume = p * l * t;

        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;
        double total = berat * biayaPerKg;

        if (volume > 100) {
            total += 50000;
        }

        System.out.println("\nTotal biaya pengiriman: Rp " + total);
    }
}
