package controller;

import dao.muhasebeDAO;
import entity.muhasebe;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ZEHRA
 */
@Named(value = "muhasebeBean")
@SessionScoped

public class muhasebeBean implements Serializable {

    private muhasebe entity;
    private muhasebeDAO dao;
    private List<muhasebe> list;
     private int page = 1;
    private int pageCount = 0;

    public muhasebeBean() {
    }

    public void clearForm() {
        this.entity = new muhasebe();
    }

    public void create() {
        this.getDao().create(entity);
        entity = new muhasebe();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new muhasebe();
    }

    public void delete() {
        this.getDao().delete(entity);
        entity = new muhasebe();
    }

    public void clear() {
        entity = new muhasebe();
    }

    public muhasebe getEntity() {
        if (entity == null) {
            entity = new muhasebe();
        }
        return entity;
    }

    public void setEntity(muhasebe entity) {
        this.entity = entity;
    }

    public muhasebeDAO getDao() {
        if (dao == null) {
            dao = new muhasebeDAO();
        }
        return dao;
    }

    public void setDao(muhasebeDAO dao) {
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

    
    public List<muhasebe> getList() {
        this.list = this.getDao().readList(page);
        return list;
    }

    public void setList(List<muhasebe> list) {
        this.list = list;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        List<muhasebe> glist = this.getDao().readList();
        int size = glist.size();
        pageCount = (int) Math.ceil(size / 5);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}
