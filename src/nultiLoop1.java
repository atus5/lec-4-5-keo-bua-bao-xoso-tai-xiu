
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class nultiLoop1 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int m;
    m = sc.nextInt();
    
    
        for(int i = 0; i < m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
        }
            System.out.println("*");
    }
}
}

