public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
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

    public void setKecepatan(int i) {

        kecepatan = i;
    }

    public double rubahSekond(double i) {
        double detik = i * 3600;
        return detik;
    }

    public void setWaktu(double i) {
        Waktu = rubahSekond(i);
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/jam");
        System.out.println("dengan waktu tempuh " + Waktu + " detik");
    }
}
