package Tugas2;

public class Balok extends Persegi_Panjang implements Hitung_Ruang {
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang,lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (super.getPanjang()*super.getLebar() + super.getPanjang()*tinggi + super.getLebar()*tinggi);
    }

    @Override
    public double volume() {
        return super.getPanjang()*super.getLebar()*tinggi;
    }

    public void display(){
        System.out.println("\nLuas persegi panjang = " + luas());
        System.out.println("Keliling persegi panjang = " + keliling());
        System.out.println("Volume balok = " + volume());
        System.out.println("Luas permukaan balok = " + luasPermukaan());
    }
}