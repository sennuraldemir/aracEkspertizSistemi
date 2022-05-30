/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.AcikRaporlarDAO;
import dao.randevuDAO;
import entity.AcikRaporlar;
import entity.randevu;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
@Named(value = "randevuBean")
@SessionScoped
public class randevuBean implements Serializable {

    private randevu entity;
    private randevuDAO dao;
    private List<randevu> list;
    private AcikRaporlarDAO acikRaporlarDao;
    private List<AcikRaporlar> acikRaporlarList;

    
    /**
     * Creates a new instance of randevuBean
     */
    public randevuBean() {
    }

    
    public void clearForm() {
        this.entity = new randevu();
    }
    public void create() {
        this.getDao().create(entity);
        entity = new randevu();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new randevu();
    }

    public void delete() {
        this.getDao().delete(entity);
        entity = new randevu();
    }

    public randevu getEntity() {
        if (entity == null) {
            entity = new randevu();
        }
        return entity;
    }

    public void setEntity(randevu entity) {
        this.entity = entity;
    }

    public randevuDAO getDao() {
        if (dao == null) {
            dao = new randevuDAO();
        }
        return dao;
    }

    public void setDao(randevuDAO dao) {
        this.dao = dao;
    }

    public List<randevu> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<randevu> list) {
        this.list = list;
    }

    public AcikRaporlarDAO getAcikRaporlarDao() {
         if(acikRaporlarDao==null){
            acikRaporlarDao=new AcikRaporlarDAO();
        }
        return acikRaporlarDao;
    }

    public void setAcikRaporlarDao(AcikRaporlarDAO acikRaporlarDao) {
        this.acikRaporlarDao = acikRaporlarDao;
    }

    public List<AcikRaporlar> getAcikRaporlarList() {
        this.acikRaporlarList=this.getAcikRaporlarDao().getList();
        return acikRaporlarList;
    }

    public void setAcikRaporlarList(List<AcikRaporlar> acikRaporlarList) {
        this.acikRaporlarList = acikRaporlarList;
    }

    

}
