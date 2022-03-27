public class Clinic {
    int clinicId;
    int clinicDoctorId;
    String clinicType;
    String clinicDescription;
    String clinicName;
    String clinicPlace;
    String clinicAddress;

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
    public String toString() {
        return "Clinic{" +
                "clinicId=" + clinicId +
                ", clinicDoctorId=" + clinicDoctorId +
                ", clinicType='" + clinicType + '\'' +
                ", clinicDescription='" + clinicDescription + '\'' +
                ", clinicName='" + clinicName + '\'' +
                ", clinicPlace='" + clinicPlace + '\'' +
                ", clinicAddress='" + clinicAddress + '\'' +
                '}';
    }

}
