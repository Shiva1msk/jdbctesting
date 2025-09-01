package jdbctesting;

import java.sql.*;
import java.util.Scanner;

public class DemoTest {
	public static void main(String args[]) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded sucessfully");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/msk12","root","shivasu1@#");
			System.out.println("connected  successfully");
			Statement stmt=con.createStatement();
			System.out.println("statement is ready");
//             int result=stmt.executeUpdate("insert into product values(201,'keychain',100)");
//             if(result>0) {
//     			System.out.println("record inserted sucessfully");
//
//             }
//			int result=stmt.executeUpdate("update product set price=670 where pid=200");
//          if(result>0) {
//  			System.out.println("record updated sucessfully");
//
//          }else {
//    			System.out.println("record not found");
//
//          }
//			
//ResultSet rs=stmt.executeQuery("select * from product");
//while(rs.next()) {
//	System.out.println("pid is "+rs.getInt(1)+" pname "+rs.getNString(2)+" price "+rs.getFloat(3));
//}
//             stmt.close();
//             con.close();
//			Scanner sc=new Scanner(System.in);
//			PreparedStatement psmt=con.prepareStatement("insert into product values(?,?,?)");
//			System.out.println("enter product pid");
//			int pid=sc.nextInt();
//			psmt.setInt(1,pid);
//			System.out.println("enter product name");
//			String pname=sc.next();
//			psmt.setString(2,pname);
//
//			System.out.println("enter product price");
//			float price=sc.nextFloat();
//			psmt.setFloat(3,price);
//			int result=psmt.executeUpdate();
//			if(result>0) {
//				System.out.println("record inserted successfully");
//
//			}else {
//				System.out.println("record not  inserted ");
//
//			}
//			Scanner sc=new Scanner(System.in);
//			PreparedStatement psmt=con.prepareStatement("delete from product where pid=?");
//			System.out.println("enter product pid");
//			int pid=sc.nextInt();
//			psmt.setInt(1,pid);
//			
//			int result=psmt.executeUpdate();
//			if(result>0) {
//				System.out.println("record deleted successfully");
//
//			}else {
//				System.out.println("record not  inserted ");
//
//			}
//			Scanner sc=new Scanner(System.in);
//			PreparedStatement psmt=con.prepareStatement("update product set price=? where pid=?");
//			System.out.println("enter product pid");
//			int pid=sc.nextInt();
//			psmt.setInt(2,pid);
//			
//			System.out.println("enter product's new price");
//			float price=sc.nextFloat();
//			psmt.setFloat(1,price);
//			int result=psmt.executeUpdate();
//			if(result>0) {
//				System.out.println("record updated successfully");
//
//			}else {
//				System.out.println("record not  found");
//
//			}
			Scanner sc=new Scanner(System.in);
			PreparedStatement psmt=con.prepareStatement("select * from product where price >?");
//			System.out.println("enter product pid");
//			int pid=sc.nextInt();
//			psmt.setInt(2,pid);
			
			System.out.println("enter product's price");
			float price=sc.nextFloat();
			psmt.setFloat(1,price);
//			int result=psmt.executeUpdate();
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				System.out.println("pid is "+rs.getInt(1)+" pname "+rs.getNString(2)+" price "+rs.getFloat(3));

			}
//			if(result>0) {
//				System.out.println("record updated successfully");
//
//			}else {
//				System.out.println("record not  found");
//
//			}
			psmt.close();

sc.close();

		}catch(Exception e) {
			System.err.println(e);
			
		}
	}

}
