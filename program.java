import java.awt.*;

// Доработать приложение, спроектированное на семинаре. Добавить тип, описывающий "автомойку", "сервисную станцию".
// Продемонстрировать работу получившейся программы, создать несколько типов автомобилей, загнать каждый автомобиль на заправку, а затем и на автомойку.



public class program {


    public static void main(String[] args) {
        SportCar sportCar = SportCar.create("A", "B", Color.BLACK, 3);
        RefuelingStation refuelingStation = new RefuelingStation();
        sportCar.setRefuelingStation(refuelingStation);
        sportCar.fuel();

    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500 * 6;
        }
        else {
            return 1000 * 4;
        }
    }

}
