import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;

public class JDBC{
    private String localhost = "localhost:3306";
    private String dbname ="product_manager_database";
    private String name = "root";
    private String password ="l";
    private String URL = "jdbc:mysql://"+ localhost+"/"+dbname;

    public Connection connection(){
        Connection connection = null;
        try {
           connection = DriverManager.getConnection(URL,name,password);
            System.out.println("ket noi voi data base thanh cong");
        }catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
        return connection;
    }

    public static void main(String[] args) {
        JDBC jdbc = new JDBC();
        Connection connection = jdbc.connection();
//        String query = "insert into product(id,NameSP,price,detail,manufacturer,NumberSl,statusSP) " + "values (?,?,?,?,?,?,?)";
//        try{
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"D1011");
//            preparedStatement.setString(2,"Beer");
//            preparedStatement.setString(3,"10");
//            preparedStatement.setString(4, "nuoc uong");
//            preparedStatement.setString(5,"acoder");
//            preparedStatement.setString(6,"1222");
//            preparedStatement.setString(7,"0");
//            int row = preparedStatement.executeUpdate();
//            if (row != 0){
//                System.out.println("them thanh cong " + row);
//            }
//            connection.close();
//        }catch (SQLException e){
//            System.out.println(e.getErrorCode());
//        }

//        String query = "update product set detail = 'Du lieu moi' where id = ?";
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"D004");
//            int row = preparedStatement.executeUpdate();
//            if (row != 0){
//                System.out.println("thay doi du lieu thanh cong " + row);
//            }
//            connection.close();
//        }catch (SQLException e){
//            System.out.println(e.getErrorCode());
//
//        }
//        String query = "update product set manufacturer ='Apple' , price = '12000000' where id = ?";
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"D002");
//            int row = preparedStatement.executeUpdate();
//            if (row != 0){
//                System.out.println("thay doi du lieu thanh cong " + row);
//            }
//            connection.close();
//        }catch (SQLException e){
//            e.printStackTrace();
//
//        }
//        String query = "update product set numberSl ='20' , statusSP = '0' where id = ?";
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"D006");
//            int row = preparedStatement.executeUpdate();
//            if (row != 0){
//                System.out.println("thay doi du lieu thanh cong " + row);
//            }
//            connection.close();
//        }catch (SQLException e){
//            e.printStackTrace();
//
//        }
       String query = "Delete from product where id = ?";
       PreparedStatement preparedStatement = null;
       try {
           preparedStatement = connection.prepareStatement(query);
           preparedStatement.setString(1,"D1011");
           int row = preparedStatement.executeUpdate();
           if (row != 0){
               System.out.println("xoa thanh cong " + row);

           }else{
               System.out.println("khong tim thay phan tu can xoa");
           }
           connection.close();
       }catch (SQLException e){
        e.printStackTrace();
       }
//       String query = "select * from product";
//       Statement statement = null;
//
//       try {
//           statement = connection.createStatement();
//           ResultSet resultSet = statement.executeQuery(query);
//           while (resultSet.next()){
//               String value;
//           String ID = resultSet.getString("id");
//           String NameSP = resultSet.getString("NameSP");
//           int price = resultSet.getInt("price");
//           String detail = resultSet.getString("detail");
//           String manu = resultSet.getString("manufacturer");
//           int SL = resultSet.getInt("NumberSl");
//           boolean status = resultSet.getBoolean("statusSP");
//           System.out.println("ID" + " " + "NameSp" + " " + "price" + " " + "detail" + " " + "So Luong" + " " + "Status");
//           if (status){
//               value = "con hang";
//           }else{
//               value = "het hang";
//           }
//
//               System.out.println(ID + " " + NameSP + " " + price + " " + detail + " " + manu + " " + SL + " " + value );
//           }
//           connection.close();
//       }catch (SQLException e){
//       e.printStackTrace();
//       }
//        String query = "select * from product where id = 'D003'";
//        Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                String value;
//                String ID = resultSet.getString("id");
//                String NameSP = resultSet.getString("NameSP");
//                int price = resultSet.getInt("price");
//                String detail = resultSet.getString("detail");
//                String manu = resultSet.getString("manufacturer");
//                int SL = resultSet.getInt("NumberSl");
//                boolean status = resultSet.getBoolean("statusSP");
//                if (status){
//                    value = "con hang";
//                }else{
//                    value = "het hang";
//                }
//
//                System.out.println(ID + " " + NameSP + " " + price + " " + detail + " " + manu + " " + SL + " " + value );
//            }
//            connection.close();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        String query = "select * from product where id = 'D003' or id='D005'";
//        Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                String value;
//                String ID = resultSet.getString("id");
//                String NameSP = resultSet.getString("NameSP");
//                int price = resultSet.getInt("price");
//                String detail = resultSet.getString("detail");
//                String manu = resultSet.getString("manufacturer");
//                int SL = resultSet.getInt("NumberSl");
//                boolean status = resultSet.getBoolean("statusSP");
//                if (status){
//                    value = "con hang";
//                }else{
//                    value = "het hang";
//                }
//
//                System.out.println(ID + " " + NameSP + " " + price + " " + detail + " " + manu + " " + SL + " " + value );
//            }
//            connection.close();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        String query = "select * from product where statusSP = '0'";
//        Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                String value;
//                String ID = resultSet.getString("id");
//                String NameSP = resultSet.getString("NameSP");
//                int price = resultSet.getInt("price");
//                String detail = resultSet.getString("detail");
//                String manu = resultSet.getString("manufacturer");
//                int SL = resultSet.getInt("NumberSl");
//                boolean status = resultSet.getBoolean("statusSP");
//                System.out.println("ID" + " " + "NameSp" + " " + "price" + " " + "detail" + " " + "So Luong" + " " + "Status");
//                if (status){
//                    value = "con hang";
//                }else{
//                    value = "het hang";
//                }
//
//                System.out.println(ID + " " + NameSP + " " + price + " " + detail + " " + manu + " " + SL + " " + value );
//            }
//            connection.close();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        String query = "select * from product where statusSP = '1' and numberSl = '9'";
//        Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                String value;
//                String ID = resultSet.getString("id");
//                String NameSP = resultSet.getString("NameSP");
//                int price = resultSet.getInt("price");
//                String detail = resultSet.getString("detail");
//                String manu = resultSet.getString("manufacturer");
//                int SL = resultSet.getInt("NumberSl");
//                boolean status = resultSet.getBoolean("statusSP");
//                System.out.println("ID" + " " + "NameSp" + " " + "price" + " " + "detail" + " " + "So Luong" + " " + "Status");
//                if (status){
//                    value = "con hang";
//                }else{
//                    value = "het hang";
//                }
//
//                System.out.println(ID + " " + NameSP + " " + price + " " + detail + " " + manu + " " + SL + " " + value );
//            }
//            connection.close();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
    }
}