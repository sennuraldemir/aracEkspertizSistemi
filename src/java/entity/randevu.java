/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Mustafa
 */
public class randevu {

    private String randevu_id;
    private String plaka_id;
    private String tarih;
    private String saat;
    private String ad;
    private String soyad;

    public randevu(String randevu_id, String plaka_id, String tarih, String saat, String ad, String soyad) {
        this.randevu_id = randevu_id;
        this.plaka_id = plaka_id;
        this.tarih = tarih;
        this.saat = saat;
        this.ad = ad;
        this.soyad = soyad;
    }
    
    
     public randevu() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getRandevu_id() {
        return randevu_id;
    }

    public void setRandevu_id(String randevu_id) {
        this.randevu_id = randevu_id;
    }

    public String getPlaka_id() {
        return plaka_id;
    }

    public void setPlaka_id(String plaka_id) {
        this.plaka_id = plaka_id;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    /**
     * Creates a new instance of randevuController
     */
   

}