package day4.section3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String Query="select*from jobs where min_salary>1700";
        try (Connection co =ConnPoolConfig.getConnection();){
            Statement st= co.createStatement();
            ResultSet rs= st.executeQuery(Query);

            while (rs.next()){
                jobsInsert2 j=new jobsInsert2(rs);
                System.out.println(j);

            }


        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

}
