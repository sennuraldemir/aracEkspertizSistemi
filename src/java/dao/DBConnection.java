/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sennur
 */
public abstract class DBConnection {
    
    public Connection connect(){
        
        Connection a=null;
        try { 
            Class.forName("org.postgresql.Driver");
            a=DriverManager.getConnection("jdbc:postgresql://localhost:5433/aracEkspertizSistemi","postgres","12345");
   
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        return a;
    
    }
    
    
    
    
}
