package org.example;

public class Main {
    public static void main(String[] args) {
        for (Gezegenler gezegen : Gezegenler.values()){
            System.out.println("Gezegen adı : " + gezegen + "\nGezegenin sirasi : " + gezegen.getSira() + "\nGezegenini güneşe uzaklığı : " + gezegen.getUzaklik() + "\nGezegenin yarıçapı : " + gezegen.getYaricap() + "\nGezegenin dönüş süresi : " + gezegen.getDonmeSuresi());
            System.out.println("------------");
        }
    }
}