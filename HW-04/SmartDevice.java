abstract class SmartDevice
{
    String brand;
    String model;

    public SmartDevice(String brand, String model)
    {
        this.brand =brand;
        this.model =model;
    }

    void turnOn()
    {
        System.out.println(brand + " " + model + " is turning on.");
    }

    void turnOff()
    {
        System.out.println(brand + " " + model + " is turning off.");
    }

    abstract void connectToWifi();
}