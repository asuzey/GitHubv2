/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udemy;

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class bki {
    
    public static void main(String[] args)
            {
                // beden-kitle endeksi hesaplama
        Scanner scanner = new Scanner(System.in);
        
                System.out.println("Kilo giriniz: ");
                int kilo = scanner.nextInt();
                System.out.println("Boy giriniz: ");
                double boy = scanner.nextDouble();
                
                double bki = (kilo / (boy * boy));
                
                if( bki < 18.5 ){
                    System.out.println(" Zayif ");
                }
                else if(bki >= 18.5 && bki < 25){
                    System.out.println(" Normal ");
                }
                else if( bki >= 25 && bki > 30){ 
                    System.out.println(" Kilolu ");
                }
                else {
                    System.out.println(" OBEZ ");
                }
                    
    }
    
    
}
