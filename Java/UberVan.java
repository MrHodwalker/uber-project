/* import java.util.ArrayList;
import java.util.Map; */

class UberVan extends Car {
    String brand;
    String model;

    /* Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial; */
    
    /* public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    } */

    public UberVan(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("You need at least 6 passengers seats available.");
        }
    }

    @Override
    void printDataCar() {
            super.printDataCar();
            System.out.println("Brand: " + brand + " | Model: " + model);
    }   
}
