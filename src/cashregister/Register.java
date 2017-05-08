/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

import java.util.Scanner;

public class Register {
    
    private final double tax = 0.07;
    public static double subtotal;
    private static double lastTrans;
    
    Scanner scan = new Scanner(System.in);
    
    public Register() {
        subtotal = 0;
        lastTrans = 0;
    }
    //1. scan in items
    //enter "/t" to proceed to total, "/v" to void last transaction
    public void scanItems() {
        System.out.println("Please type items to sell one line at a time.\n"
                + "\tTo sell multiples, add the qty to sell after the item.\n"
                + "\tEnter /v to void last transaction.\n"
                + "\tEnter /t to finish ringing items in.");
        while (true) {
            if (scan.hasNext("/v")) {
                voidLastTrans();
            } else if (scan.hasNext("/t")) {
                break;
            } else {
                CashRegister.list.add(scan.nextLine());
            }
        }
    }
    //add single item to list and add price to total
    public void sell(Item i) {
        subtotal += i.price;
    }
    //2. ring up all items
    public void checkout() {
        System.out.printf("\nSubtotal: $%02d\nTax: $%02d\nTotal: $%02d",
            subtotal, subtotal*tax, subtotal + subtotal*tax);
    }
    //void last transaction
    public void voidLastTrans() {
        CashRegister.list.remove(CashRegister.list.size());
        subtotal -= lastTrans;
        System.out.println("Previous transaction has been voided.");
    }
    //4. print receipt to screen
    public void printReceipt() {
        int i = 0;
        System.out.println("Printing receipt...");
        for (String s : CashRegister.list) {
            if (i % 4 == 0) {
                System.out.println();
            }
            System.out.printf("%d : %s\t", ++i, s);
        }
        System.out.printf("\nSubtotal: $%02d\nTax: $%02d\nTotal: $%02d",
            subtotal, subtotal*tax, subtotal + subtotal*tax);
    }
}
