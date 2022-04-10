/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.AcikRaporlar;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sennur
 */
public class AcikRaporlarDAO extends DBConnection{
    
    public void create(AcikRaporlar a){
         try { 
             Statement st = this.connect().createStatement();
             String query = "insert into acikRaporlar (plaka_id,isemriNo) values ('"+a.getPlaka_id()+"','"+a.getIsemriNo()+"')";
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        
    }
    public void update(AcikRaporlar a){
       try { 
             Statement st= this.connect().createStatement();
             String query = "update acikRaporlar set plaka_id= '"+a.getPlaka_id()+"' where id='"+a.getIsemriNo()+"'";
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }  
    }
    public void delete(AcikRaporlar a){
         try { 
             Statement st= this.connect().createStatement();
             String query = "delete from acikRaporlar where id  "+a.getPlaka_id() +a.getIsemriNo() ;
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        
    }
    public List<AcikRaporlar> getList(AcikRaporlar a){
        List<AcikRaporlar> list = new ArrayList<>();
         try { 
             Statement st= this.connect().createStatement();
             String query = "select * from acikRaporlar";
             
             ResultSet rs = st.executeQuery(query);
             
             while (rs.next()) {
                list.add(new AcikRaporlar(rs.getString("plaka_id"), rs.getInt("isemriNo"))) ;
             }
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
         
         return list;
        
    }

    public List<AcikRaporlar> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    
