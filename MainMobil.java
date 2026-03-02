import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {

        // Input
        Scanner input = new Scanner(System.in);
        // Object
        Mobil m1 = new Mobil();

        // Input data mobil
        System.out.println("Masukkan manufaktur mobil : ");
        m1.setManufaktur(input.nextLine());
        System.out.println("Masukkan nomor plat mobil : ");
        // String noPlat = input.nextLine();
        m1.setNoPlat(input.nextLine());
        System.out.println("Masukkan warna mobil : ");
        m1.setWarna(input.next());
        System.out.println("Masukkan kecepatan mobil (dalam km/jam): ");
        m1.setKecepatan(input.nextInt());
        input.nextLine();
        System.out.println("Masukkan waktu tempuh mobil (dalam jam): ");
        m1.setWaktu(input.nextDouble());
        System.out.println("================================");
        m1.displayMessage();
        System.out.println("================================");
        input.close();
    }
}