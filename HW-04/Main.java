public class Main
{
    public static void main(String[] args)
    {
        Smartphone phone = new Smartphone("Samsung", "S24 Ultra");
        phone.turnOn();
        phone.makeCall("0555555555");
        phone.installApp("Instagram");
        phone.connectToWifi();
        phone.turnOff();
        System.out.println("\n");


        Smartwatch watch = new Smartwatch("Samung", "Galaxy watch 7");
        watch.turnOn();
        watch.trackSteps();
        watch.showTime();
        watch.connectToWifi();
        watch.turnOff();
        System.out.println("\n");

        Laptop laptop = new Laptop("MSI", "Cyborg 15 A13V");
        laptop.turnOn();
        laptop.runSoftware("IntelliJ IDEA");
        laptop.connectToBluetooth();
        laptop.connectToWifi();
        laptop.turnOff();
        System.out.println("\n");
    }
}