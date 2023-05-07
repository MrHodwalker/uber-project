<?php
    require_once('car.php');
    require_once('account.php');

    $car = new Car("XYZ789", new Account("Ernesto Cantillo", "EC1234"));
    $car->printDataCar();

    $car2 = new Car("ABC123", new Account("Jeff Bezos", "JB6789"));
    $car2->printDataCar();