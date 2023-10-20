package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // inizializzo un randomizer
    private Random randomNumber = new Random();

    // attributi
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;


    // costruttori

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = randomNumber.nextInt(1, 99999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    // metodi


    public int getCodice() {
        return codice;
    }
}
