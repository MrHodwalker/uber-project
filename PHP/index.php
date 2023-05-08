<?php
    require_once('car.php');
    require_once('uberX.php');
    require_once('uberPool.php');
    require_once('uberVan.php');
    require_once('account.php');

    $uberX = new UberX("XYZ789", new Account("Ernesto Cantillo", "EC1234"), "Mazda", "CX-30");
    $uberX->printDataCar();

    $uberVan = new uberVan("ABC1234", new Account("Jeff Bezos", "JB6789"), "Renaul", "Logan");
    $uberVan->setPassenger(6);
    $uberVan->printDataCar();

    /* $car = new Car("XYZ789", new Account("Ernesto Cantillo", "EC1234"));
    $car->printDataCar();

    $car2 = new Car("ABC123", new Account("Jeff Bezos", "JB6789"));
    $car2->printDataCar(); */