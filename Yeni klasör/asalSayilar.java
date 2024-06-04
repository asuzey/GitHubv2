/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


 /**
  *
  * @author Zeynep
  */
 public class asalSayilar {
     public static boolean asalmi(int sayi){
         for(int i = 2; i < sayi; i++){
             if(sayi % i == 0){
                 return  false;
             }
        }
         return true;
     }
     public static void main(String[] args) {
          for(int i = 2; i < 1000; i++){
              if(asalmi(i)){
                  System.out.println(i);
              }
         }
     }
 }
 