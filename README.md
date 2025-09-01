# jdbctesting

manual testing of jdbc using external mysql jar file

the projet about joining java code with sql using jdbc in manual way

there are five steps there to connect java with sql using jdbc :

1, import packages : import java.sql.*;

2,use try catch block for exception handling of sql exception

3,load driver sql driver :class.forName("com.mysql.cj.jdbc.Driver");

then load or add the external mysql jar file in eclipse by right clicking on the project the go to properties section, then click on bild tools the click on libraries 

section and then add external jar file and at last click on apply and close button;

use connection interfce to connect to database using mysql credentials 

Connection con=DriverManager.getConnection("jdbc:sql://localhost:3306/database_name",user_name,password);

4,statements:we can perform DML(insert,delete,updated) and reterive operations using statemsnts

there are 3 types of statements i)statement:whih is static statement

                                 Statement stmt=con.CreateStatement();
                                 
                                 there are two methods a)execute update:for DML int result =sm.executeUpdate("inset into table_name values()");
                                 
                                                                                 int result =sm.executeUpdate("update table_name set condition where condition");
                                                                                 
                                                                                int result =sm.executeUpdate("delete from table_name where condition");
                                                                                
                                                        b)execute query: for retrieval  ResultSet rs=stmt.executeQuery("select * from Table_name");
                                                        
                                 
                                 
                                             
                                ii)prepared statement :which is also called as precompliled statement and it is a dynamic statement
                                
                                              iii)callabel statement
                      
