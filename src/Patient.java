import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Patient extends DatabaseMethods {
    int patientId;
    String patientName;
    int patientMobile;
    String patientAddress;
    String patientEmail;
    String patientPassword;
    String patientUsername;
    Connection connection = DatabaseConnection.getConnection();

    public Patient() {
    }

    public Patient(int patientId, String patientName, int patientMobile, String patientAddress, String patientEmail,
            String patientPassword, String patientUsername) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.patientAddress = patientAddress;
        this.patientEmail = patientEmail;
        this.patientPassword = patientPassword;
        this.patientUsername = patientUsername;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(int patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    @Override
    public void add() {
        String sql = "INSERT INTO patient(patient_name, patient_mobile, patient_address, patient_email, patient_password, patient_username) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, patientName);
            preparedStatement.setInt(2, patientMobile);
            preparedStatement.setString(3, patientAddress);
            preparedStatement.setString(4, patientEmail);
            preparedStatement.setString(5, patientPassword);
            preparedStatement.setString(6, patientUsername);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        String sql = "UPDATE patient SET patient_name = ?, patient_mobile = ?, patient_address = ?, patient_email = ?, patient_password = ?, patient_username = ? WHERE patient_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, patientName);
            preparedStatement.setInt(2, patientMobile);
            preparedStatement.setString(3, patientAddress);
            preparedStatement.setString(4, patientEmail);
            preparedStatement.setString(5, patientPassword);
            preparedStatement.setString(6, patientUsername);
            preparedStatement.setInt(7, patientId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        String sql = "DELETE FROM patient WHERE patient_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, patientId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {

    }

}