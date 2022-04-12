import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Appointment extends DatabaseMethods {
    int appointmentId;
    int appointmentNumber;
    String appointmentType;
    String appointmentDescription;
    String appointmentDate;
    int appointmentDoctorId;
    Scanner scanner = new Scanner(System.in);

    public Appointment() {
    }

    public Appointment(int appointmentId, int appointmentNumber, String appointmentType, String appointmentDescription,
            String appointmentDate, int appointmentDoctorId) {
        this.appointmentId = appointmentId;
        this.appointmentNumber = appointmentNumber;
        this.appointmentType = appointmentType;
        this.appointmentDescription = appointmentDescription;
        this.appointmentDate = appointmentDate;
        this.appointmentDoctorId = appointmentDoctorId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public int getAppointmentDoctorId() {
        return appointmentDoctorId;
    }

    public void setAppointmentDoctorId(int appointmentDoctorId) {
        this.appointmentDoctorId = appointmentDoctorId;
    }

    @Override
    public void add() {
        System.out.println("Enter appointment number: ");
        appointmentNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter appointment type: ");
        appointmentType = scanner.nextLine();

        System.out.println("Enter appointment description: ");
        appointmentDescription = scanner.nextLine();

        System.out.println("Enter appointment date: ");
        appointmentDate = scanner.nextLine();

        System.out.println("Enter appointment doctor id: ");
        appointmentDoctorId = Integer.parseInt(scanner.nextLine());

        String query = "INSERT INTO appointment (appointment_number, appointment_type, appointment_description, appointment_date, appointment_doctor_id) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = DatabaseConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, appointmentNumber);
            preparedStatement.setString(2, appointmentType);
            preparedStatement.setString(3, appointmentDescription);
            preparedStatement.setString(4, appointmentDate);
            preparedStatement.setInt(5, appointmentDoctorId);
            preparedStatement.executeUpdate();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Appointment added successfully");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        System.out.println("Enter appointment number: ");
        appointmentNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter appointment type: ");
        appointmentType = scanner.nextLine();

        System.out.println("Enter appointment description: ");
        appointmentDescription = scanner.nextLine();

        System.out.println("Enter appointment date: ");
        appointmentDate = scanner.nextLine();

        System.out.println("Enter appointment doctor id: ");
        appointmentDoctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter appointment id: ");
        appointmentId = Integer.parseInt(scanner.nextLine());

        String query = "UPDATE appointment SET appointment_number = ?, appointment_type = ?, appointment_description = ?, appointment_date = ?, appointment_doctor_id = ? WHERE appointment_id = ?";
        try {
            PreparedStatement preparedStatement = DatabaseConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, appointmentNumber);
            preparedStatement.setString(2, appointmentType);
            preparedStatement.setString(3, appointmentDescription);
            preparedStatement.setString(4, appointmentDate);
            preparedStatement.setInt(5, appointmentDoctorId);
            preparedStatement.setInt(6, appointmentId);
            preparedStatement.executeUpdate();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Appointment updated successfully");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter appointment id: ");
        appointmentId = Integer.parseInt(scanner.nextLine());

        String query = "DELETE FROM appointment WHERE appointment_id = ?";
        try {
            PreparedStatement preparedStatement = DatabaseConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, appointmentId);
            preparedStatement.executeUpdate();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Appointment deleted successfully");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        String query = "SELECT * FROM appointment";
        try {
            PreparedStatement preparedStatement = DatabaseConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Appointment id: " + resultSet.getInt("appointment_id"));
                System.out.println("Appointment number: " + resultSet.getInt("appointment_number"));
                System.out.println("Appointment type: " + resultSet.getString("appointment_type"));
                System.out.println("Appointment description: " + resultSet.getString("appointment_description"));
                System.out.println("Appointment date: " + resultSet.getString("appointment_date"));
                System.out.println("Appointment doctor id: " + resultSet.getInt("appointment_doctor_id"));
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}