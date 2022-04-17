/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.sun.xml.ws.developer.Serialization;
import dao.MemnuniyetRaporuDAO;
import entity.MemnuniyetRaporu;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mustafa
 */
public class MemnuniyetRaporuBean implements Serializable{
     private MemnuniyetRaporu entity;
    private MemnuniyetRaporuDAO dao;
    private List<MemnuniyetRaporu> list;

    public MemnuniyetRaporuBean() {
    }

    
    public void create(){
        this.getDao().create(entity);
        entity=new MemnuniyetRaporu();
    }
    public void update(){
        this.getDao().update(entity);
        entity=new MemnuniyetRaporu();
    }
    public void delete(MemnuniyetRaporu m){
        this.getDao().delete(m);
        entity=new MemnuniyetRaporu();
    }
    public void clear(){
        entity=new MemnuniyetRaporu();
    }
    
    public MemnuniyetRaporu getEntity() {
        return entity;
    }

    public void setEntity(MemnuniyetRaporu entity) {
        this.entity = entity;
    }

    public MemnuniyetRaporuBean getDao() {
        return dao;
    }

    public void setDao(MemnuniyetRaporuBean dao) {
        this.dao = dao;
    }

    public List<MemnuniyetRaporu> getList() {
        return list;
    }

    public void setList(List<MemnuniyetRaporu> list) {
        this.list = list;
    }
    
    
    
}
