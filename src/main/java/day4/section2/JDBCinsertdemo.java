package day4.section2;

import java.sql.*;
import java.util.Scanner;

public class JDBCinsertdemo {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JAVA01\\src\\main\\java\\day4\\section2\\hr.db";
            String query="insert into jobs values(?,?,?,?)";

            try (Connection conn = DriverManager.getConnection(url);){

                PreparedStatement st =conn.prepareStatement(query);
                System.out.println("Enter JOB ID: ");
                int jobId=sc.nextInt();
                st.setInt(1,jobId);

                sc.nextLine();

                System.out.println("Enter JOB Title:  ");
                String jobTitle=sc.nextLine();
                st.setString(2,jobTitle);

                System.out.println("Enter Min Salary");
                int jobSalary=sc.nextInt();
                st.setInt(3,jobSalary);

               System.out.println("Enter Max Salary: ");
               int jobXSalary=sc.nextInt();
               st.setInt(4,jobXSalary);

               int rows= st.executeUpdate();
               System.out.println(rows+"Inserted");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

