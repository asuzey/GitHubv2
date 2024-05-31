/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class gelismisNotHesaplama {
    
    public static void main(String[] args)
            {
                //      gelismis not hesaplama
                Scanner scanner = new Scanner(System.in);
                System.out.println("Vize1: ");
                int vize1 = scanner.nextInt();
                System.out.println("Vize2: ");
                int vize2 = scanner.nextInt();
                System.out.println("Final: ");
                int finalnot = scanner.nextInt();
                
                System.out.println(" Okul ortalamaniz: ");
                double ortalama = scanner.nextDouble();
                double toplamnot = ((vize1 * 3 / 10.0) + (vize2 * 3 /10.0) + (finalnot * 4 / 10.0));
                
                if(toplamnot >= 90){
                    System.out.println(" AA aldiniz. ");
                }
                else if (toplamnot >= 85){
                    System.out.println("BA aldiniz. ");
                }
                else if (toplamnot >= 80){
                    System.out.println("BB aldiniz. ");
                }
                else if (toplamnot >= 75){
                    System.out.println("CB aldiniz. ");
                }
                else if (toplamnot >= 70){
                    System.out.println("CC aldiniz. ");
                }
                else if (toplamnot >= 65){
                    System.out.println("DC aldiniz. ");
                }
                else if (toplamnot >= 60){
                    System.out.println("DD aldiniz. ");
                    
                    if(ortalama < 2.50){
                        System.out.println("Dersi tekrar al aptal");
                    }
                }
                else if (toplamnot >= 55){
                    System.out.println("FD aldiniz ve kaldiniz ");
                }
                else {
                    System.out.println(" FF kaldiniz. ");
                }
    }
}

