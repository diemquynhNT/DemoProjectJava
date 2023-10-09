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
public class Lab7 {

    public static void main(String[] args) {
        //
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Nhap so luong hoc sunh : ");
            int numStudents = scanner.nextInt();
            double highestScore = 0;
            String highestScoreName = "";
            if(numStudents<1)
            {
                System.out.print("Sô luong phia lon hon 1");
            }
            else
            {
              for (int i = 0; i < numStudents; i++) {
                System.out.printf("hoc sinh thu %d: ", (i + 1));
                String name = scanner.next();
                double score = scanner.nextDouble();
                if (score >= highestScore) {
                    highestScore = score;
                    highestScoreName = name;
                }
            }        
            }
              
            
            System.out.print("Hoc sinh cao diem nhat la: "+ highestScoreName+"diem: "+highestScore);
        }
    }
}
