package dao;

import entity.MemnuniyetRaporu;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class MemnuniyetRaporuDAO extends DBConnection {

    public MemnuniyetRaporuDAO() {
    }
    

    public void create(MemnuniyetRaporu m) {

        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into memnuniyet_raporu (memnuniyet_id,firma_adi, begenmedim, kismi_begendim,yeterli, begendim) values ('" + m.getMemnuniyet_id() + "','" + m.getFirma_adi() + "','" + m.getBegenmedim() + "','" + m.getKismi_begendim() + "','" + m.getYeterli() + "','" + m.getBegendim() + "')";
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(MemnuniyetRaporu m) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "update memnuniyet_raporu set firma_adi='" + m.getFirma_adi() + "', begenmedim = '" + m.getBegenmedim() + "', kismi_begendim = '" + m.getKismi_begendim() + "',yeterli='" + m.getYeterli() + "', begendim = '" + m.getBegendim() + "' where odeme_id= " + m.getMemnuniyet_id() + "'";

            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(MemnuniyetRaporu m) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from memnuniyet_raporu where memnuniyet_id = " + m.getMemnuniyet_id();
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<MemnuniyetRaporu> readList() {
        List<MemnuniyetRaporu> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from memnuniyet_raporu");

            while (rs.next()) {
                list.add(new MemnuniyetRaporu(rs.getInt("memnuniyet_id"), rs.getString("firma_adi"), rs.getString("begenmedim"), rs.getString("kismi_begendim"), rs.getString("yeterli"), rs.getString("begendim")));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
     public List<MemnuniyetRaporu> readList(int page) {
        int offset = (page - 1) * 5;
        List<MemnuniyetRaporu> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
             ResultSet rs = st.executeQuery("select*from memnuniyet_raporu memnuniyet_id limit 5 offset " + offset);
            while (rs.next()) {
                  list.add(new MemnuniyetRaporu(rs.getInt("memnuniyet_id"), rs.getString("firma_adi"), rs.getString("begenmedim"), rs.getString("kismi_begendim"), rs.getString("yeterli"), rs.getString("begendim")));
           
                }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}
