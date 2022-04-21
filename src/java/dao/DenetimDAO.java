package dao;

import entity.Denetim;
import entity.MemnuniyetRaporu;
import entity.odeme;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DenetimDAO extends DBConnection {

    private Connection db;

    public void create(Denetim c) {

        try {
            Statement st = this.connect().createStatement();

            String query = "insert into denetim (firmasicil_no, denetim_tarihi,denetimbulgu, puan_sonucu) values (" + c.getFirmasicil_no() + "," + c.getDenetim_tarihi()+ ",'" + c.getDenetim_bulgu()+ "'," + c.getPuan_sonucu()+ ")";
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(Denetim c) {
        try {
            Statement st = this.connect().createStatement();
            String query = "update denetim set firmasicil_no=" + c.getFirmasicil_no()+ ", denetim_tarihi = " + c.getDenetim_tarihi() + ", denetim_bulgu = '" + c.getDenetim_bulgu() + "',puan_sonucu=" + c.getPuan_sonucu()+ " where denetim_id= " + c.getDenetim_id();

            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(Denetim c) {
        try {
            Statement st = this.connect().createStatement();

            String query = "delete from denetim where denetim_id = " + c.getDenetim_id();
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<Denetim> getList() {
        List<Denetim> list = new ArrayList<>();

        try {
            Statement st = this.connect().createStatement();
            String query = "select * from denetim";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new denetim(rs.getInt("denetim_id"), rs.getInt("firmasicil_no"), rs.getInt("denetim_tarihi"), rs.getString("denetim_bulgu", rs.getInt("puan_sonucu"))));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

}
