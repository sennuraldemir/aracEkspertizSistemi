
package dao;

import entity.odeme;
import util.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class odemeDAO extends DBConnection{
    
    

    public void create(odeme c) {
        
        try {
             Statement st = this.getConnection().createStatement();

            String query = "insert into odeme (sase_no, kredi_karti,nakit, havale) values ('" + c.getSase_no() + "','" + c.getKredi_karti() + "','" + c.getNakit() + "','" + c.getHavale() + "')";
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
        

    public void update(odeme c) {
        try {
             Statement st = this.getConnection().createStatement();
            String query="update odeme set sase_no='"+c.getSase_no()+ "', kredi_karti = '" + c.getKredi_karti() + "', nakit = '" + c.getNakit() + "', havale = '" + c.getHavale() +  "' where odeme_id= "+c.getOdeme_id();
            
            st.executeUpdate(query);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(odeme c) {
        try {
           Statement st = this.getConnection().createStatement();

            String query = "delete from odeme where odeme_id = " + c.getOdeme_id();
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<odeme> getList() {
        List<odeme> list = new ArrayList<>();

        try {
             Statement st = this.getConnection().createStatement();
            String query ="select * from odeme";
        

//            String query = "insert into category (title, created) values ('Telefon','" + (new Timestamp(System.currentTimeMillis())) + "')";
//            int r = st.executeUpdate(query);
          
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) { //next-> true veya da false yapar bin sonraki nesnenin varlığına bakar
                list.add(new odeme(rs.getInt("odeme_id"),rs.getString("sase_no"),rs.getString("havale"),rs.getString("Nakit"),rs.getString("kredi_karti")));
            }//burası ekrana yazdırma işlemi yapmıyor. Çağırana istediği bilgiyi dönüş yapıyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

 
}

    

