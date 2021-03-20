import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    DBUtil db=new DBUtil();
    boolean findUser(String userName,String userPassword) throws SQLException {
        Connection conn=db.getConnection();
        PreparedStatement ps=null;
        try {
            String sql="select * from t_user where username=? and password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,userName);
            ps.setString(2,userPassword);
            if (ps.executeUpdate()==1)return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
