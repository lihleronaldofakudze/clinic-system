import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Appointment extends DatabaseMethods {
    int appointmentId;
    int appointmentNumber;
    String appointmentType;
    String appointmentDescription;
    String appointmentDate;
    int appointmentDoctorId;

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
        String query = "INSERT INTO appointment (appointment_number, appointment_type, appointment_description, appointment_date, appointment_doctor_id) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = DatabaseConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, appointmentNumber);
            preparedStatement.setString(2, appointmentType);
            preparedStatement.setString(3, appointmentDescription);
            preparedStatement.setString(4, appointmentDate);
            preparedStatement.setInt(5, appointmentDoctorId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        String query = "DELETE FROM appointment WHERE appointment_id = ?";
        try {
            PreparedStatement preparedStatement = DatabaseConnection.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, appointmentId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {

    }

}