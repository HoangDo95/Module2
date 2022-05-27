package ss16_01_io_file.hoc_them.ghi_du_lieu_vao_file;

public class Student {
    private String name;
    private String address;
    private String gender;

    public Student() {
    }

    public Student(String name, String address, String gender) {
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Học sinh có tên: " + name +
                "---Địa chỉ: " + address +
                "---Giới tính: " + gender;
    }
}
