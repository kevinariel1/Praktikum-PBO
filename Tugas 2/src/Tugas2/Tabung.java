package Tugas2;

public class Tabung extends Lingkaran implements Hitung_Ruang {
    private double tinggi;

    public Tabung(double jari2, double tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

    @Override
    public double keliling() {
        return super.keliling() * tinggi ;
    }

    @Override
    public double luas() {
        return super.luas() * 2;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        return luas() + keliling();
    }

    @Override
    public double volume() {
        return Math.PI * super.getJari2() * super.getJari2() * tinggi;
    }

    public void display(){
        System.out.println("\nLuas lingkaran = " + luas());
        System.out.println("Keliling lingkaran = " + keliling());
        System.out.println("Volume tabung = " + volume());
        System.out.println("Luas permukaan tabung = " + luasPermukaan());
    }
}