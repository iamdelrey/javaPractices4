package pr6.Builder;

public class ClassicCarBuilder implements CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public ClassicCarBuilder() {
        super();
    }

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Собираю шасси классической модели");
        this.chassis = "Классическое шасси";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Собираю кузов классической модели");
        this.body = "Классический кузов";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Окрашиваю кузов классической модели");
        this.paint = "Классический белый окрас";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Создаю интерьер классической модели");
        this.interior = "Классический интерьер";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Сборка машины еще не завершена.");
        }
        return null;
    }

}