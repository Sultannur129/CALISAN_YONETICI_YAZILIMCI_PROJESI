/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calisan;

/**
 *
 * @author Sultannur
 */
public class Yazilimci extends Calisann {
    
    private String diller;
    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
    
    public void format_at(String isletim_sistemi){
    
        System.out.println(getAd()+" "+isletim_sistemi+"ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        
        super.bilgileriGoster();
                         //To change body of generated methods, choose Tools | Templates
        System.out.println("Yazılımcının bildiği diller:"+diller);
    }
    
    
    
    
}
