/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.AcikRaporlarDAO;
import entity.AcikRaporlar;
import dao.randevuDAO;
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
    private AcikRaporlarDAO acikRaporlarDao;
    private List<randevu> list;
    private List<AcikRaporlar> acikRaporlarList;

    /*
    private odeme entity;
    private odemeDAO dao;
    private AracDAO aracDao;
    private List<odeme> list;
    private List<Arac> aracList;

     */
    /**
     * Creates a new instance of randevuBean
     */
    public randevuBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new randevu();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new randevu();
    }

    public void delete(randevu r) {
        this.getDao().delete(r);
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

    public List<AcikRaporlar> getAcikRaporlarList() {
        this.acikRaporlarList = this.getAcikRaporlarDAO().getList();
        return acikRaporlarList;
    }

    public void setAcikRaporlarList(List<AcikRaporlar> acikRaporlarList) {
        this.acikRaporlarList = acikRaporlarList;
    }

    public AcikRaporlarDAO getAcikRaporlarDAO() {
        if (acikRaporlarDao == null) {
            acikRaporlarDao = new AcikRaporlarDAO();
        }
        return acikRaporlarDao;
    }

    public void setAcikRaporlarDao(AcikRaporlarDAO acikRaporlarDao) {
        this.acikRaporlarDao = acikRaporlarDao;
    }

  
    
    
    
}