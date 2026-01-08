package student;

import java.sql.*;
import java.util.Scanner;

public class StudentRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        String url = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Anu@2006"; // change if needed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO students (name, roll, dept) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, roll);
            ps.setString(3, dept);

            ps.executeUpdate();

            System.out.println("Student registered successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
