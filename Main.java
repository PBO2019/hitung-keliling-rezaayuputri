package com.company;

public class Main {

    public static void main(String[] args) {
        Bujursangkar b = new Bujursangkar();
        Lingkaran ku = new Lingkaran();

        b.setsisi(7);
        b.keliling();
        System.out.println("keliling bujursangkar " + b.getkeliling () +  "cm");

        ku.setjari(7);
        ku.rumus();
        System.out.println("keliling lingkaran " + ku.getkeliling() + "cm");
    }
}
