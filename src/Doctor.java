public class Doctor {
    int doctorId;
    String doctorName;
    int doctorMobile;
    String doctorEmail;
    String doctorAddress;
    String doctorPassword;
    String doctorUsername;

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

}