import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Nurse extends DatabaseMethods {
    int nurseId;
    String nurseName;
    int nurseMobile;
    String nurseEmail;
    String nurseAddress;
    String nursePassword;
    String nurseUsername;
    Connection connection = DatabaseConnection.getConnection();
    Scanner scanner = new Scanner(System.in);

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
        System.out.println("Enter the following details to add a new nurse");
        System.out.print("Enter the nurse name: ");
        nurseName = scanner.nextLine();

        System.out.print("Enter the nurse mobile: ");
        nurseMobile = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the nurse email: ");
        nurseEmail = scanner.nextLine();

        System.out.print("Enter the nurse address: ");
        nurseAddress = scanner.nextLine();

        System.out.print("Enter the nurse password: ");
        nursePassword = scanner.nextLine();

        System.out.print("Enter the nurse username: ");
        nurseUsername = scanner.nextLine();

        String sql = "INSERT INTO nurse(nurse_name, nurse_mobile, nurse_email, nurse_address, nurse_password, nurse_username) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nurseName);
            preparedStatement.setInt(2, nurseMobile);
            preparedStatement.setString(3, nurseEmail);
            preparedStatement.setString(4, nurseAddress);
            preparedStatement.setString(5, nursePassword);
            preparedStatement.setString(6, nurseUsername);
            preparedStatement.executeUpdate();
            System.out.println("Nurse added successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        System.out.println("Enter the following details to update a nurse");
        System.out.print("Enter the nurse id: ");
        nurseId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the nurse name: ");
        nurseName = scanner.nextLine();

        System.out.print("Enter the nurse mobile: ");
        nurseMobile = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the nurse email: ");
        nurseEmail = scanner.nextLine();

        System.out.print("Enter the nurse address: ");
        nurseAddress = scanner.nextLine();

        System.out.print("Enter the nurse password: ");
        nursePassword = scanner.nextLine();

        System.out.print("Enter the nurse username: ");
        nurseUsername = scanner.nextLine();

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
            System.out.println("Nurse updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter the following details to delete a nurse");
        System.out.print("Enter the nurse id: ");
        nurseId = Integer.parseInt(scanner.nextLine());

        String sql = "DELETE FROM nurse WHERE nurse_id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, nurseId);
            preparedStatement.executeUpdate();
            System.out.println("Nurse deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        String sql = "SELECT * FROM nurse";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Nurse Id: " + resultSet.getInt("nurse_id"));
                System.out.println("Nurse Name: " + resultSet.getString("nurse_name"));
                System.out.println("Nurse Mobile: " + resultSet.getInt("nurse_mobile"));
                System.out.println("Nurse Email: " + resultSet.getString("nurse_email"));
                System.out.println("Nurse Address: " + resultSet.getString("nurse_address"));
                System.out.println("Nurse Password: " + resultSet.getString("nurse_password"));
                System.out.println("Nurse Username: " + resultSet.getString("nurse_username"));
                System.out.println("-------------------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}