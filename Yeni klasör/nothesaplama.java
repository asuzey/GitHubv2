/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class nothesaplama {
    
    /**
     * @param args
     */
    public static void main(String[] args)
            {
                // not hesaplama uygulaması
        Scanner scanner = new Scanner(System.in);
                System.out.println("Not giriniz. ");
                int not = scanner.nextInt();
                
                if (not >= 90){
                    System.out.println(" AA ");
          }
                else if ( not >= 85) {
                    System.out.println(" BA ");
                }
                else if( not >= 80){
                    System.out.println(" BB ");
                }
                else if (not >= 75){
                    System.out.println("CB");
                }
                else if (not >= 70 ){
                    System.out.println("CC");
                }
                else if (not >= 65){
                    System.out.println("DC");
                }
                else if (not >=60 ){
                    System.out.println("DC");
                }
                else {
                    System.out.println("Kaldiniz.");
                }
    }
}
