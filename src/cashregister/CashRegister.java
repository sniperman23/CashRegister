/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
    
    public static ArrayList<String> list = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Register register = new Register();
        
        //main menu
        while (true) {
            System.out.println("Welcome to the Main Menu");
            System.out.println("------------------------");
            System.out.println("\t1. Ring in Items");
            System.out.println("\t2. Checkout");
            System.out.println("\t3. Void Items");
            System.out.println("\t4. Print Receipt");
            System.out.println("\t5. ");
            System.out.println("\t6. Exit");
            //caught in loop
            if (scan.nextInt() == 1){
                register.scanItems();
            } else if (scan.nextInt() == 2) {
                register.checkout();
            } else if (scan.nextInt() == 3) {
                
            } else if (scan.nextInt() == 4) {
                register.printReceipt();
            } else if (scan.nextInt() == 5) {
                
            } else if (scan.nextInt() == 6) {
                break;
            } else {
                System.out.println("Invalid input, dipshit.");
            }
        }
        
        System.out.println(Register.subtotal);
    }
    
}
