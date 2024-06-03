package day4.section3;


import java.sql.*;
import java.util.ArrayList;

public class jobQuery {


    private static String url="jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JAVA01\\src\\main\\java\\day4\\section3\\hr.db"
;

    private static final String SELECT_ALL_jobs = "select * from jobs";
    private static final String SELECT_ONE_jobs = "select * from jobs where job_id = ?";
    private static final String INSERT_jobs = "insert into jobs values (?, ?, ?,?)";
    private static final String UPDATE_jobs = "update jobs set job_id = ?, job_title = ? , min_salary =? , mxa_salary =?,where job_id = ?";
    private static final String DELETE_jobs = "delete from jobs where job_id = ?";


    public void insertjobs(jobsInsert2 j) throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        PreparedStatement st = conn.prepareStatement(INSERT_jobs);
        st.setInt(1, j.getJob_id());
        st.setString(2, j.getJob_title());
        st.setInt(3, j.getMin_salary());
        st.setInt(4, j.getMxa_salary());
        st.executeUpdate();
}

    public void updatejobs(jobsInsert2 j) throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        PreparedStatement st = conn.prepareStatement(UPDATE_jobs);
        st.setInt(1, j.getJob_id());
        st.setString(2, j.getJob_title());
        st.setInt(3, j.getMin_salary());
        st.setInt(4, j.getMxa_salary());
        st.executeUpdate();
    }

    public void updatejob(int jobId) throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        PreparedStatement st = conn.prepareStatement(DELETE_jobs);
        st.setInt(1, jobId);
        st.executeUpdate();
    }
    public jobsInsert2 selectjob(int jobId) throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_jobs);
        st.setInt(1, jobId);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new jobsInsert2(rs);
        }
        else {
            return null;
        }
    }
    public ArrayList<jobsInsert2> selectAllDepts() throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_jobs);
        ResultSet rs = st.executeQuery();
        ArrayList<jobsInsert2> jobss = new ArrayList<>();
        while (rs.next()) {
            jobss.add(new jobsInsert2(rs));
        }

        return jobss;
    }

}


