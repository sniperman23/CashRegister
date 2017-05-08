/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

public class Item {
    public double price;
    public int quant;
    public double sale;
    public String name;
    
    //constructor for only price given, not on sale
    public Item(String n, double p) {
        this.name = n;
        this.price = p;
    }
    //const. for price and sale percent given
    public Item(String n, double p, double s) {
        this.name = n;
        this.price = p;
        this.sale = s;
    }
    //produce
    static Item grapes = new Item("grapes", 2.40);
    //wheat, grain, starch
    static Item bread = new Item("bread", 1.65);
    static Item rice = new Item("rice", .89);
    //meat, fish, poultry
    static Item alaskan_cod = new Item("alaskan cod", 9.34, .2);
    static Item eggs = new Item("eggs", 4.33);
    static Item lunchmeat = new Item("lunch meat", 5.18);
    //dairy
    static Item milk = new Item("milk", 4.75, .2);
    static Item icecream = new Item("ice cream", 5.44, .15);
    static Item cheese = new Item("cheese", 2.80);
    //miscellaneous
    static Item peanutbutter = new Item("peanut butter", 3.25);
    static Item orangejuice = new Item("orange juice", 3.40, .09);
    static Item lotion = new Item("lotion", 2.89);
    static Item soup = new Item("soup", .79);
}
