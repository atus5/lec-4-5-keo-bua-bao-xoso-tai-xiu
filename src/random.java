
import java.util.Scanner;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class random {
    public static void main(String[] args) {
        Random rd = new Random();
        int random = rd.nextInt(10);
        System.out.println(random);
        
    }
}
