class Smartwatch extends SmartDevice
{
    public Smartwatch(String brand, String model)
    {
        super(brand, model);
    }

    void trackSteps()
    {
        System.out.println(brand + " " + model + " is tracking steps. ");
    }

    void showTime()
    {
        System.out.println(brand + " " + model + " shows the time.");
    }

    @Override
    void connectToWifi()
    {
        System.out.println(brand + " " + model + " is connecting to Wifi...");
    }
}