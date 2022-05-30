package dao;

import entity.randevu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class randevuDAO extends DBConnection {

    private Connection db;

    public void create(randevu c) {

        try {
            Statement st = this.getConnection().createStatement();
            String query = ("insert into randevu (plaka_id, adi,soyadi) values ('" + c.getPlaka_id() + "','" + c.getAdi() + "','" + c.getSoyadi() + "')");
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update(randevu c) {
        try {
            Statement st = this.getConnection().createStatement();
             String query = ("update randevu set plaka_id='" + c.getPlaka_id() + "',adi='" + c.getAdi()+ "',soyadi='" + c.getSoyadi()+ "'where randevu_id=" + c.getRandevu_id());

            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(randevu c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from randevu where randevu_id=" + c.getRandevu_id();
            st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public List<randevu> getList() {
        List<randevu> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
            String query = "select * from randevu";

//            String query = "insert into category (title, created) values ('Telefon','" + (new Timestamp(System.currentTimeMillis())) + "')";
//            int r = st.executeUpdate(query);
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) { //next-> true veya da false yapar bin sonraki nesnenin varlığına bakar
                list.add(new randevu(rs.getInt("randevu_id"), rs.getString("plaka_id"), rs.getDate("tarih"), rs.getString("adi"), rs.getString("soyadi")));
            }//burası ekrana yazdırma işlemi yapmıyor. Çağırana istediği bilgiyi dönüş yapıyor

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

}
