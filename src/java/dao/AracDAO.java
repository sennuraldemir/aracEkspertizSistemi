/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Arac;
import util.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sennur
 */
public class AracDAO extends DBConnection{
       




   public Arac findByID(String saseno_id){
        Arac a=null;
        
         try { 
              Statement st = this.getConnection().createStatement();
             String query ="select*from arac where saseno_id= "+saseno_id;
             ResultSet rs =st.executeQuery(query);
             
             while(rs.next()){
                 a=new Arac (rs.getString("saseno_id"),rs.getString("motor_no"));
             }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
     return a;
 }
     
    
    public void create(Arac a){
         try { 
              Statement st = this.getConnection().createStatement();
             String query = "insert into Arac (saseno_id,motor_no,arac_cinsi,model_yili,rengi) values ('"+a.getSaseno_id()+"','"+a.getMotor_no()+"','"+a.getArac_cinsi()+"','"+a.getModel_yili()+"','"+a.getRengi()+"')";
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        
    }
    public void update(Arac a){
       try { 
              Statement st = this.getConnection().createStatement();
             String query = "update Arac set motor_no= '"+a.getMotor_no()+"' , arac_cinsi='"+a.getArac_cinsi()+"', model_yili= "+a.getModel_yili()+", rengi='"+a.getRengi()+"' where saseno_id='"+a.getSaseno_id()+"'";
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }  
    }
    public void delete(Arac a){
         try { 
              Statement st = this.getConnection().createStatement();
             String query = "delete from Arac where saseno_id=  '"+a.getSaseno_id()+"'";
             
             st.executeUpdate(query);
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        
    }
    public List<Arac> getList() {//(int page,int pageSize){//public List<Arac> getList() count(int page,int pageSize){
        List<Arac> list = new ArrayList<>();//int count=0;
         try { 
             Statement st = this.getConnection().createStatement();
             String query = "select * from Arac";
             
             ResultSet rs = st.executeQuery(query);
             
             while (rs.next()) {
                list.add(new Arac(rs.getString("saseno_id"), rs.getString("motor_no") , rs.getString("arac_cinsi"),rs.getInt("model_yili"),rs.getString("rengi"))) ;
             }
             
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
         
         return list;
        
    }

   
}
    
