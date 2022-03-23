/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Balok extends PersegiPanjang implements HitungRuang {
    private double t;

    public Balok(double p, double l, double t) {
        super(p,l);
        this.t = t;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double volume() {
        return super.getP()*super.getL()*t;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (super.getP()*super.getL() + super.getP()*t + super.getL()*t);
    }
    
    public double getLuasBidang(){
        return luasBidang();
    }
    public double getKelilingBidang(){
        return kelilingBidang();
    }

    public void display(){
        System.out.println("\nLuas persegi panjang = " + luasBidang());
        System.out.println("Keliling persegi panjang = " + kelilingBidang());
        System.out.println("Volume balok = " + volume());
        System.out.println("Luas permukaan balok = " + luasPermukaan());
    }
}
