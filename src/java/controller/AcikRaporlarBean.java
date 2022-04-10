/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.AcikRaporlarDAO;
import entity.AcikRaporlar;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
@Named(value = "AcikRaporlarBean")
@SessionScoped
public class AcikRaporlarBean implements Serializable {

    private AcikRaporlar entity;
    private AcikRaporlarDAO dao;
    private List<AcikRaporlar> list;

    /**
     * Creates a new instance of odemeBean
     */
    public AcikRaporlarBean() {
    }

    public void create(){
        this.getDao().create(entity);
        entity=new AcikRaporlar();
    }
    public void update(){
        this.getDao().update(entity);
        entity=new AcikRaporlar();
    }
    public void delete(){
        this.getDao().delete(entity);
        entity=new AcikRaporlar();
    }
    
    public AcikRaporlar getEntity() {
        if (entity == null) {
            entity = new AcikRaporlar();
        }
        return entity;
    }

    public void setEntity(AcikRaporlar entity) {
        this.entity = entity;
    }

    public AcikRaporlarDAO getDao() {
        if (dao == null) {
            dao = new AcikRaporlarDAO();
        }
        return dao;
    }

    public void setDao(AcikRaporlarDAO dao) {
        this.dao = dao;
    }

    public List<AcikRaporlar> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<AcikRaporlar> list) {
        this.list = list;
    }

}
