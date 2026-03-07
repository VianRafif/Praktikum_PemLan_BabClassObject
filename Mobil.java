public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double Waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public double rubahkecepatan(double i) {
        double kecepatan = (double) (i * 1000 / 3600);
        return kecepatan;
    }

    public void setKecepatan(double i) {

        kecepatan = rubahkecepatan((int) i);
    }

    public double rubahSekond(double i) {
        double detik = i * 3600;
        return detik;
    }

    public void setWaktu(double i) {
        Waktu = rubahSekond(i);
    }

    public int hitungJarak() {
        int jarak = (int) (kecepatan * Waktu);
        return jarak / 1000;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("dengan waktu tempuh " + Waktu + " detik");
        System.out.println("maka jarak yang dapat ditempuh mobil adalah " + hitungJarak() + " km");
    }
}
