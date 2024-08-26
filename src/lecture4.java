/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;


public class lecture4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        choose = sc.nextInt();
        switch(choose){
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
                default -> System.out.println("N/A");
        }
    }
    
}
