package dao;

import entity.MemnuniyetRaporu;
import entity.odeme;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemnuniyetRaporuDAO extends DBConnection {

    private Connection db;

    public void create(MemnuniyetRaporu c) {

        try {
            Statement st = this.connect().createStatement();

            String query = "insert into memnuniyetRaporu (firma_adi, begenmedim,kismi_begendim, yeterli,begendim) values ('" + c.getFirma_adi() + "','" + c.getBegenmedim() + "','" + c.getKismi_begendim() + "','" + c.getYeterli() + "','" + c.getBegendim() + "')";
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(MemnuniyetRaporu c) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update memnuniyetRaporu set firma_adi='" + c.getFirma_adi() + "', begenmedim = '" + c.getBegenmedim() + "', kismi_begendim = '" + c.getKismi_begendim() + "',yeterli='" + c.getYeterli() + "', begendim = '" + c.getBegendim() + "' where odeme_id= " + c.getMemnuniyet_id();

            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(MemnuniyetRaporu c) {
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
            String query = "select * from menuniyetRaporu";

            int r = st.executeUpdate(query);

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new MemnuniyetRaporu(rs.getInt("memnuniyet_id"), rs.getString("firma_adi"), rs.getString("begenmedim"), rs.getString("kismi_begendim"), rs.getString("yeterli"), rs.getString("begendim")));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

}
