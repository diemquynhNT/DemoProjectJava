/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author SV
 */
import java.util.Scanner;
public class Lab5 {
  public static void main(String[] args) {
    int h;
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n Nhap chieu cao cua tam giac: ");
    h = scanner.nextInt();
    int x, output;
  
    for(int i = 1; i<= h; i++){
      for(int j = 0; j<= 2*h; j++){
        x = j-h;
        if(x < 0){
          x *= -1;
        }
        output = i - x;
        if(output > 0){
          System.out.printf("%3d", output);
        } 
        else{
          System.out.printf("   ");
        }
      }
      System.out.println();
    }
  }
}