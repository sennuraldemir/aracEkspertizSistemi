package dao;

import entity.muhasebe;
import util.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class muhasebeDAO extends DBConnection {
  
    
    public void create(muhasebe c){
        
        try{
             Statement st = this.getConnection().createStatement();
            String query = "insert into muhasebe (personel_id, firma_adi, odeme_bilgileri, gider_tipleri) values ('" + c.getPersonel_id() + "' , '" + c.getFirma_adi() + "' , '" + c.getOdeme_bilgileri() + "' , '" + c.getGider_tipleri() + "')";
            st.executeUpdate(query);
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        
    }
    
    public void update(muhasebe c){
        
        try{
             Statement st = this.getConnection().createStatement();
            String query = "update muhasebe set personel_id='" + c.getPersonel_id() + "' where id= "+c.getFirmasicilno_id();
            st.executeUpdate(query);
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        
    }
    
    public void delete(muhasebe c){
        
        try{
             Statement st = this.getConnection().createStatement();
            String query = "delete from muhasebe where id" + c.getFirmasicilno_id();
            st.executeUpdate(query);
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            
        }
        
    }
    public List<muhasebe> getList(){
        List<muhasebe> list = new ArrayList<>();
        
        try{
             Statement st = this.getConnection().createStatement();
            String query = "select * from muhasebe";
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                list.add(new muhasebe(rs.getInt("firmasicilno_id"), rs.getInt("personel_id"), rs.getString("firma_adi"), rs.getString("odeme_bilgileri"), rs.getString("gider_tipleri")));
                   
            }
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return list;
        
    }
    
}
