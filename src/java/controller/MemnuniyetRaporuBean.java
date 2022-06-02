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
 * @author sennur
 */
@Named(value = "memnuniyetRaporuBean")
@SessionScoped
public class MemnuniyetRaporuBean implements Serializable {

    private MemnuniyetRaporu entity;
    private MemnuniyetRaporuDAO dao;
    private List<MemnuniyetRaporu> list;

    private int page = 1;
    private int pageCount = 0;

    public void clearForm() {
        this.entity = new MemnuniyetRaporu();
    }

    public void create() {
        this.getDao().create(entity);
        entity = new MemnuniyetRaporu();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new MemnuniyetRaporu();
    }

    public void delete() {
        this.getDao().delete(entity);
        entity = new MemnuniyetRaporu();
    }

    public MemnuniyetRaporu getEntity() {
        if (this.entity == null) {
            this.entity = new MemnuniyetRaporu();
        }
        return entity;
    }

    public void setEntity(MemnuniyetRaporu entity) {
        this.entity = entity;
    }

    public MemnuniyetRaporuDAO getDao() {
        if (this.dao == null) {
            this.dao = new MemnuniyetRaporuDAO();
        }
        return dao;
    }

    public void setDao(MemnuniyetRaporuDAO dao) {
        this.dao = dao;
    }

    public void previous() {
        page--;
        if (page < 1) {
            page = this.getPageCount();
        }
    }

    public void next() {
        page++;
        if (page > this.getPageCount()) {
            page = 1;
        }
    }

    public List<MemnuniyetRaporu> getList() {
        this.list = this.getDao().readList(page);
        return list;
    }

    public void setList(List<MemnuniyetRaporu> list) {
        this.list = list;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        List<MemnuniyetRaporu> glist = this.getDao().readList();
        int size = glist.size();
        pageCount = (int) Math.ceil(size / 5);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}
