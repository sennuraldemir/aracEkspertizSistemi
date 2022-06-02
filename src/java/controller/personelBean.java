package controller;

import dao.personelDAO;
import entity.personel;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ZEHRA
 */
@Named(value = "personelBean")
@SessionScoped

public class personelBean implements Serializable {

    private personel entity;
    private personelDAO dao;
    private List<personel> list;

    private int page = 1;
    private int pageCount = 0;

    public personelBean() {
    }

    public void clearForm() {
        this.entity = new personel();
    }

    public void create() {
        this.getDao().create(entity);
        entity = new personel();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new personel();
    }

    public void delete() {
        this.getDao().delete(entity);
        entity = new personel();
    }

    public personel getEntity() {
        if (entity == null) {
            entity = new personel();
        }
        return entity;
    }

    public void setEntity(personel entity) {
        this.entity = entity;
    }

    public personelDAO getDao() {
        if (dao == null) {
            dao = new personelDAO();
        }
        return dao;
    }

    public void setDao(personelDAO dao) {
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

    public List<personel> getList() {
        this.list = this.getDao().readList(page);
        return list;
    }

    public void setList(List<personel> list) {
        this.list = list;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        List<personel> glist = this.getDao().readList();
        int size = glist.size();
        pageCount = (int) Math.ceil(size / 5);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}
