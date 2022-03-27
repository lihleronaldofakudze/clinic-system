import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Nurse extends DatabaseMethods {
    int nurseId;
    String nurseName;
    int nurseMobile;
    String nurseEmail;
    String nurseAddress;
    String nursePassword;
    String nurseUsername;
    Connection connection = DatabaseConnection.getConnection();

    public Nurse() {
    }

    public Nurse(int nurseId, String nurseName, int nurseMobile, String nurseEmail, String nurseAddress,
            String nursePassword, String nurseUsername) {
        this.nurseId = nurseId;
        this.nurseName = nurseName;
        this.nurseMobile = nurseMobile;
        this.nurseEmail = nurseEmail;
        this.nurseAddress = nurseAddress;
        this.nursePassword = nursePassword;
        this.nurseUsername = nurseUsername;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public int getNurseMobile() {
        return nurseMobile;
    }

    public void setNurseMobile(int nurseMobile) {
        this.nurseMobile = nurseMobile;
    }

    public String getNurseEmail() {
        return nurseEmail;
    }

    public void setNurseEmail(String nurseEmail) {
        this.nurseEmail = nurseEmail;
    }

    public String getNurseAddress() {
        return nurseAddress;
    }

    public void setNurseAddress(String nurseAddress) {
        this.nurseAddress = nurseAddress;
    }

    public String getNursePassword() {
        return nursePassword;
    }

    public void setNursePassword(String nursePassword) {
        this.nursePassword = nursePassword;
    }

    public String getNurseUsername() {
        return nurseUsername;
    }

    public void setNurseUsername(String nurseUsername) {
        this.nurseUsername = nurseUsername;
    }

    @Override
    public void add() {
        String sql = "INSERT INTO nurse(nurse_id, nurse_name, nurse_mobile, nurse_email, nurse_address, nurse_password, nurse_username) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, nurseId);
            preparedStatement.setString(2, nurseName);
            preparedStatement.setInt(3, nurseMobile);
            preparedStatement.setString(4, nurseEmail);
            preparedStatement.setString(5, nurseAddress);
            preparedStatement.setString(6, nursePassword);
            preparedStatement.setString(7, nurseUsername);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        String sql = "UPDATE nurse SET nurse_name=?, nurse_mobile=?, nurse_email=?, nurse_address=?, nurse_password=?, nurse_username=? WHERE nurse_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nurseName);
            preparedStatement.setInt(2, nurseMobile);
            preparedStatement.setString(3, nurseEmail);
            preparedStatement.setString(4, nurseAddress);
            preparedStatement.setString(5, nursePassword);
            preparedStatement.setString(6, nurseUsername);
            preparedStatement.setInt(7, nurseId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        String sql = "DELETE FROM nurse WHERE nurse_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, nurseId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub

    }

}