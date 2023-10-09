/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author SV
 */
public class Lab6 {

    public static void main(String[] args) {
        double tienhoc = 10000;
        double tile = 0.05;

        // Hoc phi trong 10 năm
        for (int year = 1; year <= 10; year++) {
            System.out.printf("Nam hoc %d, hoc phi: $%.2f\n", year, tienhoc);
            tienhoc =tienhoc* (1 + tile);
        }
        // So tien phai dong
        double total = 0;
        for (int year = 11; year <= 14; year++) {
            total += tienhoc;
            tienhoc *= (1 + tile);
        }
        System.out.printf("hoc phi 4 nam sau nam thu : $%.2f\n", total);
    }
}
