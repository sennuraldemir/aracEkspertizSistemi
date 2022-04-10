/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Mustafa
 */
public class odeme {

    private int odeme_id;
    private String sase_no;
    private String havale;
    private String nakit;
    private String kredi_karti;

    public odeme() {
    }

    public odeme(int odeme_id, String sase_no, String havale, String nakit, String kredi_karti) {
        this.odeme_id = odeme_id;
        this.sase_no = sase_no;
        this.havale = havale;
        this.nakit = nakit;
        this.kredi_karti = kredi_karti;
    }

    public int getOdeme_id() {
        return odeme_id;
    }

    public void setOdeme_id(int odeme_id) {
        this.odeme_id = odeme_id;
    }

    public String getSase_no() {
        return sase_no;
    }

    public void setSase_no(String sase_no) {
        this.sase_no = sase_no;
    }

    public String getHavale() {
        return havale;
    }

    public void setHavale(String haavale) {
        this.havale = haavale;
    }

    public String getNakit() {
        return nakit;
    }

    public void setNakit(String nakit) {
        this.nakit = nakit;
    }

    public String getKredi_karti() {
        return kredi_karti;
    }

    public void setKredi_karti(String kredi_karti) {
        this.kredi_karti = kredi_karti;
    }

}
