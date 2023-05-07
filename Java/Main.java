class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Car car = new Car();
        car.license = "XYZ789";
        car.driver = "Ernesto Cantillo";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "ABC123";
        car2.driver = "Jeff Bezos";
        car2.passenger = 3;
        car2.printDataCar();
    }
}