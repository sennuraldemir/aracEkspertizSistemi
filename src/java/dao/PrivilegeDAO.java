package dao;

import entity.Privileges;
import entity.SystemGroup;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class PrivilegeDAO extends DBConnection {

    private GroupDAO gdao;

    public PrivilegeDAO() {
    }

    public List<Privileges> readList() {
        List<Privileges> list = new ArrayList<>();

        try {
            Statement st = this.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select*from privilege");
            while (rs.next()) {
                SystemGroup g=this.getGdao().getById(rs.getLong("sgroup"));
                list.add(new Privileges(rs.getLong("id"),g , rs.getString("mname"), rs.getBoolean("icreate"), rs.getBoolean("iread"), rs.getBoolean("iupdate"), rs.getBoolean("idelete"), rs.getBoolean("ilist"), rs.getBoolean("irshow")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void create(Privileges d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("insert into privilege(sgroup, mname, icreate, iread, iupdate, idelete, ilist, irshow) values ("+d.getPgroup().getId()+",'" + d.getMname() + "'," + d.isIcreate() + "," + d.isIread() + "," + d.isIupdate() + "," + d.isIdelete() + "," + d.isIlist() + "," + d.isIrshow() + ")");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Privileges d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("update privilege set mname='" + d.getMname() + "'where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Privileges d) {
        try {
            Statement st = this.getConnection().createStatement();
            st.executeUpdate("delete from privilege where id=" + d.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

     public GroupDAO getGdao() {
        if (this.gdao == null) {
            this.gdao = new GroupDAO();
        }
        return gdao;
    }

    public void setGdao(GroupDAO gdao) {
        this.gdao = gdao;
    }
}
