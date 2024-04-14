package computer;

public class Computer {

    private double price;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(double price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void getComputerInformation() {
        System.out.println("PC model: " + model + "; price: " + price);
        System.out.println(ram.getRamInformation());
        System.out.println(hdd.getHddInformation() + "\n");
    }
}
