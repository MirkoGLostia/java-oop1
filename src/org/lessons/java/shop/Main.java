package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto product1 = new Prodotto("pasta", "delizzia di farina", 3.99, 10);
        Prodotto product2 = new Prodotto("macchina", "mezzo con motore", 167.99, 33);
        Prodotto product3 = new Prodotto("cuccia", "comodo lettino per cani di media taglia", 29.99, 22.5);

        System.out.println("Listino prodotti");

        System.out.println(product1.getNomeExtended() + " costa:" + product1.getPrezzoWithIvaForm());
        System.out.println(product2.getNomeExtended() + " costa:" + product2.getPrezzoWithIvaForm());
        System.out.println(product3.getNomeExtended() + " costa:" + product3.getPrezzoWithIvaForm());
    }
}
