/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


 import java.util.Scanner;
 
 /**
  *
  * @author Zeynep
  */
 public class kullaniciGirisi {
 
     public static void main(String[] args) {
         // kullanici giris programi 
        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullanici_adi = "Asu";
        String sys_parola = "1234";
         System.out.println("*********************"
                 + "Kullanici girisine hosgeldiniz..."
                 + "*************************");
         while (true) {  
             System.out.println("Kullanici adi: ");
             String kullanici =scanner.nextLine();
             System.out.println("Parola:");
             String parola = scanner.nextLine();
             
             if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                 System.out.println("Hosgeldin, " + kullanici);
                 break;
             }
             else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                 System.out.println("Parolaniz yanlis...");
                 giris_hakki -= 1;
                 System.out.println("Giris hakki: " + giris_hakki);
             }
             else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                 System.out.println("Kullanici adiniz yanlis");
                 giris_hakki -= 1;
                 System.out.println("Giris hakki: " + giris_hakki);
             }
             else{
                 System.out.println("Kullanici adiniz ve parolaniz yanlis.");
                 giris_hakki -= 1;
                 System.out.println("Giris hakki: " + giris_hakki);
             }
             if(giris_hakki == 0){
                 System.out.println("Giris hakkiniz bitti. Yine bekleriz. ");
                 break;
             }
             
         }
     }
 }
 