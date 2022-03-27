public class Patient {
    int patientId;
    String patientName;
    int patientMobile;
    String patientAddress;
    String patientEmail;
    String patientPassword;
    String patientUsername;

    public Patient(int patientId, String patientName, int patientMobile, String patientAddress, String patientEmail,
            String patientPassword, String patientUsername) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.patientAddress = patientAddress;
        this.patientEmail = patientEmail;
        this.patientPassword = patientPassword;
        this.patientUsername = patientUsername;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientMobile() {
        return patientMobile;
    }

    public void setPatientMobile(int patientMobile) {
        this.patientMobile = patientMobile;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientMobile=" + patientMobile +
                ", patientAddress='" + patientAddress + '\'' +
                ", patientEmail='" + patientEmail + '\'' +
                ", patientPassword='" + patientPassword + '\'' +
                ", patientUsername='" + patientUsername + '\'' +
                '}';
    }

}