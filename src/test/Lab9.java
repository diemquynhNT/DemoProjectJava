/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author monke
 */
public class Lab9 {

    public static void main(String[] args) {
        int baseSalary = 5000;
      int commissionRate1 = 8; 
      int commissionRate2 = 10; 
      int commissionRate3 = 12; 
      int targetSalary = 30000;
      
      int minimumSales = (int) Math.ceil((targetSalary - baseSalary)/ 
              ((commissionRate1 / 100.0) * 5000 + 
              (commissionRate2 / 100.0) * 5000 +
              (commissionRate3 / 100.0) * 15000));
      
      System.out.println("Minimum sales to earn $" + targetSalary + ": $" + minimumSales);
    }
}
