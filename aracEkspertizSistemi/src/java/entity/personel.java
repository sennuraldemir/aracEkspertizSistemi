/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class personel {
    private int personel_id;
    private String adi;
    private String soyadi;
    private int yas;
    private String meslegi;
    
     public odeme() {
    }

    public odeme(int odeme_id, String sase_no, String havale, String nakit, String kredi_karti) {
        this.odeme_id = odeme_id;
        this.sase_no = sase_no;
        this.havale = havale;
        this.nakit = nakit;
        this.kredi_karti = kredi_karti;
    }
    
    public int getPersonel_id(){
        return personel_id;
    }
    public void setPersonel_id(int personel_id){
        this.personel_id = personel_id;
    }
    public String getAdi(){
        return adi;
    }
    public void setAdi(String adi){
        this.adi = adi;
    }
    public String getSoyadi(){
        return soyadi;
    }
    public void setSoyadi(String soyadi){
        this.soyadi = soyadi;
    }
    public int getYas(){
        return yas;
    }
    public void setYas(int yas){
        this.yas = yas;
    }
    public String getMeslegi(){
        return meslegi;
    }
    public void setMeslegi(String meslegi){
        this.meslegi = meslegi;
    }
        
}
