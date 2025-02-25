class Smartphone extends SmartDevice
{
    public Smartphone(String brand, String name)
    {
        super(brand, name);
    }

    void makeCall(String number)
    {
        System.out.println("Calling " + number + " from " + brand + " " + model);
    }

    void installApp(String appName)
    {
        System.out.println("Installing " + appName + " on " + brand + " " + model);
    }

    @Override
    void connectToWifi()
    {
        System.out.println(brand + " " + model + " is connecting to WiFi...");
    }
}