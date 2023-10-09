/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author SV
 */
public class ShowCurrentTime {
    public static void main(String[] args){
        
        
        
        long totalMiliseconds = System.currentTimeMillis();
        
        long totalSeconds = totalMiliseconds / 1000;
        
        long currentSecond = totalSeconds % 60;
             
        long totalMinutes = totalSeconds / 60;
        
        long currentMinute = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        
        long currentHours = totalHours % 24;
        
        System.out.println("Current time is " + currentHours + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
