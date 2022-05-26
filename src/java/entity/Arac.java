/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Sennur
 */
public class Arac {
    private String saseno_id;
    private String motor_no;
    private String arac_cinsi;
    private int model_yili;
    private String rengi;
    
//    public Arac(String saseno_id, String motor_no) {
//         this.saseno_id = saseno_id;
//        this.motor_no = motor_no;
//    }

    public Arac(String saseno_id, String motor_no, String arac_cinsi, int model_yili, String rengi) {
        this.saseno_id = saseno_id;
        this.motor_no = motor_no;
        this.arac_cinsi = arac_cinsi;
        this.model_yili = model_yili;
        this.rengi = rengi;
    }

    public Arac() {
    }
    
    
    public String getSaseno_id() {
        return saseno_id;
    }

    public void setSaseno_id(String saseno_id) {
        this.saseno_id = saseno_id;
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

    
}
