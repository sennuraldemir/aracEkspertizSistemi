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
@Named(value = "acikraporlarcontroller")
@SessionScoped
public class acikraporlarcontroller implements Serializable {
    
    
    private String plaka_id;
    private int isemriNo;
   
    /**
     * Creates a new instance of acikraporlarcontroller
     */
    public acikraporlarcontroller() {
    
    
    }

    public String getPlaka_id() {
        return plaka_id;
    }

    public void setPlaka_id(String plaka_id) {
        this.plaka_id = plaka_id;
    }

    public int getIsemriNo() {
        return isemriNo;
    }

    public void setIsemriNo(int isemriNo) {
        this.isemriNo = isemriNo;
    }
    
    
}
