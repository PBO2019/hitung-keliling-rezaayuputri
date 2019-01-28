package com.company;

public class Lingkaran{
    private double phi=3.14;
    private double jari;
    private double keliling;

    public void rumus (){
        this.keliling = 2 * phi * jari;
    }

    public void setphi (double phi){
        this.phi = phi;
    }
    public void setjari (double jari){
        this.jari = jari;
    }
    public double getkeliling(){
        return keliling;
    }
}
