/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Arac;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sennur
 */
public class AracDAO extends DBConnection{
    
    public void create(Arac a){
         try { 
             Statement st = this.connect().createStatement();
             String query = "insert into Arac (sasino_id,motor_no,arac_cinsi,model_yili,rengi) values ('"+a.getSasino_id()+"','"+a.getMotor_no()+"','"+a.getArac_cinsi()+"','"+a.getModel_yili()+"','"+a.getRengi()+"')";
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        
    }
    public void update(Arac a){
       try { 
             Statement st= this.connect().createStatement();
             String query = "update Arac set sasino_id= '"+a.getSasino_id()+"' where id='"+a.getMotor_no()+"'";
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }  
    }
    public void delete(Arac a){
         try { 
             Statement st= this.connect().createStatement();
             String query = "delete from Arac where id  "+a.getSasino_id() +a.getMotor_no() +a.getArac_cinsi() +a.getModel_yili() +a.getRengi();
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        
    }
    public List<Arac> getList(Arac a){
        List<Arac> list = new ArrayList<>();
         try { 
             Statement st= this.connect().createStatement();
             String query = "select * from Arac";
             
             ResultSet rs = st.executeQuery(query);
             
             while (rs.next()) {
                list.add(new Arac(rs.getString("saseno_id"), rs.getString("model_yili"))) ;
             }
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
         
         return list;
        
    }
}
    
