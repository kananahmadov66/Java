class Laptop extends SmartDevice
{
    public Laptop(String brand, String name)
    {
        super(brand, name);
    }

    void runSoftware(String software)
    {
        System.out.println("Running " + software + " on " + brand + " " + model);
    }

    void connectToBluetooth()
    {
        System.out.println(brand + " " + model + " is connecting to Bluetooth...");
    }

    @Override
    void connectToWifi()
    {
        System.out.println(brand + " " + model + " is connecting to Wifi...");
    }
}