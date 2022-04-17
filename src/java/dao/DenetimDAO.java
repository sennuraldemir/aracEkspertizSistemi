
package dao;

import entity.Denetim;
import entity.MemnuniyetRaporu;
import entity.odeme;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DenetimDAO extends DBConnection{
    
    private Connection db;

    public void create(Denetim c) {
        
        try {
            Statement st = this.connect().createStatement();

            String query = "insert into denetim (firma_adi, begenmedim,kismi_begendim, yeterli,begendim) values ('" + c.getFirma_adi()+ "','" + c.getBegenmedim() + "','" + c.getKismi_begendim()+ "','"+c.getYeterli()+"','"+c.getBegendim()+"')";
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
        

    public void update(Denetim c) {
        try {
            Statement st = this.connect().createStatement();
            String query="update memnuniyetRaporu set firma_adi='"+c.getFirma_adi()+ "', begenmedim = '" + c.getBegenmedim() + "', kismi_begendim = '" + c.getKismi_begendim() + "',yeterli='"+c.getYeterli()+"', begendim = '" + c.getBegendim() +  "' where odeme_id= "+c.getMemnuniyet_id();
            
            st.executeUpdate(query);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Denetim c) {
        try {
            Statement st = this.connect().createStatement();

            String query = "delete from memnuniyetRaporu where memnuniyet_id = " + c.getMemnuniyet_id();
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<odeme> getList() {
        List<odeme> list = new ArrayList<>();

        try {
            Statement st = this.connect().createStatement();
            String query ="select * from denetim";
        
       
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) { 
                list.add(new denetim(rs.getInt("denetim_id"),rs.getInt("firmasicil_no"),rs.getInt("denetim_tarihi"),rs.getString("denetim_bulgu",rs.getInt("puan_sonucu"))));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

   

}

    

