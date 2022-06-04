package giai_de.benh_vien.model;

public abstract class Patient {
    private int medicalRecordNumber;
    private String MedicalRecordCode;
    private String name;
    private String dayIn;
    private String dayOut;
    private String reason;

    public Patient() {
    }

    public Patient(int medicalRecordNumber, String medicalRecordCode, String name, String dayIn, String dayOut, String reason) {
        this.medicalRecordNumber = medicalRecordNumber;
        MedicalRecordCode = medicalRecordCode;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.reason = reason;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getMedicalRecordCode() {
        return MedicalRecordCode;
    }

    public void setMedicalRecordCode(String medicalRecordCode) {
        MedicalRecordCode = medicalRecordCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Patient{" +
                "medicalRecordNumber='" + medicalRecordNumber + '\'' +
                ", MedicalRecordCode='" + MedicalRecordCode + '\'' +
                ", name='" + name + '\'' +
                ", dayIn='" + dayIn + '\'' +
                ", dayOut='" + dayOut + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
