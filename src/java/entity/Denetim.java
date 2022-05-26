/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author sennur
 */
public class Denetim {

    private int denetim_id;
    private int firmasicil_no;
    private int denetim_tarihi;
    private String denetim_bulgu;
    private int puan_sonucu;

    public Denetim(int denetim_id, int firmasicil_no, int denetim_tarihi, String denetim_bulgu, int puan_sonucu) {
        this.denetim_id = denetim_id;
        this.firmasicil_no = firmasicil_no;
        this.denetim_tarihi = denetim_tarihi;
        this.denetim_bulgu = denetim_bulgu;
        this.puan_sonucu = puan_sonucu;
    }

    public Denetim() {
    }

    public int getDenetim_id() {
        return denetim_id;
    }

    public void setDenetim_id(int denetim_id) {
        this.denetim_id = denetim_id;
    }

    public int getFirmasicil_no() {
        return firmasicil_no;
    }

    public void setFirmasicil_no(int firmasicil_no) {
        this.firmasicil_no = firmasicil_no;
    }

    public int getDenetim_tarihi() {
        return denetim_tarihi;
    }

    public void setDenetim_tarihi(int denetim_tarihi) {
        this.denetim_tarihi = denetim_tarihi;
    }

    public String getDenetim_bulgu() {
        return denetim_bulgu;
    }

    public void setDenetim_bulgu(String denetim_bulgu) {
        this.denetim_bulgu = denetim_bulgu;
    }

    public int getPuan_sonucu() {
        return puan_sonucu;
    }

    public void setPuan_sonucu(int puan_sonucu) {
        this.puan_sonucu = puan_sonucu;
    }

    
    
 

}