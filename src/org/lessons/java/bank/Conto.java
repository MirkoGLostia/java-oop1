package org.lessons.java.bank;

import java.util.Random;

public class Conto {

    // randomizzer
    Random randomNumber = new Random();

    // attributi
    private int numeroDiConto;
    private String nomeDelProprietario;
    private double saldo;

    // costruttori

    public Conto(String nomeDelProprietario) {
        this.nomeDelProprietario = nomeDelProprietario;
        this.saldo = 0;
        this.numeroDiConto = randomNumber.nextInt(1, 1000);
    }


    // metodi

        // getter e setter
            // numero di conto

            public int getNumeroDiConto() {
                return numeroDiConto;
            }



            // nome proprietario

            public String getNomeDelProprietario() {
                return nomeDelProprietario;
            }

            public void setNomeDelProprietario(String nomeDelProprietario) {
                this.nomeDelProprietario = nomeDelProprietario;
            }


            // saldo

            public double getSaldo() {
                return saldo;
            }
}
