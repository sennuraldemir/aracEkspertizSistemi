/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.AcikRaporlar;
import util.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sennur
 */
public class AcikRaporlarDAO extends DBConnection {

    public void create(AcikRaporlar a) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into acik_raporlar (plaka_id,isemriNo) values ('" + a.getPlaka_id() + "','" + a.getIsemriNo() + "')";

            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void update(AcikRaporlar a) {
        try {
             Statement st = this.getConnection().createStatement();
            String query = "update acik_raporlar set isemriNo= " + a.getIsemriNo() + " where plaka_id='" + a.getPlaka_id() + "'";
            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(AcikRaporlar a) {
        try {
             Statement st = this.getConnection().createStatement();
            String query = "delete from acik_raporlar where plaka_id=  '" + a.getPlaka_id() +"'";

            st.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public List<AcikRaporlar> getList() {
        List<AcikRaporlar> list = new ArrayList<>();
        try {
             Statement st = this.getConnection().createStatement();
            String query = "select * from acik_raporlar";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                list.add(new AcikRaporlar(rs.getString("plaka_id"), rs.getInt("isemriNo")));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;

    }

}
