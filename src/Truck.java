public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void CheckTrailer() {
        System.out.println("Проверка грузовика");
    }

    public void service() {
        super.service();
        CheckTrailer();
    }


}
