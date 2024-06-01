/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 

 import java.util.Scanner;
 
 /**
  *
  * @author Zeynep
  */
 public class armstrongsayisi {
 
     public static void main(String[] args) {
         //armstrong sayisi bulma
         Scanner scanner = new Scanner(System.in);
         System.out.println("Bir sayi giriniz. ");
         int sayi = scanner.nextInt();
         System.out.print("Basamak sayisi:");
         int gecici_sayi = sayi;
         int toplam = 0;
         int basamak_sayisi = scanner.nextInt();
         do {            
             int basamak_degeri = gecici_sayi % 10;
             gecici_sayi /= 10;
             
             toplam += Math.pow(basamak_degeri,basamak_sayisi);
         } while (gecici_sayi > 0);
         if(sayi == toplam){
             System.out.println("Bu sayi bir armstrong sayisidir.");
         }
         else{
             System.out.println("Bu sayi bir armstrong sayisi degil.");
         }
     }
 }
 