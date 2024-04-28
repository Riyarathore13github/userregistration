package com.isecure.DAO;
import com.isecure.DB.getConnection;
import com.isecure.DTO.UserDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
public class UserDAO {
    
    public UserDTO loginCheck(String name,String password){
        UserDTO user = new UserDTO();
        
        try{
            
            Connection con = getConnection.getConnect();
                        
	PreparedStatement ps = con.prepareStatement("select * from userdata where name=? and password=?");
        ps.setString(1, name);
        ps.setString(2, password);
          ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
           
            user.setName(rs.getString("name"));
            user.setId(1);
            user.setPassword(rs.getString("password"));
            
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    public int UserRegister(UserDTO user) {
		int i=0;
		try {
			Connection con = getConnection.getConnect();
                        
			PreparedStatement ps = con.prepareStatement("insert into userdata(name,address,email,mobile,date,gender,department,program,branch,admission,password) values(?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, user.getName());
                        ps.setString(2, user.getAddress());
                        ps.setString(3, user.getEmail());
                        ps.setString(4, user.getMobile());
                        ps.setString(5, user.getDate());
                        ps.setString(6, user.getGender());
                        ps.setString(7, user.getDepartment());
			ps.setString(8, user.getProgram());
                        ps.setString(9,user.getBranch());
                        ps.setString(10,user.getAdmission());
			ps.setString(11, user.getPassword());
			
			i = ps.executeUpdate();
                }
                catch(Exception e)
                {
			e.printStackTrace();
		}	
		return i;
	}
}







	