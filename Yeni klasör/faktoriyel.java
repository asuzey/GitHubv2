/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class faktoriyel {
    
    /**
     * @param args
     */
    public static void main(String[] args)
            {
                // for döngüsü ile faktöriyel hesaplama
                Scanner scanner = new Scanner(System.in);
                System.out.println("Bir sayi giriniz. ");
                int faktoriyel = 1;
                int sayi = scanner.nextInt();
                
                for(int i = 1; i <= sayi; i++){
                    faktoriyel *= i;
                    
                   // girilen sayiya kadar olan olan sayıların da faktoriyelini gösterdim. 
                    System.out.println( "" + i + "in faktoriyeli = " + faktoriyel);
            }
                System.out.println("Faktoriyel = " + faktoriyel);
                /* 
                // faktoriyel hesaplama ama while dongusuyle
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Bir sayi giriniz: ");
                int sayi = scanner.nextInt();
                int faktoriyel = 1;
                
                while (sayi > 0){
                    faktoriyel *= sayi;
                    sayi--;
                }
                System.out.println("Faktoriyeli= " + faktoriyel );
                */
    }
}
