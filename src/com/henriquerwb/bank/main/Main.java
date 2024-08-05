package com.henriquerwb.bank.main;

import com.henriquerwb.bank.models.CreditCard;
import com.henriquerwb.bank.models.Purchase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o limite do cartão");
        double limitRead = sc1.nextDouble();
        sc1.nextLine();
        CreditCard card = new CreditCard(limitRead);

        int exit = 1;
        while(exit != 0) {
            System.out.println("Digite a descrição da compra");
            String description = sc1.nextLine();

            System.out.println("Digite o valor da compra");
            double value = sc1.nextDouble();
            sc1.nextLine();

            Purchase order = new Purchase(description, value);
            boolean purchaseMade = card.launchPurchase(order);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                exit = sc1.nextInt();
                sc1.nextLine();
            } else {
                System.out.println("Saldo insuficiente");
                exit = 0;
            }



        }

        sc1.close();
    }
}