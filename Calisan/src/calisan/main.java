/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calisan;

import java.util.Scanner;

/**
 *
 * @author Sultannur
 */
public class main {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz....");
        
        String islemler="Islemler..\n"
                + "1.Yazılımcı İşlemleri..\n"
                + "2.Yönetici İşlemleri...\n"
                + "Çıkış için q ya basınız....";
        
        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("**************************************");
        
        while(true){
        
            System.out.println("İşlemi seçiniz:");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor..........");
                break;
            }
            else if(islem.equals("1")){
            
            Yazilimci yazilimci=new Yazilimci("James Burton","Sally",547,"Python,C,Java");
            String yazilimci_islem="1.İşlem:Format At\n"
                    + "2.İşlem:Bilgileri Göster\n"
                    + "Çıkış için q ya basın...";
                System.out.println(yazilimci_islem);
            while(true){
                
                System.out.println("İşlemi seciniz:");
                String y_islem=scanner.nextLine();
                
                if(y_islem.equals("q")){
                
                    System.out.println("Yazılımcı işlemlerinden çıkılıyor....");  
                  break;
                
                }
                
                else if(y_islem.equals("1")){
                    System.out.println("İşletim sistemi:");
                    String islet=scanner.nextLine();
                    yazilimci.format_at(islet);
                
                }
                
                else if(y_islem.equals("2")){
                
                
                yazilimci.bilgileriGoster();
                }
                else{
                
                
                    System.out.println("Geçersiz Yazılımcı İşlemi.....");
                
                }
            
            
            }
            
            
            }
            
            else if(islem.equals("2")){
            
               
                Yonetici yonetici=new Yonetici("Seher","Say",123,10);
                
                String yonetici_islem="Yonetici İşlemleri:\n"
                        + "1.Zam Yap:\n"
                        + "2.Bilgileri Göster:\n"
                        + "3.Çıkış için q ya basınız:";
                
                System.out.println(yonetici_islem);
                while(true){
                
                    System.out.println("İşlemi seçiniz:");
                    String yonetici_sec=scanner.nextLine();
                    
                    if(yonetici_sec.equals("q")){
                    
                        System.out.println("Yöneticiden çıkış yapıldı.....");
                        break;
                    }
                    else if(yonetici_sec.equals("1")){
                    
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz:");
                        int zam_miktarı=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktarı);
                    
                    }
                    
                    else if(yonetici_sec.equals("2")){
                    
                    yonetici.bilgileriGoster();
                    
                    
                    }
                    
                    
                    else{
                    
                        System.out.println("Geçersiz Yönetici işlem");
                    
                    }
                
                
                }
            
            
            
            }
            
            else{
            
            
                System.out.println("Geçersiz İşlem.........");
            
            }
        
        
        
        }
    }
}
