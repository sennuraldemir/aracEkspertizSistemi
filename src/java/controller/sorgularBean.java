/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.sorgularDAO;
import entity.sorgular;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
@Named(value = "sorgularBean")
@SessionScoped
public class sorgularBean implements Serializable {

    private sorgular entity;
    private sorgularDAO dao;
    private List<sorgular> list;

    /**
     * Creates a new instance of odemeBean
     */
    public sorgularBean() {
    }

    public void create(){
        this.getDao().create(entity);
        entity=new sorgular();
    }
    public void update(){
        this.getDao().update(entity);
        entity=new sorgular();
    }
    public void delete(sorgular a){
        this.getDao().delete(a);
        entity=new sorgular();
    }
    
    public void clear(){
        entity=new sorgular();
    }
    
    public sorgular getEntity() {
        if (entity == null) {
            entity = new sorgular();
        }
        return entity;
    }

    public void setEntity(sorgular entity) {
        this.entity = entity;
    }

    public sorgularDAO getDao() {
        if (dao == null) {
            dao = new sorgularDAO();
        }
        return dao;
    }

    public void setDao(sorgularDAO dao) {
        this.dao = dao;
    }

    public List<sorgular> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<sorgular> list) {
        this.list = list;
    }

}
