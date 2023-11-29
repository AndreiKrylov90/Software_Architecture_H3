public class CarWashService implements CarWash {

    @Override
    public void BodyWash(Car car) {
        System.out.println("Congats, your " + car.getColor() + " " + car.getModel() +  " is clean on the outside");
    }

    @Override
    public void InteriorCleaning(Car car) {
        System.out.println("Congats, your " + car.getColor() + " " + car.getModel() +  " is clean inside");
    }
    
}
