class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        UberX uberX = new UberX("XYZ789", new Account("Ernesto Cantillo", "EC1234"), "Susuki", "Swift");
        uberX.setPassenger(3);
        uberX.printDataCar();

        /*Car car = new Car("XYZ789", new Account("Ernesto Cantillo", "EC1234"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("ABC123", new Account("Jeff Bezos", "JB6789"));
        car2.passenger = 3;
        car2.printDataCar();*/
    }
}