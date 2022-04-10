/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.AracDAO;
import entity.Arac;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
@Named(value = "AracBean")
@SessionScoped
public class AracBean implements Serializable {

    private Arac entity;
    private AracDAO dao;
    private List<Arac> list;

    /**
     * Creates a new instance of odemeBean
     */
    public AracBean() {
    }

    public void create(){
        this.getDao().create(entity);
        entity=new Arac();
    }
    public void update(){
        this.getDao().update(entity);
        entity=new Arac();
    }
    public void delete(Arac a){
        this.getDao().delete(a);
        entity=new Arac();
    }
    
    public void clear(){
        entity=new Arac();
    }
    
    public Arac getEntity() {
        if (entity == null) {
            entity = new Arac();
        }
        return entity;
    }

    public void setEntity(Arac entity) {
        this.entity = entity;
    }

    public AracDAO getDao() {
        if (dao == null) {
            dao = new AracDAO();
        }
        return dao;
    }

    public void setDao(AracDAO dao) {
        this.dao = dao;
    }

    public List<Arac> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Arac> list) {
        this.list = list;
    }

}
