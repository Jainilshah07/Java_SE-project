/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_teacher_management.jdbc_connection;

import java.sql.*;
/**
 *
 * @author Devashish Bhake
 */
public class conn {
    public Connection c;
    public Statement s;
    public conn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "devraj.b123";
            String url = "jdbc:mysql://localhost:3306/student_manage?useSSL = false";
            c = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
    
}
