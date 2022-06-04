package giai_de.benh_vien.model;

public class Normal extends Patient {
    private int cost;

    public Normal() {
    }

    public Normal(int cost) {
        this.cost = cost;
    }

    public Normal(int medicalRecordNumber, String medicalRecordCode, String name, String dayIn, String dayOut, String reason, int cost) {
        super(medicalRecordNumber, medicalRecordCode, name, dayIn, dayOut, reason);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",super.getMedicalRecordNumber(),
                                                    super.getMedicalRecordCode(),
                                                    super.getName(),
                                                    super.getDayIn(),
                                                    super.getDayOut(),
                                                    super.getReason(), getCost());
    }

    @Override
    public String toString() {
        return "Normal{" + getInfo()+ '}';
    }
}
