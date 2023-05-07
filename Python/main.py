from car import Car
from account import Account

if __name__ == "__main__":
    print("Hello World")

    car = Car("XYZ789", Account("Ernesto Cantillo", "EC1234"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("ABC123", Account("Jeff Bezos", "JB6789"))
    print(vars(car2))
    print(vars(car2.driver))