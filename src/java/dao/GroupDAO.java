/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.SystemGroup;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author Mustafa
 */
public class GroupDAO extends DBConnection{
    
    public SystemGroup getById(Long id){
        SystemGroup sg=null;
        try{
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select*from systemgroup where id="+id);
            rs.next();
            sg=new SystemGroup(rs.getLong("id"), rs.getString("gname"), rs.getDate("created"), rs.getDate("updated"));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return sg;
    }
    
    
    
     public List<SystemGroup> readList() {
        List<SystemGroup> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select*from systemgroup");
            while (rs.next()) {
                list.add(new SystemGroup(rs.getLong("id"), rs.getString("gname"), rs.getDate("created"), rs.getDate("updated")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void create(SystemGroup d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("insert into systemgroup(gname) values ('" + d.getGname()+ "')");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(SystemGroup d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("update systemgroup set gname='" + d.getGname()+ "'where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(SystemGroup d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("delete from systemgroup where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
