package task_1;

public class Store {

    private Integer number;
    private String city;
    private String address;
    private String phoneNumber;

    public Store(Integer number, String city, String address, String phoneNumber) {
        this.number = number;
        this.city = city;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Store{" +
                "number=" + number +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
