package org.example;

public class TV {
    public int maxResolusi;
    public Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

    public int getResolution() {
        int res_480 = 480;
        int res_720 = 720;
        int res_1080 = 1080;

        if (colokan.getRealBandwith() >= 10 && colokan.getRealBandwith() < 35) {
            return Math.min(res_480, maxResolusi);
        } else if (colokan.getRealBandwith() >= 35 && colokan.getRealBandwith() <= 100) {
            return Math.min(res_720, maxResolusi);
        } else if (colokan.getRealBandwith() > 100) {
            return Math.min(res_1080, maxResolusi);
        } else {
            System.out.println("gak bisa nyala mas");
        }
        return 0;
    }
}
