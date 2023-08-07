import com.sun.source.doctree.SeeTree;

import java.io.IOException;
import java.sql.*;

public class JDBCconnect{
private String localhost = "localhost:3306";
private String dbname = "QLBH";
private String username = "root";
private String password = "l";
private String ConnectURL = "jdbc:mysql://"+ localhost+"/"+dbname;
public Connection Connect(){
    Connection connection = null;
    try{
        connection = DriverManager.getConnection(ConnectURL,username,password);
        System.out.println("ket noi thanh cong ");
    }catch (SQLException w){
        w.printStackTrace();
    }
    return connection;
}

    public static void main(String[] args) {
        JDBCconnect jdbCconnect = new JDBCconnect();
        Connection connection = jdbCconnect.Connect();
        String querry = "select * from Khach_Hang";
//        Statement statement = null;
//        try{
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(querry);
//            while (resultSet.next()){
//                String MaKH = resultSet.getString("Ma_KH");
//                String HoTenKH = resultSet.getString("Ho_Ten_KH");
//                String DiaChi = resultSet.getString("Dia_Chi");
//                String DienThoai = resultSet.getString("Dien_Thoai");
//                System.out.println(MaKH + " " + HoTenKH + " " + DiaChi + " " + DienThoai);
//            }
//            connection.close();
//        }catch (SQLException e){
//            System.out.println(e.getErrorCode());
//        }
//        String query = "insert into Khach_Hang (Ma_KH,Ho_Ten_KH,Dia_Chi,Dien_Thoai) " + "VALUES (?,?,?,?)";
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"D001");
//            preparedStatement.setString(2,"Nguyen Van A");
//            preparedStatement.setString(3,"10 Lý thường Kiệt");
//            preparedStatement.setString(4,"8554545");
//            int row = preparedStatement.executeUpdate();
//            if (row != 0){
//                System.out.println("them thanh cong " + row);
//            }
//            connection.close();
//        }catch (SQLException e){
//            System.out.println(e.getErrorCode());
//        }
   String query = "Update Khach_Hang set Dien_Thoai ='D001' where Dia_Chi = ?";
   PreparedStatement preparedStatement = null;
   try{
       preparedStatement = connection.prepareStatement(query);
       preparedStatement.setString(1,"123 Trần Phú");
       int row = preparedStatement.executeUpdate();
       if (row != 0){
           System.out.println("thay doi du lieu thanh cong " + row);
       }
       connection.close();
   }catch (SQLException e){
       e.printStackTrace();
   }
    }

}