package giai_de.benh_vien.model;

public class Vip extends Patient{
    private String typeVip;
    private String periodVIP;

    public Vip(String typeVip, String periodVIP) {
        this.typeVip = typeVip;
        this.periodVIP = periodVIP;
    }

    public Vip(int medicalRecordNumber, String medicalRecordCode, String name, String dayIn, String dayOut, String reason, String typeVip, String periodVIP) {
        super(medicalRecordNumber, medicalRecordCode, name, dayIn, dayOut, reason);
        this.typeVip = typeVip;
        this.periodVIP = periodVIP;
    }

    public Vip() {
    }

    public String getTypeVip() {
        return typeVip;
    }

    public void setTypeVip(String typeVip) {
        this.typeVip = typeVip;
    }

    public String getPeriodVIP() {
        return periodVIP;
    }

    public void setPeriodVIP(String periodVIP) {
        this.periodVIP = periodVIP;
    }

    @Override
    public String toString() {
        return "Vip{" + getInfo()+ '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",super.getMedicalRecordNumber(),
                super.getMedicalRecordCode(),
                super.getName(),
                super.getDayIn(),
                super.getDayOut(),
                super.getReason(), getTypeVip(),getPeriodVIP());
    }
}
