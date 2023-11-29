// Доработать приложение, спроектированное на семинаре. Добавить тип, описывающий "автомойку", "сервисную станцию".
// Продемонстрировать работу получившейся программы, создать несколько типов автомобилей, загнать каждый автомобиль на заправку, а затем и на автомойку.

public class program {

    public static void main(String[] args) {
        // Создаем новые машины, катаем их, завозим на мойки и заправки

        SportCar sportCar1 = SportCar.create("A", "Ferrari", "red", 4, FuelType.Gasoline);
        CarWashService carWashService = new CarWashService();
        ServiceStation serviceStation = new ServiceStation();

        sportCar1.movement(100);
        System.out.println();
        carWashService.BodyWash(sportCar1);
        carWashService.InteriorCleaning(sportCar1);
        System.out.println();
        sportCar1.movement(150);
        System.out.println();
        serviceStation.fuel(sportCar1);
        serviceStation.wipWindshield(sportCar1);
        System.out.println();
        System.out.println("New day - new journey with new car!!!");

        FamilyCar familyCar1 = FamilyCar.create("A", "Kia", "black", 6, FuelType.Diesel);
        familyCar1.movement(200);
        System.out.println();
        carWashService.BodyWash(familyCar1);
        carWashService.InteriorCleaning(familyCar1);
        System.out.println();
        familyCar1.movement(500);
        System.out.println();
        serviceStation.fuel(familyCar1);
        serviceStation.wipHeadlights(familyCar1);
        serviceStation.wipMirrors(familyCar1);
        System.out.println();
    }

}
