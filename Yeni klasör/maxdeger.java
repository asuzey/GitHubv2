/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class maxdeger {
    
    public static void main(String[] args)
            {
                // girilen 3 sayiddan en buyuk olanini bulma
        Scanner scanner = new Scanner(System.in);
        
                System.out.println("Birinci sayi: " );
                int a = scanner.nextInt();
                System.out.println("ikinci sayi: ");
                int b = scanner.nextInt();
                System.out.println(" Ucuncu sayi: ");
                int c = scanner.nextInt();
                
                int max = -1;
                
                if(a >= b && a >= c){
                    max = a;
                }
                else if (b >= a && b>= c){
                    max = b;
                }
                else {
                    max = c;
                }
                
                System.out.println(" Maksimum sayi: " + max );
    }
    
    
}