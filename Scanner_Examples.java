/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SchoolStuff;

/**
 *
 * @author maede
 */
import java.util.Scanner;

public class Scanner_Examples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//Simple Student Info w/ if else grading    
        System.out.print("Enter Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Age: ");
        int age = scan.nextInt();
        
        System.out.print("Enter Grade Scale(75-100): ");
        int gpa = scan.nextInt();
        
        System.out.println("\n\n\n======== STUDENT INFO ========");
        System.out.println("Name:" + name + "\n"
                + "Age: " + age);
        
        //Grade Condition
        if (gpa > 96){
            System.out.println("GPA: 4.0 (HIGH DISTINCTION)");
        }else if (gpa > 90){
            System.out.println("GPA: 3.5 (DISTINCTION)");
        }else if (gpa > 85){
            System.out.println("GPA: 3.0 (VERY GOOD)");
        }else if (gpa > 80){
            System.out.println("GPA: 2.5 (GOOD)");
        }else if (gpa > 75){
            System.out.println("GPA: 2.0 (AVERAGE)");
        }else if (gpa < 75){
            System.out.println("GPA: 1.0 (FAIL)");
        }

        System.out.println("==============================");
   

        
        
//=====================================================     
////Simple Order Scan        
//        System.out.print("Enter Order: ");
//        String ord = scan.nextLine();
//        
//        System.out.print("Enter Quantity: ");
//        int qty = scan.nextInt();
//        
//        System.out.print("Enter Price: ");
//        double prc = scan.nextDouble();        
//        
//        //Computing the total 
//        double total = (qty * prc);
//        System.out.printf("Total: %.2f\n", total);
//        
//        //Enter cash
//        System.out.print("Please enter Cash: ");
//        double csh = scan.nextDouble();        
//        
//        //Computing the change
//        double change = (csh - total);
//        
//        //OUTPUT PRINT
//        System.out.println("\n\n\n======== ORDER RECEIPT ========");
//        System.out.println("Order:" + ord + "\n"
//        + "Quantity: " + qty);
//        
//        System.out.printf("Price: %.2f\n", prc);
//        System.out.printf("Cash: %.2f\n", csh);
//        System.out.printf("Total: %.2f\n", total);
//        System.out.printf("Change: %.2f\n", change);
//         System.out.println("=================================");
        
    }
}
