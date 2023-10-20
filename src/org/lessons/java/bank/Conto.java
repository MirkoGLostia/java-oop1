package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {

    // metodi uttili esterni
    private Random randomNumber = new Random();
    private DecimalFormat decForm = new DecimalFormat("0.00");

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

            public String getSaldoForm() {
                String saldo = decForm.format(this.saldo) + "€";
                return saldo;
            }

        // metodi generici
        public void addMoneyToSaldo(double arg) {
            this.saldo += arg;
        }

        public void removeMoneyFromSaldo(double arg) {
            if (arg < 0){
                arg = -1 * arg;
            }
            if (arg <= this.saldo){
                this.saldo -= arg;
            }else {
                System.out.println("you don't have enough money");
            }
        }
}
