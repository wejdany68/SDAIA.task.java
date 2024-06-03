package HW_day4;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {

    private static String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JAVA01\\src\\main\\java\\HW_day4\\hr.db";

    private static final String SELECT_ALL_Employee = "SELECT * FROM employees";
    private static final String SELECT_ONE_Employee = "SELECT * FROM employees WHERE id = ?";
    private static final String INSERT_Employee = "INSERT INTO employees (id, name, department) VALUES (?, ?, ?)";
    private static final String UPDATE_Employee = "UPDATE employees SET name = ?, department = ? WHERE id = ?";
    private static final String DELETE_Employee = "DELETE FROM employees WHERE id = ?";

    public void insertEmployee(Employee e) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement st = conn.prepareStatement(INSERT_Employee)) {
            st.setInt(1, e.getId());
            st.setString(2, e.getName());
            st.setString(3, e.getDepartment());
            st.executeUpdate();
        }
    }

    public void updateEmployee(Employee e) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement st = conn.prepareStatement(UPDATE_Employee)) {
            st.setString(1, e.getName());
            st.setString(2, e.getDepartment());
            st.setInt(3, e.getId());
            st.executeUpdate();
        }
    }

    public void deleteEmployee(int id) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement st = conn.prepareStatement(DELETE_Employee)) {
            st.setInt(1, id);
            st.executeUpdate();
        }
    }

    public Employee selectEmployee(int id) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement st = conn.prepareStatement(SELECT_ONE_Employee)) {
            st.setInt(1, id);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    return new Employee(rs);
                } else {
                    return null;
                }
            }
        }
    }

    public ArrayList<Employee> selectAllEmployees() throws SQLException {
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement st = conn.prepareStatement(SELECT_ALL_Employee);
             ResultSet rs = st.executeQuery()) {
            ArrayList<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                employees.add(new Employee(rs));
            }
            return employees;
        }
    }
}


