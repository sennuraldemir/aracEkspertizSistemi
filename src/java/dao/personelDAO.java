package dao;

import entity.personel;
import util.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class personelDAO extends DBConnection {


    public void create(personel c) {
        try {
            Statement st = this.getConnection().createStatement();

            String query = "insert into personel(adi, soyadi, yas, meslegi) values('" + c.getAdi() + "','" + c.getSoyadi() + "','" + c.getYas() + "','" + c.getMeslegi() + "')";
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void update(personel c) {
        try {
           Statement st = this.getConnection().createStatement();

            String query = "update personel set adi='" + c.getAdi() + "', soyadi='" + c.getSoyadi() + "', yas='" + c.getYas() + "', meslegi='" + c.getMeslegi() + "' where id=" + c.getPersonel_id();
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void delete(personel c) {
        try {
             Statement st = this.getConnection().createStatement();
            String query = "delete from personel where id" + c.getPersonel_id();
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    public List<personel> getList() {
        List<personel> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
            String query = "select * from personel";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new personel(rs.getInt("personel_id"), rs.getString("adi"), rs.getString("soyadi"), rs.getInt("yas"), rs.getString("meslegi")));
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
        return list;

    }

}
