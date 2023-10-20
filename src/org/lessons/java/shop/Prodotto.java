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
        this.codice = randomNumber.nextInt(1, 9999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    // metodi

    // getter e setter
        // codice
        public String getCodice() {
            String stringCode = String.format("%08d", this.codice);
            return stringCode;
        }
        // nome
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        // descrizione
        public String getDescrizione() {
            return descrizione;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }
        // prezzo
        public double getPrezzo() {
            return prezzo;
        }
        public double getPrezzoWithIva() {
            prezzo = this.prezzo + (this.prezzo * (this.iva / 100));
            return prezzo;
        }

        public void setPrezzo(double prezzo) {
            this.prezzo = prezzo;
        }
        // iva
        public double getIva() {
            return iva;
        }

        public void setIva(double iva) {
            this.iva = iva;
        }
}
