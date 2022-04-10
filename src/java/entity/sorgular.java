/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Sennur
 */
public class sorgular {
    private String saseno_id;
     private String plaka_id;
     private String bilgi;

    public sorgular(String saseno_id, String plaka_id, String bilgi) {
        this.saseno_id = saseno_id;
        this.plaka_id = plaka_id;
        this.bilgi = bilgi;
    }

    public sorgular() {
    }

    public String getSaseno_id() {
        return saseno_id;
    }

    public void setSaseno_id(String saseno_id) {
        this.saseno_id = saseno_id;
    }

    public String getPlaka_id() {
        return plaka_id;
    }

    public void setPlaka_id(String plaka_id) {
        this.plaka_id = plaka_id;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }
    
}
