
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class doWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do{
            System.out.print("Enter password: ");
            pass = sc.nextLine();
            if(!pass.equals("anhtu")){
                System.out.println("Wrong!!!");
            }
        }while(!pass.equals("anhtu"));
    }
            
}
