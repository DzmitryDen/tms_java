package computer;

public class Hdd {

    private String name;
    private int value;
    private String type;

    // default constructor
    public Hdd() {
        this.name = "Samsung";
        this.value = 500;
        this.type = "internal";
    }

    public Hdd(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public String getHddInformation() {
        return "HDD: " + this.name + "; value: " + this.value + "; type: " + this.type;
    }
}