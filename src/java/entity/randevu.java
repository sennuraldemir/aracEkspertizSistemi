/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Mustafa
 */
public class randevu implements Serializable{

    private int randevu_id;
    private String plaka_id;
    private Date tarih;
    private String adi;
    private String soyadi;

    public randevu(int randevu_id, String plaka_id, Date tarih, String adi, String soyadi) {
        this.randevu_id = randevu_id;
        this.plaka_id = plaka_id;
        this.tarih = tarih;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public randevu() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getRandevu_id() {
        return randevu_id;
    }

    public void setRandevu_id(int randevu_id) {
        this.randevu_id = randevu_id;
    }

    public String getPlaka_id() {
        return plaka_id;
    }

    public void setPlaka_id(String plaka_id) {
        this.plaka_id = plaka_id;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    
}
