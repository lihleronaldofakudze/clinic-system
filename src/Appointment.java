public class Appointment {
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
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", appointmentNumber=" + appointmentNumber +
                ", appointmentType='" + appointmentType + '\'' +
                ", appointmentDescription='" + appointmentDescription + '\'' +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", appointmentDoctorId=" + appointmentDoctorId +
                '}';
    }

}