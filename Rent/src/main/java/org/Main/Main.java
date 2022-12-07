package org.Main;
import entities.Rent;
import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];


        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean roomReserved = false;
            System.out.println();

            System.out.println("Rent #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();


            while (!roomReserved) {
                if (vect[roomNumber] != null) {
                    System.out.println("Busy Room! Choice another room!");
                    for (int v = 1; v < vect.length; v++) {
                        if (vect[v] == null) {
                            System.out.printf("Room %d available", v);
                            System.out.println();
                        }
                    }
                    System.out.print("Please, choice an option above: ");
                    roomNumber = sc.nextInt();
                    roomReserved = true;
                } else {
                    System.out.printf("Room available:  %d.", roomNumber);
                    System.out.println();
                    roomReserved = true;
                }
            }

            vect[roomNumber] = new Rent(name, email);

        }
        System.out.println();
        System.out.println("Busy Rooms: ");
        for (int i = 1; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }

        }

        sc.close();

    }
}