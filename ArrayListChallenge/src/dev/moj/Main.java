package dev.moj;

import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();
        while(true){
            printMenu();
            try {
            switch (Integer.parseInt(sc.nextLine())) {
                case (0) -> {
                    System.out.println("Good bye!!!");
                    return;
                }
                case (1) -> {
                    addItems(groceries);
                }
                case (2) -> {
                    removeItems(groceries);
                }
                default ->
                        System.out.println("Invalid input try again!!!");
            }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input try again!!!");
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    public static void printMenu() {

        String textBlock = """ 
                               Available actions:
                               0 - to shutdown
                               1 - to add item(s) to list (comma delimited list)
                               2 - to remove any items (comma delimited list)
                               Enter a number for which action you want to do:""";
        System.out.print(textBlock);

    }

    private static void addItems(ArrayList<String> groceries) {

        System.out.println("Add items(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");
        for (String el : items) {
            String trimmed = el.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {

        System.out.println("Remove items(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");
        for (String el : items) {
            String trimmed = el.trim();
            groceries.remove(trimmed);
        }
    }
}
