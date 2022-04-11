
package entity;

public class personel {
    private int personel_id;
    private String adi;
    private String soyadi;
    private int yas;
    private String meslegi;
    
     public personel() {
    }

    public personel(int personel_id, String adi, String soyadi, int yas, String meslegi) {
        this.personel_id = personel_id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.yas = yas;
        this.meslegi = meslegi;
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
