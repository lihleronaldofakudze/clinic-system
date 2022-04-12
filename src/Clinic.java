import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Clinic extends DatabaseMethods {
    int clinicId;
    int clinicDoctorId;
    String clinicType;
    String clinicDescription;
    String clinicName;
    String clinicPlace;
    String clinicAddress;
    Connection connection = DatabaseConnection.getConnection();
    Scanner scanner = new Scanner(System.in);

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
        System.out.println("Enter clinic doctor id: ");
        clinicDoctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter clinic type: ");
        clinicType = scanner.nextLine();

        System.out.println("Enter clinic description: ");
        clinicDescription = scanner.nextLine();

        System.out.println("Enter clinic name: ");
        clinicName = scanner.nextLine();

        System.out.println("Enter clinic place: ");
        clinicPlace = scanner.nextLine();

        System.out.println("Enter clinic address: ");
        clinicAddress = scanner.nextLine();

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
        System.out.println("Enter clinic doctor id: ");
        clinicDoctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter clinic type: ");
        clinicType = scanner.nextLine();

        System.out.println("Enter clinic description: ");
        clinicDescription = scanner.nextLine();

        System.out.println("Enter clinic name: ");
        clinicName = scanner.nextLine();

        System.out.println("Enter clinic place: ");
        clinicPlace = scanner.nextLine();

        System.out.println("Enter clinic address: ");
        clinicAddress = scanner.nextLine();

        System.out.println("Enter clinic id: ");
        clinicId = Integer.parseInt(scanner.nextLine());

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
        System.out.println("Enter clinic id: ");
        clinicId = Integer.parseInt(scanner.nextLine());

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
        String sql = "SELECT * FROM clinic";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Clinic id: " + resultSet.getInt("clinic_id"));
                System.out.println("Clinic doctor id: " + resultSet.getInt("clinic_doctor_id"));
                System.out.println("Clinic type: " + resultSet.getString("clinic_type"));
                System.out.println("Clinic description: " + resultSet.getString("clinic_description"));
                System.out.println("Clinic name: " + resultSet.getString("clinic_name"));
                System.out.println("Clinic place: " + resultSet.getString("clinic_place"));
                System.out.println("Clinic address: " + resultSet.getString("clinic_address"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
