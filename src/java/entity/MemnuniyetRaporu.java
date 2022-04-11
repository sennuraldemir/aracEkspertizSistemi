/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Mustafa
 */
public class MemnuniyetRaporu {

    private int memnuniyet_id;
    private String firma_adi;
    private String begenmedim;
    private String kismi_begendim;
    private String yeterli;
    private String begendim;

    public MemnuniyetRaporu() {
    }

    public MemnuniyetRaporu(int memnuniyet_id, String firma_adi, String begenmedim, String kismi_begendim, String yeterli, String begendim) {
        this.memnuniyet_id = memnuniyet_id;
        this.firma_adi = firma_adi;
        this.begenmedim = begenmedim;
        this.kismi_begendim = kismi_begendim;
        this.yeterli = yeterli;
        this.begendim = begendim;
    }

    public int getMemnuniyet_id() {
        return memnuniyet_id;
    }

    public void setMemnuniyet_id(int memnuniyet_id) {
        this.memnuniyet_id = memnuniyet_id;
    }

    public String getFirma_adi() {
        return firma_adi;
    }

    public void setFirma_adi(String firma_adi) {
        this.firma_adi = firma_adi;
    }

    public String getBegenmedim() {
        return begenmedim;
    }

    public void setBegenmedim(String begenmedim) {
        this.begenmedim = begenmedim;
    }

    public String getKismi_begendim() {
        return kismi_begendim;
    }

    public void setKismi_begendim(String kismi_begendim) {
        this.kismi_begendim = kismi_begendim;
    }

    public String getYeterli() {
        return yeterli;
    }

    public void setYeterli(String yeterli) {
        this.yeterli = yeterli;
    }

    public String getBegendim() {
        return begendim;
    }

    public void setBegendim(String begendim) {
        this.begendim = begendim;
    }

}
