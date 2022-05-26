/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.AracDAO;
import entity.Arac;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author Sennur
 */
@FacesConverter("aracConverter")
public class AracConverter implements Converter {
    
    private AracDAO aracDao;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        String saseno_id=String.valueOf(string);
        Arac a=this.getAracDao().findByID(saseno_id);
        return a;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        Arac a=(Arac)t;
        return String.valueOf(a.getSaseno_id());
    }
    public AracDAO getAracDao(){
        if ( aracDao==null){
            this.aracDao=new AracDAO();
        }
        return aracDao;
    }
    public void setAracDao(AracDAO aracDao){
        this.aracDao=aracDao;
    }
}