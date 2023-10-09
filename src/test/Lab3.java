/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author SV
 */
public class Lab3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 5; i++) {
            for (int j = i; j >= 2; j--) {
                if (j == i) {
                    System.out.print("");
                } else {
                    System.out.print(" " + j);
                }
            }
            System.out.println(" ****");
        }
    }
}
