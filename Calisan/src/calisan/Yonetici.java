/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calisan;

/**
 *
 * @author Sultannur
 */
public class Yonetici extends Calisann {
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        
        super.bilgileriGoster();
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı:"+sorumlu_kisi_sayisi);
    }
    
    public void zamYap(int zam_miktarı){
    
        System.out.println(getAd()+" çalışanlara "+zam_miktarı+" kadar zam yapıyor.....");
    
    }
    
    
    
    
}
