/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class PersegiPanjang implements HitungBidang {
    private double p,l;

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double luasBidang() {
        return p * l;
    }

    @Override
    public double kelilingBidang() {
        return 2 * (p + l);
    }
}