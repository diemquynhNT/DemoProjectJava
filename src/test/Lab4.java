/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;
/**
 *
 * @author SV
 */
public class Lab4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhap vao so thu nhat va so thu hai
            System.out.print("Enter the first integer: ");
            int n1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int n2 = scanner.nextInt();
            int a = n1, b = n2;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }   int gcd = a;
            // xuat ra so lon nhat ma n1 và n2 chia het
            int k = gcd;
            while (n1 % k != 0 || n2 % k != 0) {
                k--;
            }   System.out.println("The largest value of k that divides both n1 and n2 is: " + k);
        }
    }
}
