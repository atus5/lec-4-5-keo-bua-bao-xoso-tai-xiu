
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
public class keoBuaBao {
     public static void main(String[] args) {
        Random rd = new Random();
        int random = rd.nextInt(3) + 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. bua 2. keo 3. bao");
        System.out.print("Nhap so: ");
        int play = sc.nextInt();

        String playerChoice = "";
        String botChoice = "";

        switch (play) {
            case 1: playerChoice = "bua"; break;
            case 2: playerChoice = "keo"; break;
            case 3: playerChoice = "bao"; break;
            default: System.out.println("Lua chon khong hop le."); return;
        }

        switch (random) {
            case 1: botChoice = "bua"; break;
            case 2: botChoice = "keo"; break;
            case 3: botChoice = "bao"; break;
        }

        System.out.println("Ban chon: " + playerChoice);
        System.out.println("Bot chon: " + botChoice);

        if (play == random) {
            System.out.println("Hoa, bot ra: " + botChoice);
        } else if ((play == 1 && random == 2) || (play == 2 && random == 3) || (play == 3 && random == 1)) {
            System.out.println("Ban da thang, bot ra: " + botChoice);
        } else {
            System.out.println("Ban da thua, bot ra: " + botChoice);
        }
    }
}

