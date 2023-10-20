package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    // inizializzo un randomizer
    private Random randomNumber = new Random();
    private DecimalFormat decform = new DecimalFormat("0.00");

    // attributi
    private String codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;


    // costruttori

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        int codiceNumber = randomNumber.nextInt(1, 9999999);
        this.codice = String.format("%08d", codiceNumber);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    // metodi

    // getter e setter

        // codice
        public String getCodice() {
            return this.codice;
        }


        // nome
        public String getNome() {
            return nome;
        }
        public String getNomeExtended() {
            nome = this.codice + "-" + this.nome;
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
        public String getPrezzoForm() {
            String prezzo = decform.format(this.prezzo);
            return prezzo;
        }
        public double getPrezzoWithIva() {
            prezzo = this.prezzo + (this.prezzo * (this.iva / 100));
            return prezzo;
        }
        public String getPrezzoWithIvaForm() {
            String prezzo = decform.format(this.prezzo + (this.prezzo * (this.iva / 100)));
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
