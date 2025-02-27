package org.example;

public abstract class Colokan {
    private String merk;
    private double promisedBandwith;
    private int harga;

    public Colokan(int harga, double promisedBandwith, String merk) {
        try {
            if (harga < 0) {
                throw new IllegalArgumentException("Harga tidak boleh negatif");
            }
            if (promisedBandwith <= 0) {
                throw new IllegalArgumentException("Promised bandwidth harus lebih besar dari nol");
            }
            this.merk = merk;
            this.promisedBandwith = promisedBandwith;
            this.harga = harga;
        } catch (IllegalArgumentException e) {
            System.err.println("Error" + e.getMessage());
        }
    }

    public abstract double getRealBandwith();

    public String getMerk() {
        return merk;
    }

    public double getPromisedBandwith() {
        return promisedBandwith;
    }

    public int getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPromisedBandwith(double promisedBandwith) {
        this.promisedBandwith = promisedBandwith;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}