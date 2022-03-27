public class Nurse {
    int nurseId;
    String nurseName;
    int nurseMobile;
    String nurseEmail;
    String nurseAddress;
    String nursePassword;
    String nurseUsername;

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
    public String toString() {
        return "Nurse{" +
                "nurseId=" + nurseId +
                ", nurseName='" + nurseName + '\'' +
                ", nurseMobile=" + nurseMobile +
                ", nurseEmail='" + nurseEmail + '\'' +
                ", nurseAddress='" + nurseAddress + '\'' +
                ", nursePassword='" + nursePassword + '\'' +
                ", nurseUsername='" + nurseUsername + '\'' +
                '}';
    }

}