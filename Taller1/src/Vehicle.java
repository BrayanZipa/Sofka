public class Vehicle {
    public String type;
    public boolean state;
    public String brand;
    public String model;

    public Vehicle(String type, boolean state, String brand, String model) {
        this.type = type;
        this.state = state;
        this.brand = brand;
        this.model = model;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    

}
