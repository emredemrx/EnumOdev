package org.example;

public enum Gezegenler {
    MERKUR(1,"57.9 milyon km", 2439.7 ,"58.6 Dünya günü"),
    VENUS(2,"108.2 milyon km",6051.8,"243 Dünya günü "),
    DUNYA(3,"149.6 milyon km",6371,"24 saat"),
    MARS(4,"227.9 milyon km",3389.5,"24.6 saat"),
    JUPITER(5,"778.3 milyon km",69911,"10.7 saat"),
    SATURN(6,"1.4 milyar km",58232,"10.7 saat"),
    URANUS(7,"2.9 milyar km",25362,"17.2 saat"),
    NEPTUN(8,"4.5 milyar km",24622,"16.1 saat");

    private final int sira;
    private final String uzaklik;
    private final double yaricap;
    private final String donmeSuresi;

    Gezegenler(int sira, String uzaklik, double yaricap, String donmeSuresi) {
        this.sira = sira;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSira() {
        return sira;
    }

    public String getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public String getDonmeSuresi() {
        return donmeSuresi;
    }
}


