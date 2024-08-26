
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class whleLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 1;
//        
//        while(n<=200){
//            System.out.println("num: "+ n);
//            n *=2;
//        }
    


//int n = 91;
//    int factor = 2;
//    while(n%factor != 0){
//        factor++;
//    }
//        System.out.println("Fist factor is: " + factor);
    


int sum = 0;
        System.out.println("Enter number: (-1 to quit)");
int n = sc.nextInt();
while(n!=-1){
    System.out.println("Enter number: (-1 to quit)");
    sum = sum + n;
    n = sc.nextInt();
}
        System.out.println("Sum: " + sum);

    
    }
}
