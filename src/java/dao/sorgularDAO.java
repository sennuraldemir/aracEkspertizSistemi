/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.sorgular;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sennur
 */
public class sorgularDAO extends DBConnection {

    public void create(sorgular a){
         try { 
             Statement st = this.connect().createStatement();
             String query = "insert into sorgular (saseno_id,plaka_id,blgi) values ('"+a.getSaseno_id()+"','"+a.getPlaka_id()+"','"+a.getBilgi()+"')";
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        
    }
    public void update(sorgular a){
       try { 
             Statement st= this.connect().createStatement();
             String query = "update sorgular set saseno_id= '"+a.getSaseno_id()+"' , plaka_id='"+a.getPlaka_id()+"', bilgi='"+a.getBilgi()+"' where saseno_id='"+a.getSaseno_id()+"'";
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }  
    }
    public void delete(sorgular a){
         try { 
             Statement st= this.connect().createStatement();
             String query = "delete from sorgular where saseno_id=  '"+a.getSaseno_id()+"'";
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
    
    }
    public List<sorgular> getList() {
        List<sorgular> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            String query = "select * from sorgular";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new sorgular(rs.getString("saseno_id"), rs.getString("plaka_id"), rs.getString("bilgi")));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;

    }

}
