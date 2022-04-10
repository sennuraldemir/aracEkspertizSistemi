/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Sennur
 */
public class AcikRaporlar {
    private String plaka_id;
    private int isemriNo;

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

    public AcikRaporlar() {
    }

    public AcikRaporlar(String plaka_id, int isemriNo) {
        this.plaka_id = plaka_id;
        this.isemriNo = isemriNo;
    }
    
    
}
