/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.odemeDAO;
import dao.AracDAO;
import entity.odeme;
import entity.Arac;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
@Named(value = "odemeBean")
@SessionScoped
public class odemeBean implements Serializable {

    private odeme entity;
    private odemeDAO dao;
    private AracDAO aracDao;
    private List<odeme> list;
    private List<Arac> aracList;

    /**
     * Creates a new instance of odemeBean
     */
    public odemeBean() {
    }

    public void create(){
        this.getDao().create(entity);
        entity=new odeme();
    }
    public void update(){
        this.getDao().update(entity);
        entity=new odeme();
    }
    public void delete(odeme o){
        this.getDao().delete(o);
        entity=new odeme();
    }
    
    public odeme getEntity() {
        if (entity == null) {
            entity = new odeme();
        }
        return entity;
    }

    public void setEntity(odeme entity) {
        this.entity = entity;
    }

    public odemeDAO getDao() {
        if (dao == null) {
            dao = new odemeDAO();
        }
        return dao;
    }

    public void setDao(odemeDAO dao) {
        this.dao = dao;
    }

    public List<odeme> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<odeme> list) {
        this.list = list;
    }

    public List<Arac> getAracList() {
        this.aracList = this.getAracDao().getList();
        return aracList;
    }

    public void setAracList(List<Arac> aracList) {
        this.aracList = aracList;
    }

    public AracDAO getAracDao() {
        if (aracDao == null) {
            aracDao = new AracDAO();
        }
        return aracDao;
    }

    public void setAracDao(AracDAO aracDao) {
        this.aracDao = aracDao;
    }

}
