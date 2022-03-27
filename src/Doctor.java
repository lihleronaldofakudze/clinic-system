import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Doctor extends DatabaseMethods {
    int doctorId;
    String doctorName;
    int doctorMobile;
    String doctorEmail;
    String doctorAddress;
    String doctorPassword;
    String doctorUsername;
    Connection connection = DatabaseConnection.getConnection();

    public Doctor(int doctorId, String doctorName, int doctorMobile, String doctorEmail, String doctorAddress,
            String doctorPassword, String doctorUsername) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorMobile = doctorMobile;
        this.doctorEmail = doctorEmail;
        this.doctorAddress = doctorAddress;
        this.doctorPassword = doctorPassword;
        this.doctorUsername = doctorUsername;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorMobile() {
        return doctorMobile;
    }

    public void setDoctorMobile(int doctorMobile) {
        this.doctorMobile = doctorMobile;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword;
    }

    public String getDoctorUsername() {
        return doctorUsername;
    }

    public void setDoctorUsername(String doctorUsername) {
        this.doctorUsername = doctorUsername;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorMobile=" + doctorMobile +
                ", doctorEmail='" + doctorEmail + '\'' +
                ", doctorAddress='" + doctorAddress + '\'' +
                ", doctorPassword='" + doctorPassword + '\'' +
                ", doctorUsername='" + doctorUsername + '\'' +
                '}';
    }

    @Override
    public void add() {
        String sql = "INSERT INTO doctor (doctor_name, doctor_mobile, doctor_email, doctor_address, doctor_password, doctor_username) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, doctorName);
            preparedStatement.setInt(2, doctorMobile);
            preparedStatement.setString(3, doctorEmail);
            preparedStatement.setString(4, doctorAddress);
            preparedStatement.setString(5, doctorPassword);
            preparedStatement.setString(6, doctorUsername);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        String sql = "UPDATE doctor SET doctor_name = ?, doctor_mobile = ?, doctor_email = ?, doctor_address = ?, doctor_password = ?, doctor_username = ? WHERE doctor_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, doctorName);
            preparedStatement.setInt(2, doctorMobile);
            preparedStatement.setString(3, doctorEmail);
            preparedStatement.setString(4, doctorAddress);
            preparedStatement.setString(5, doctorPassword);
            preparedStatement.setString(6, doctorUsername);
            preparedStatement.setInt(7, doctorId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        String sql = "DELETE FROM doctor WHERE doctor_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, doctorId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {

    }

}