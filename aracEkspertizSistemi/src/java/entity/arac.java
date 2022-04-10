/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Sennur
 */
public class arac {
    private String sasino_id;
    private String motor_no;
    private String arac_cinsi;
    private int model_yili;
    private String rengi;

    public arac(String sasino_id, String motor_no, String arac_cinsi, int model_yili, String rengi) {
        this.sasino_id = sasino_id;
        this.motor_no = motor_no;
        this.arac_cinsi = arac_cinsi;
        this.model_yili = model_yili;
        this.rengi = rengi;
    }

    public arac() {
    }

    public arac(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    public String getSasino_id() {
        return sasino_id;
    }

    public void setSasino_id(String sasino_id) {
        this.sasino_id = sasino_id;
    }

    public String getMotor_no() {
        return motor_no;
    }

    public void setMotor_no(String motor_no) {
        this.motor_no = motor_no;
    }

    public String getArac_cinsi() {
        return arac_cinsi;
    }

    public void setArac_cinsi(String arac_cinsi) {
        this.arac_cinsi = arac_cinsi;
    }

    public int getModel_yili() {
        return model_yili;
    }

    public void setModel_yili(int model_yili) {
        this.model_yili = model_yili;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
