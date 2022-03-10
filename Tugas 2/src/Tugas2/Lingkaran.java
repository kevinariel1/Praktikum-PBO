package Tugas2;

public class Lingkaran implements Hitung_Bidang{
    private double jari2;

    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jari2;
    }

    @Override
    public double luas() {
        return Math.PI * jari2 * jari2;
    }
}