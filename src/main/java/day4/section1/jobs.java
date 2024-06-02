package day4.section1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class jobs {
    private int job_id;
    private String job_title;
    private int min_salary;


    public jobs(ResultSet rs) throws SQLException
    {
       job_id = rs.getInt("job_id");
       job_title = rs.getString("job_title");
        min_salary = rs.getInt("min_salary");
    }

    public jobs(int job_id, String job_title, int min_salary) {
        this.job_id = job_id;
        this.job_title = job_title;
        this.min_salary = min_salary;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    public int getJob_id() {
        return job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public int getMin_salary() {
        return min_salary;
    }
    @Override
    public String toString(){
        return "job id: "+job_id+",title:" + job_title + ",salary: " + min_salary;
    }
}

