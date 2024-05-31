/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class HesapMakinesi {
    
    public static void main(String[] args)
            {
                // basit hesap makinesi (switch case)
        Scanner scanner = new Scanner(System.in);
                System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        String islemler = "1. toplama islemi\n" + "2. cikarma islemi\n" 
                + "3. carpma islemi\n" + "4. bolme islemi";
                System.out.println(islemler);    
                System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
                System.out.println(" islem seciniz: ");
                String islem = scanner.nextLine();
                int a;
                int b;
                
                switch(islem){
                        case "1":
                            System.out.println("birinci sayi: ");
                            a = scanner.nextInt();
                            System.out.println("ikinci sayi: ");
                            b = scanner.nextInt();
                            System.out.println("Toplam: " + (a + b));
                            break;
                        case "2":
                            System.out.println("birinci sayi: ");
                            a = scanner.nextInt();
                            System.out.println("ikinci sayi: ");
                            b = scanner.nextInt();
                            System.out.println("Fark: " + (a - b));
                            break;
                        case "3":
                            System.out.println("birinci sayi: ");
                            a = scanner.nextInt();
                            System.out.println("ikinci sayi: ");
                            b = scanner.nextInt();
                            System.out.println(" carpimi " + (a * b));
                            break;
                        case "4":
                            System.out.println("birinci sayi: ");
                            a = scanner.nextInt();
                            System.out.println("ikinci sayi: ");
                            b = scanner.nextInt();
                            System.out.println("Bolumu: " + ((double)a / b));
                            break;
                        default:
                            System.out.println("Gecersiz islem.");
                                    }     
    }
    
    
}
