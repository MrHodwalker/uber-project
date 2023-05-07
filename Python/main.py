from car import Car

if __name__ == "__main__":
    print("Hello World")

    car = Car()
    car.license = "XYZ789"
    car.driver = "Ernesto Cantillo"
    print(vars(car))

    car2 = Car()
    car2.license = "ABC123"
    car2.driver = "Jeff Bezos"
    print(vars(car2))