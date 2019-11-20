package WEEK10_MOREGUI.VehicleGUI;

public class Vehicle {
    private String name, make, model;
    private boolean electric;

    public Vehicle(String name, String make, String model, Boolean electric) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.electric = electric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public String toString(){
        String electricString = electric ? "Electric" : "Gasoline";
        //Example String: "Zeus: Tesla Model 3. Electric" or "Diana: Toyota Tacoma. Gasoline"
        return String.format("%s: %s %s. %s", name, make, model, electricString);
    }
}
