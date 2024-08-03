package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DBConnection;
import dto.MemberDto;

public class MemberModel {
    

     private static  Connection connection;
    
    public MemberModel()throws ClassNotFoundException, SQLException{
        MemberModel.connection=DBConnection.getInstance().getConnection();
    }
    
    public static String saveMember(String id,String name,String email,Integer phone)throws Exception{
        
        String sql="INSERT INTO member VALUES(?,?,?,?,?,?,?,?,?)";  
        
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1,id);
        statement.setString(2,name);
        statement.setString(3,email);
        statement.setInt(4,phone);
        
        return statement.executeUpdate()>0 ?"Success":"Fail";
        
    }

    public static MemberDto searchMember(String memberid) throws SQLException{
        String sql="SELECT * FROM member WHERE member_id=?";
       PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, memberid);

        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            MemberDto memberDto= new MemberDto(
                    rst.getString("MemberId"),
                    rst.getString("Name"),
                    rst.getString("Email"), 
                    rst.getInt("phone"));
            return memberDto;
        }
        return null;
    }
    
    
    public static String deleteMember(String memberid)throws Exception{
        String sql="DELETE FROM member WHERE member_id=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, memberid);
        
        return statement.executeUpdate()>0 ?"Success":"Fail";
    }
    
    public ArrayList<MemberDto> getAllCustomer() throws Exception{
        String sql="SELECT * FROM member";
        PreparedStatement statement=connection.prepareStatement(sql);
        ResultSet rst= statement.executeQuery();
        
        ArrayList<MemberDto> memberdtos=new ArrayList<>();
        
        while(rst.next()){
            MemberDto dto=new MemberDto(rst.getString("Memberid"),rst.getString("Name"),rst.getString("Email"),rst.getInt("phone") );
            memberdtos.add(dto);
        }
        return memberdtos;
    }
}