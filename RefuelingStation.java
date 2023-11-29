public class RefuelingStation implements Refueling{
    @Override
    public void fuel(Car car) {
        switch (car.getFuelType()){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }
}
