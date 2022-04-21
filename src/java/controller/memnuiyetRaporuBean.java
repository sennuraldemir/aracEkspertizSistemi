/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.MemnuniyetRaporuDAO;
import entity.MemnuniyetRaporu;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
@Named(value = "memnuniyetRaporuBean")
@SessionScoped
public class MemnuniyetRaporuBean implements Serializable {

    private MemnuniyetRaporu entity;
    private MemnuniyetRaporuDAO dao;
    private List<MemnuniyetRaporu> list;

    /**
     * Creates a new instance of odemeBean
     */
    public MemnuniyetRaporuBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new MemnuniyetRaporu();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new MemnuniyetRaporu();
    }

    public void delete(MemnuniyetRaporu a) {
        this.getDao().delete(a);
        entity = new MemnuniyetRaporu();
    }

    public void clear() {
        entity = new MemnuniyetRaporu();
    }

    public MemnuniyetRaporu getEntity() {
        if (entity == null) {
            entity = new MemnuniyetRaporu();
        }
        return entity;
    }

    public void setEntity(MemnuniyetRaporu entity) {
        this.entity = entity;
    }

    public MemnuniyetRaporuDAO getDao() {
        if (dao == null) {
            dao = new MemnuniyetRaporuDAO();
        }
        return dao;
    }

    public void setDao(MemnuniyetRaporuDAO dao) {
        this.dao = dao;
    }

    public List<MemnuniyetRaporu> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<MemnuniyetRaporu> list) {
        this.list = list;
    }

}
