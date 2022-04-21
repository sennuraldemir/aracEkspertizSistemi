/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author Sennur
 */
@FacesConverter
public class AracConverter implements Converter {
    
    private AracDAO aracDao;

    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        int id=Integer.valueOf(string);
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
    }
    
}
 