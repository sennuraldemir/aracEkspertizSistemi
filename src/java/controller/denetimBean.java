/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;


import dao.DenetimDAO;
import entity.Denetim;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
@Named(value = "denetimBean")
@SessionScoped
public class denetimBean implements Serializable {

    private Denetim entity;
    private DenetimDAO dao;
    private List<Denetim> list;

    /**
     * Creates a new instance of odemeBean
     */
    public denetimBean() {
    }

    public void create(){
        this.getDao().create(entity);
        entity=new Denetim();
    }
    public void update(){
        this.getDao().update(entity);
        entity=new Denetim();
    }
    public void delete(Denetim a){
        this.getDao().delete(a);
        entity=new Denetim();
    }
    
    public void clear(){
        entity=new Denetim();
    }
    
    public Denetim getEntity() {
        if (entity == null) {
            entity = new Denetim();
        }
        return entity;
    }

    public void setEntity(Denetim entity) {
        this.entity = entity;
    }

    public DenetimDAO getDao() {
        if (dao == null) {
            dao = new DenetimDAO();
        }
        return dao;
    }

    public void setDao(DenetimDAO dao) {
        this.dao = dao;
    }

    public List<Denetim> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Denetim> list) {
        this.list = list;
    }

}
