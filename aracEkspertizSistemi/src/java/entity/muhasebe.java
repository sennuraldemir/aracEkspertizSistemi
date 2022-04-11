
package entity;

public class muhasebe {
    
    private int firmasicilno_id;
    private int personel_id;
    private String firma_adi;
    private String odeme_bilgileri;
    private String gider_tipleri;
    
    public muhasebe(){  
    }
    
    public muhasebe(int firmasicilno_id, int personel_id, String firma_adi, String odeme_bilgileri, String gider_tipleri) {
        this.firmasicilno_id = firmasicilno_id;
        this.personel_id = personel_id;
        this.firma_adi = firma_adi;
        this.odeme_bilgileri = odeme_bilgileri;
        this.gider_tipleri = gider_tipleri;   
    }
    
    public int getFirmasicilno_id(){
        return firmasicilno_id;
    }
    public void setFirmasicilno_id(int firmasicilno_id){
        this.firmasicilno_id = firmasicilno_id;
    }
    
    public int getPersonel_id(){
        return personel_id;
    }
    public void setPersonel_id(int personel_id){
        this.personel_id = personel_id;
    }
    
    public String getFirma_adi(){
        return firma_adi;
    }
    public void setFirma_adi(String firma_adi){
        this.firma_adi = firma_adi;
    }
    
    public String getOdeme_bilgileri(){
        return odeme_bilgileri;
    }
    public void setOdeme_bilgileri(String odeme_bilgileri){
        this.odeme_bilgileri = odeme_bilgileri;
    }
    
    public String getGider_tipleri(){
        return gider_tipleri;
    }
    public void setGider_tipleri(String gider_tipleri){
        this.gider_tipleri = gider_tipleri;
    }
        
    
}
