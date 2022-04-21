
package controller;

import dao.personelDAO;
import entity.personel;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ZEHRA
 */

@Named(value = "personelBean")
@SessionScoped

public class personelBean implements Serializable {

    private personel entity;
    private personelDAO dao;
    private List<personel> list;
    
    public personelBean() {
    }

    public void create(){
        this.getDao().create(entity);
        entity=new personel();
    }
    
    public void update(){
        this.getDao().update(entity);
        entity=new personel();
    }
    
    public void delete(personel a){
        this.getDao().delete(a);
        entity=new personel();
    }
    
    public void clear(){
        entity=new personel();
    }
    
    public personel getEntity() {
        if (entity == null) {
            entity = new personel();
        }
        return entity;
    }

    public void setEntity(personel entity) {
        this.entity = entity;
    }

    public personelDAO getDao() {
        if (dao == null) {
            dao = new personelDAO();
        }
        return dao;
    }

    public void setDao(personelDAO dao) {
        this.dao = dao;
    }

    public List<personel> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<personel> list) {
        this.list = list;
    }

}
