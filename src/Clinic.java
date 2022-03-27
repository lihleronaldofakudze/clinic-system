import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Clinic extends DatabaseMethods {
    int clinicId;
    int clinicDoctorId;
    String clinicType;
    String clinicDescription;
    String clinicName;
    String clinicPlace;
    String clinicAddress;
    Connection connection = DatabaseConnection.getConnection();

    public Clinic() {
    }

    public Clinic(int clinicId, int clinicDoctorId, String clinicType, String clinicDescription, String clinicName,
            String clinicPlace, String clinicAddress) {
        this.clinicId = clinicId;
        this.clinicDoctorId = clinicDoctorId;
        this.clinicType = clinicType;
        this.clinicDescription = clinicDescription;
        this.clinicName = clinicName;
        this.clinicPlace = clinicPlace;
        this.clinicAddress = clinicAddress;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public int getClinicDoctorId() {
        return clinicDoctorId;
    }

    public void setClinicDoctorId(int clinicDoctorId) {
        this.clinicDoctorId = clinicDoctorId;
    }

    public String getClinicType() {
        return clinicType;
    }

    public void setClinicType(String clinicType) {
        this.clinicType = clinicType;
    }

    public String getClinicDescription() {
        return clinicDescription;
    }

    public void setClinicDescription(String clinicDescription) {
        this.clinicDescription = clinicDescription;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicPlace() {
        return clinicPlace;
    }

    public void setClinicPlace(String clinicPlace) {
        this.clinicPlace = clinicPlace;
    }

    public String getClinicAddress() {
        return clinicAddress;
    }

    public void setClinicAddress(String clinicAddress) {
        this.clinicAddress = clinicAddress;
    }

    @Override
    public void add() {
        String sql = "INSERT INTO clinic (clinic_doctor_id, clinic_type, clinic_description, clinic_name, clinic_place, clinic_address) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, clinicDoctorId);
            preparedStatement.setString(2, clinicType);
            preparedStatement.setString(3, clinicDescription);
            preparedStatement.setString(4, clinicName);
            preparedStatement.setString(5, clinicPlace);
            preparedStatement.setString(6, clinicAddress);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        String sql = "UPDATE clinic SET clinic_doctor_id = ?, clinic_type = ?, clinic_description = ?, clinic_name = ?, clinic_place = ?, clinic_address = ? WHERE clinic_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, clinicDoctorId);
            preparedStatement.setString(2, clinicType);
            preparedStatement.setString(3, clinicDescription);
            preparedStatement.setString(4, clinicName);
            preparedStatement.setString(5, clinicPlace);
            preparedStatement.setString(6, clinicAddress);
            preparedStatement.setInt(7, clinicId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        String sql = "DELETE FROM clinic WHERE clinic_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, clinicId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {

    }

}
