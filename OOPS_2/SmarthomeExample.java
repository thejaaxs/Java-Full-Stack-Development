// Smart Home System 🏠
// Problem Statement:
// Create a base class SmartDevice with:

// Attributes: deviceName
// Method turnOn() that prints "Turning on device...".
// Create subclasses:

// SmartLight with method adjustBrightness().
// SmartThermostat with method setTemperature().
// Demonstrate usage with multiple objects.

package OOPS_2;

class SmartDevice {
    String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void turnOn() {
        System.out.println("Turning on " + deviceName + " !");
    }
}

class SmartLight extends SmartDevice {
    public SmartLight(String deviceName) {
        super(deviceName);
    }

    public void adjustBrightness(int level) {
        System.out.println(deviceName + " adjust brightness " + level + " %");
    }
}

class SmartThermostat extends SmartDevice {
    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    public void setTemperature(int temperature) {
        System.out.println(deviceName + " adjust temperature to " + temperature + " C");
    }
}

public class SmarthomeExample {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Living Room Light");
        light.turnOn();
        light.adjustBrightness(50);
        SmartThermostat thermostat = new SmartThermostat("Bedroom Thermostat");
        thermostat.setTemperature(10);
        thermostat.turnOn();
    }
}
