package javaModel.dao;

import com.alibaba.fastjson.JSON;
import javaModel.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javaModel.entity.JDBConn;
public class UserDaoImpl implements UserDao {
    @Override
    public boolean userLogin(User user) {
        System.out.println(user.getJob()+user.getEmail()+user.getSchool());
        return "安徽三联学院".equals(user.getSchool());
    }

    @Override
    public List<User> getAllUser() {
        List<User> users=new ArrayList<>();
        try {
            Statement statement=JDBConn.getStatement();
            ResultSet resultSet=statement.executeQuery("select * from application");
            while (resultSet.next()){
                String work=resultSet.getString(1);
                String record=resultSet.getString(2);
                String isMain=resultSet.getString(3);
                String email=resultSet.getString(4);
                String name=resultSet.getString(5);
                String nation=resultSet.getString(6);
                String birth=resultSet.getString(7);
                String school=resultSet.getString(8);
                String webside=resultSet.getString(9);
                String isN=resultSet.getString(10);
                String isM=resultSet.getString(11);
                String file=resultSet.getString(12);
                String zhengming=resultSet.getString(13);
                String yanzheng=resultSet.getString(14);
                String zhushi=resultSet.getString(15);
                String ageless=resultSet.getString(16);
                String isAllow=resultSet.getString(17);
                String agree=resultSet.getString(18);
                User user=new User(work,record,isMain,email,name,nation,birth,
                        school,webside,isN,isM,file,zhengming,yanzheng,zhushi,ageless,isAllow,
                        agree);
                user.setId(resultSet.getInt("id"));
                users.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  users;
    }

    @Override
    public void addUser(User user) {
        String sql="insert into application(job,record,isMain,email,name,nation,birth,school,webside,isN,isM,file,zhengming,yanzheng,zhushi,ageless,isAllow,agree)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement=JDBConn.getPreStatement(sql);
            statement.setString(1,user.getJob());
            statement.setString(2,user.getRecord());
            statement.setString(3,user.getIsMain());
            statement.setString(4,user.getEmail());
            statement.setString(5,user.getName());
            statement.setString(6,user.getNation());
            statement.setString(7,user.getBirth());
            statement.setString(8,user.getSchool());
            statement.setString(9,user.getWebside());
            statement.setString(10,user.getIsN());
            statement.setString(11,user.getIsM());
            statement.setString(12,user.getFile());
            statement.setString(13,user.getZhengming());
            statement.setString(14,user.getYanzheng());
            statement.setString(15,user.getZhushi());
            statement.setString(16,user.getAgeless());
            statement.setString(17,user.getIsAllow());
            statement.setString(18,user.getAgree());
            statement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void updateUser(String id, User user) {
        System.out.println(user.getRecord());
        String sql="update application set job=?,record=?,isMain=?,email=?," +
                "name=?,nation=?,birth=?,school=?,webside=?,isN=?," +
                "isM=?,file=?,zhengming=?,yanzheng=?,zhushi=?," +
                "ageless=?,isAllow=?,agree=? where id="+id;
        try {
            PreparedStatement statement=JDBConn.getPreStatement(sql);
            statement.setString(1,user.getJob());
            statement.setString(2,user.getRecord());
            statement.setString(3,user.getIsMain());
            statement.setString(4,user.getEmail());
            statement.setString(5,user.getName());
            statement.setString(6,user.getNation());
            statement.setString(7,user.getBirth());
            statement.setString(8,user.getSchool());
            statement.setString(9,user.getWebside());
            statement.setString(10,user.getIsN());
            statement.setString(11,user.getIsM());
            statement.setString(12,user.getFile());
            statement.setString(13,user.getZhengming());
            statement.setString(14,user.getYanzheng());
            statement.setString(15,user.getZhushi());
            statement.setString(16,user.getAgeless());
            statement.setString(17,user.getIsAllow());
            statement.setString(18,user.getAgree());
            statement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public User findUserById(String id) {
        try {
            Statement statement=JDBConn.getStatement();
            ResultSet resultSet=statement.executeQuery("select * from application where id="+id);
            while (resultSet.next()){
                String work=resultSet.getString(1);
                String record=resultSet.getString(2);
                String isMain=resultSet.getString(3);
                String email=resultSet.getString(4);
                String name=resultSet.getString(5);
                String nation=resultSet.getString(6);
                String birth=resultSet.getString(7);
                String school=resultSet.getString(8);
                String webside=resultSet.getString(9);
                String isN=resultSet.getString(10);
                String isM=resultSet.getString(11);
                String file=resultSet.getString(12);
                String zhengming=resultSet.getString(13);
                String yanzheng=resultSet.getString(14);
                String zhushi=resultSet.getString(15);
                String ageless=resultSet.getString(16);
                String isAllow=resultSet.getString(17);
                String agree=resultSet.getString(18);
                User user=new User(work,record,isMain,email,name,nation,birth,
                        school,webside,isN,isM,file,zhengming,yanzheng,zhushi,ageless,isAllow,
                        agree);
                user.setId(resultSet.getInt("id"));
                return user;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void delUser(String id) {
        try {
            Statement statement=JDBConn.getStatement();
            int resultSet=statement.executeUpdate("delete from application where id="+id);
            if(resultSet!=0){
                System.out.println("删除成功！！！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
