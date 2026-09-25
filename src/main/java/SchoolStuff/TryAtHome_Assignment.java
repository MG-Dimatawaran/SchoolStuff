/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SchoolStuff;

public class TryAtHome_Assignment {

    public static void main(String[] args) {

        String order1 = "Apple";
        String order2 = "Orange";

        int qty1 = 3;
        int qty2 = 2;

        double price1 = 10;
        double price2 = 20;

        double total1 = (qty1 * price1);
        double total2 = (qty2 * price2);

        double grandTotal = (total1 + total2);
        double cash = 100;
        double change = (cash - grandTotal);

        //First Order
        System.out.printf("Output:\n\n"
                + "Order: " + order1 + "\n"
                + "Qty: " + qty1 + "\n");
        
       System.out.printf("Price: %.2f\n",  price1);
       System.out.printf("Total: %.2f\n\n", total1);
       
       
       //Second Order with totals
       System.out.printf("Order: " + order2 + "\n"
                + "Qty: " + qty2 + "\n");
        
       System.out.printf("Price: %.2f\n", price2);
       System.out.printf("Total: %.2f\n\n", total2);
       
       System.out.printf("GrandTotal: %.2f\n", grandTotal);
       System.out.printf("Cash: %.2f\n", cash);
       System.out.printf("Change: %.2f\n", change);
       
       
       

//        System.out.printf("Output:\n\n"+
//                
//                "Order: " + order1 + "\n"
//                 + "Qty: " + qty1 + "\n"
//                 + "Price: " + price1 + "\n"
//                 +  "Total: " + "%.2f\n", (double) total1);
//        
//          System.out.printf(
//                "\n\nOrder: " + order2 + "\n"
//                 + "Qty: " + qty2 + "\n"
//                 + "Price: " + price2 + "\n"
//                 +  "Total: " + "%.2f", (double) total2 + "\n"
//                 + "GrandTotal: " +  grandTotal + "\n"
//                 + "Cash: " + cash
//          );
//        System.out.printf("%.2f", (double) total1);
    }
}
