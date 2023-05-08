<?php
require_once('account.php');
class Car {

    public $id;
    public $license;
    public $driver;
    protected $passenger;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        echo "License: $this->license, Driver: {$this->driver->name}, Document: {$this->driver->document}"; 
    }

    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger() {
        if ($passenger == 4) {
            $this->passenger = $passenger;
        }
        else {
            echo "You need at least 4 passenger seats available.";
        }
    }
}
?>