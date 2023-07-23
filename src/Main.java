public class Main {
    public static void main(String[] args) {
        Car fiat = new Car("fiat", 1);
        Car volvo = new Car("volvo", 1);
        fiat.checkEngine();

        Truck mercedes = new Truck("mercedes ", 1);
        Bicycle bmw = new Bicycle(" Bmw ", 1);


        mercedes.CheckTrailer();
        bmw.getWheelsCount();
        ServiceStationImpl serviceStation = new ServiceStationImpl();
        serviceStation.check(fiat);
        serviceStation.check(mercedes);
        serviceStation.check(bmw);


    }
}