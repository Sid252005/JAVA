package com.app.fruits;

import java.util.Scanner;

public class Fruitbasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        sc.nextLine();

        Fruits[] basket = new Fruits[size];
        int counter = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details and taste of fresh fruits");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Display tastes of stale fruits");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    if (counter == size) {
                        System.out.println("Basket is full!");
                    } else {
                        System.out.print("Enter Mango name: ");
                        String nm = sc.nextLine();
                        System.out.print("Enter weight: ");
                        double w = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter color: ");
                        String clr = sc.nextLine();
                        basket[counter++] = new Mango(nm, w, clr);
                        System.out.println("Mango added.");
                    }
                    break;

                case 2:
                    if (counter == size) {
                        System.out.println("Basket is full!");
                    } else {
                        System.out.print("Enter Orange name: ");
                        String nm = sc.nextLine();
                        System.out.print("Enter weight: ");
                        double w = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter color: ");
                        String clr = sc.nextLine();
                        basket[counter++] = new Orange(nm, w, clr);
                        System.out.println("Orange added.");
                    }
                    break;

                case 3:
                    if (counter == size) {
                        System.out.println("Basket is full!");
                    } else {
                        System.out.print("Enter Apple name: ");
                        String nm = sc.nextLine();
                        System.out.print("Enter weight: ");
                        double w = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter color: ");
                        String clr = sc.nextLine();
                        basket[counter++] = new Apple(nm, w, clr);
                        System.out.println("Apple added.");
                    }
                    break;

                case 4:
                    System.out.println("Fruits in basket:");
                    for (Fruits f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Fresh fruits details:");
                    for (Fruits f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter index to mark stale (0 to " + (counter-1) + "): ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    if (idx < 0 || idx >= counter || basket[idx] == null) {
                        System.out.println("Invalid index!");
                    } else {
                        basket[idx].setFresh(false);
                        System.out.println("Fruit at index " + idx + " marked as stale.");
                    }      
                    break;
  
                case 7:
                    System.out.println("Tastes of stale fruits:");
                    for (Fruits f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + ": " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
