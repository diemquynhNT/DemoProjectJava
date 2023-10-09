/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author monke
 */
public class Lab8 {

    public static void main(String[] args) {
        //Nhập số tiền vay và thời hạn vay
        try (Scanner scanner = new Scanner(System.in)) {
            //Nhập số tiền vay và thời hạn vay
            System.out.print("Loan Amount: ");
            double loanAmount = scanner.nextDouble();
            
            System.out.print("Number of years: ");
            int numberOfYears = scanner.nextInt();
            
            double interestRate = 5.0;
            System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
            
            while (interestRate <= 8.0) {
                
                //Tính tổng số tháng trong số năm vay
                int numberOfMonths = numberOfYears * 12;
                
                //Tính lãi suất hàng tháng và số tiền phải trả hàng tháng
                double monthlyInterestRate = interestRate / 1200;
                double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths));
                double totalPayment = monthlyPayment * numberOfMonths;
                
                //Hiển thị kết quả
                System.out.printf("%-20.3f%-20.2f%-20.2f\n", interestRate, monthlyPayment, totalPayment);
                
                //Tăng lãi suất lên mau 1/8
                interestRate += 0.125;
            }
        }
    }
}
