package computer;

public class Ram {

    private String name;
    private int value;

    // default constructor
    public Ram() {
        this.name = "Huawei";
        this.value = 256;
    }

    public Ram(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getRamInformation() {
        return "RAM: " + this.name + "; value: " + this.value;
    }
}