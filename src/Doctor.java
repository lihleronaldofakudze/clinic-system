import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Doctor extends DatabaseMethods {
    int doctorId;
    String doctorName;
    int doctorMobile;
    String doctorEmail;
    String doctorAddress;
    String doctorPassword;
    String doctorUsername;
    Connection connection = DatabaseConnection.getConnection();
    Scanner scanner = new Scanner(System.in);

    public Doctor() {
    }

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
    public void add() {
        System.out.print("Enter Doctor Name: ");
        String doctorName = scanner.next();

        System.out.print("Enter Doctor Mobile: ");
        int doctorMobile = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Doctor Email: ");
        String doctorEmail = scanner.next();

        System.out.print("Enter Doctor Address: ");
        String doctorAddress = scanner.next();

        System.out.print("Enter Doctor Password: ");
        String doctorPassword = scanner.next();

        System.out.print("Enter Doctor Username: ");
        String doctorUsername = scanner.next();

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
            System.out.println("Inserted New Doctor Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        System.out.print("Enter Doctor Id: ");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Doctor Name: ");
        String doctorName = scanner.next();

        System.out.print("Enter Doctor Mobile: ");
        int doctorMobile = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Doctor Email: ");
        String doctorEmail = scanner.next();

        System.out.print("Enter Doctor Address: ");
        String doctorAddress = scanner.next();

        System.out.print("Enter Doctor Password: ");
        String doctorPassword = scanner.next();

        System.out.print("Enter Doctor Username: ");
        String doctorUsername = scanner.next();

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
        System.out.print("Enter Doctor Id: ");
        int doctorId = Integer.parseInt(scanner.nextLine());

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
        String sql = "SELECT * FROM doctor";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Doctor Id: " + resultSet.getInt("doctor_id"));
                System.out.println("Doctor Name: " + resultSet.getString("doctor_name"));
                System.out.println("Doctor Mobile: " + resultSet.getInt("doctor_mobile"));
                System.out.println("Doctor Email: " + resultSet.getString("doctor_email"));
                System.out.println("Doctor Address: " + resultSet.getString("doctor_address"));
                System.out.println("Doctor Password: " + resultSet.getString("doctor_password"));
                System.out.println("Doctor Username: " + resultSet.getString("doctor_username"));
                System.out.println("-------------------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}