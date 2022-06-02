package controller;

import dao.DenetimDAO;
import entity.Denetim;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

@Named(value="denetimBean")
@SessionScoped

public class DenetimBean implements Serializable {

    private Denetim entity;
    private DenetimDAO dao;
    private List<Denetim> list;
    
    private int page=1;
    private int pageCount=0;

    public void clearForm() {
        this.entity = new Denetim();
    }

    public void create() {
        this.getDao().create(entity);
        this.entity = new Denetim();
    }

    public void update() {
        this.getDao().update(entity);
        this.entity = new Denetim();
    }

    public void delete() {
        this.getDao().delete(entity);
        this.entity = new Denetim();
    }

    public Denetim getEntity() {
        if (this.entity == null) {
            this.entity = new Denetim();
        }
        return entity;
    }

    public void setEntity(Denetim entity) {
        this.entity = entity;
    }

    public DenetimDAO getDao() {
        if (this.dao == null) {
            this.dao = new DenetimDAO();
        }
        return dao;
    }

    public void setDao(DenetimDAO dao) {
        this.dao = dao;
    }
    
    public void previous(){
        page--;
        if(page<1){
            page=this.getPageCount();
        }
    }
    public void next(){
        page++;
        if(page>this.getPageCount()){
            page=1;
        }
    }
    

    public List<Denetim> getList() {
        this.list = this.getDao().readList(page);
        return list;
    }

    public void setList(List<Denetim> list) {
        this.list = list;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        List<Denetim> glist=this.getDao().readList();
        int size = glist.size();
        pageCount=(int) Math.ceil(size/5);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    

}
