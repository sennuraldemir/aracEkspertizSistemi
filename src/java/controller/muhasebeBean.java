package controller;

import dao.muhasebeDAO;
import entity.muhasebe;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ZEHRA
 */

@Named(value = "muhasebeBean")
@SessionScoped

public class muhasebeBean implements Serializable {

    private muhasebe entity;
    private muhasebeDAO dao;
    private List<muhasebe> list;

    
    public muhasebeBean() {
    }

    public void create(){
        this.getDao().create(entity);
        entity=new muhasebe();
    }
    
    public void update(){
        this.getDao().update(entity);
        entity=new muhasebe();
    }
    
    public void delete(muhasebe a){
        this.getDao().delete(a);
        entity=new muhasebe();
    }
    
    public void clear(){
        entity=new muhasebe();
    }
    
    public muhasebe getEntity() {
        if (entity == null) {
            entity = new muhasebe();
        }
        return entity;
    }

    public void setEntity(muhasebe entity) {
        this.entity = entity;
    }

    public muhasebeDAO getDao() {
        if (dao == null) {
            dao = new muhasebeDAO();
        }
        return dao;
    }

    public void setDao(muhasebeDAO dao) {
        this.dao = dao;
    }

    public List<muhasebe> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<muhasebe> list) {
        this.list = list;
    }

}

