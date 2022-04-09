/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;


/**
 *
 * @author Sennur
 */
@Named(value = "sorgularController")
@SessionScoped
public class sorgularController implements Serializable{
    
     private String sasino_id;
     private String plaka_id;
     private String bilgi;
    /**
     * Creates a new instance of sorgularController
     */
    public sorgularController() {
    
    
    }

    public String getSasino_id() {
        return sasino_id;
    }

    public void setSasino_id(String sasino_id) {
        this.sasino_id = sasino_id;
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
