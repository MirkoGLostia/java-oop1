package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // inizializziamo scanner
        Scanner userInput = new Scanner(System.in);

        // variabili varie ed eventuali
        boolean exitCode = false;

        // chiediamo il nome all'utente
        System.out.println("Crea un nuovo conto:");
        System.out.print("Nome: ");
        Conto contoUser = new Conto(userInput.nextLine());

        do {
            System.out.println("what do you wanna do?");
            System.out.println("Press 1 to add money to your account");
            System.out.println("Press 2 to subtract money from your account");
            System.out.println("Press 3 to exit");
            int userChoice = userInput.nextInt();

            if (userChoice == 1){
                System.out.println("How much do you want to add?");
                contoUser.addMoneyToSaldo(userInput.nextDouble());
            } else if (userChoice == 2) {
                System.out.println("How much do you want to subtract?");
                contoUser.removeMoneyFromSaldo(userInput.nextDouble());
            } else if (userChoice == 3) {
                exitCode = true;
            }else {
                System.out.println("invalid input");
            }

            System.out.println("Your credit: " + contoUser.getSaldoForm());
        }while (!exitCode);

        // debuger
        /*
        System.out.println(contoUser.getSaldoForm());
         */
        System.out.println(contoUser.getNumeroDiConto());
        System.out.println(contoUser.getNomeDelProprietario());


        // terminiamo scanner
        userInput.close();
    }
}
