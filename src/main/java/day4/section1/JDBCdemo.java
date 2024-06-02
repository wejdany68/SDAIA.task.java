package day4.section1;

import java.sql.*;


class JDBCDemo {
        public static void main(String[] args) {
            String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JAVA01\\src\\main\\java\\day4\\hr.db";
            String query="select*from jobs where job_id=5 ";

            try (Connection conn = DriverManager.getConnection(url);){
                Statement st= conn.createStatement();
                ResultSet rs= st.executeQuery(query);

                while (rs.next()){
                     jobs j=new jobs(rs);
                     System.out.println(j);
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

