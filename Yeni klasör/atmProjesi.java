
import java.util.Scanner;


/**
 *
 * @author Zeynep
 */
public class atmProjesi {
    
    public static void main(String[] args)
            {
             Scanner scanner = new Scanner(System.in);
             int bakiye = 1000;
             String islemler = "1. islem: Bakiye ogrenme\n"
                     + "2. islem: Para cekme\n"
                     + "3. islem: Para yatirma\n"
                     + "cikis icin 'Q' ya basin";
             
             
                System.out.println("**************************");
                System.out.println(islemler);
                System.out.println("**************************");
                
                while(true){
                    System.out.println("islemi seciniz: ");
                    String islem = scanner.nextLine();
                    
                    if(islem.equals("q")) {
                        System.out.println("Programdan cikiliyor.");
                        break;
                    }
                    else if(islem.equals("1")){
                        System.out.println("Bakiyeniz: " + bakiye);
                    }
                    else if(islem.equals("2")){
                        System.out.println("Cekmek istediginiz tutar: ");
                        int tutar = scanner.nextInt();
                        scanner.nextLine();
                        if(bakiye - tutar < 0){
                            System.out.println("yeterli bakiye bulunmamaktadir. Bakiyeniz: " + bakiye );
                        }
                        else{
                            bakiye -= tutar;
                            System.out.println("islem sonu bakiyeniz: " + bakiye);
                        }
                    }
                    else if(islem.equals("3")){
                        System.out.println("Yatirmak istediginiz tutar: ");
                        int tutar = scanner.nextInt();
                        scanner.nextLine();
                        
                            bakiye += tutar;
                            System.out.println("islem sonu bakiyeniz: " + bakiye);
                        
                    }
                    else{
                        System.out.println("Gecersiz islem... ");
                    }
                }
    }
}
