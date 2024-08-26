
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class randomGame {
    public static void main(String[] args) {
        Random rd = new Random();
        
        
       Scanner sc = new Scanner(System.in);
       int number;
        
       int point = 0;
       int wrong = 0;
       int sum = 0;
       for(int i = 1; i <=4; i++){
           int random = rd.nextInt(10) + 1;
           sum += random;
           
          
              System.out.println("Enter numer: ");
        number = sc.nextInt();
        if(number==sum){
            System.out.println("Chinh xac");
            System.out.println(random + " + " + (sum-random) + "= " + sum );
            point++;
            
        }
        if(number!=sum){
            System.out.println("Ban da chon sai, sum = " + sum);
            System.out.println(random + " + " + (sum-random) + "= " + sum );
            wrong++;
           
        }
        if(wrong>3){
             System.out.println("ban da thua, diem cua ban la: " + point);
             break;
        }

       }
       if(wrong<=3){
            System.out.println("diem cua ban la: " + point);   
       }
        
       
 
}
}
