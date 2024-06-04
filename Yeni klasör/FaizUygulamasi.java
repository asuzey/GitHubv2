  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 

 import java.util.Scanner;
 
 /**
  *
  * @author Zeynep
  */
 public class FaizUygulamasi {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Bankamiza hosgeldiniz. Faiz orani %6");
         
         int anapara,vade;
         System.out.println("Yatirmak istediginiz tutar: ");
         anapara = scanner.nextInt();
         System.out.println("Paranizi kac yil vadeli yatirmak istiyorsunuz?");
         vade = scanner.nextInt();
         
         int toplampara  = anapara;
         double faizOrani = 0.06;
         for(int i = 1; i<= vade; i++){
             toplampara = (int) ((toplampara * faizOrani) + toplampara);
             System.out.println(i + ".yilin sonunda toplam para: " + toplampara);
         }
     }
 }
 