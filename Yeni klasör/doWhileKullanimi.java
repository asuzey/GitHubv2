/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class doWhileKullanimi {
    
    public static void main(String[] args)
            {
                // rakamları toplamı
             Scanner scanner = new Scanner(System.in);
                System.out.println("Bir sayi giriniz.");
                int sayi = scanner.nextInt();
                int toplam = 0;
                do{
                    toplam += sayi % 10;
                    sayi /= 10;
                    System.out.println(" sayi: " + sayi);
                }while(sayi > 0);
                
                System.out.println("Rakamlari toplami " + toplam);
    }
}
