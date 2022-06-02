package dao;

import entity.Denetim;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class DenetimDAO extends DBConnection {

    public DenetimDAO() {
    }

    public List<Denetim> readList() {
        List<Denetim> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select*from denetim");
            while (rs.next()) {
                list.add(new Denetim(rs.getLong("id"), rs.getString("title"), rs.getDate("created"), rs.getDate("updated")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public List<Denetim> readList(int page) {
        int offset = (page - 1) * 5;
        List<Denetim> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
             ResultSet rs = st.executeQuery("select*from denetim id limit 5 offset " + offset);
            while (rs.next()) {
                list.add(new Denetim(rs.getLong("id"), rs.getString("title"), rs.getDate("created"), rs.getDate("updated")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void create(Denetim d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("insert into denetim(title) values ('" + d.getTitle() + "')");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Denetim d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("update denetim set title='" + d.getTitle() + "'where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Denetim d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("delete from denetim where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
