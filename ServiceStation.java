public class ServiceStation implements Refueling, Wiping{
    @Override
    public void fuel(Car car) {
        switch (car.getFuelType()){
            case Diesel -> System.out.println("Your car was fueled by diesel");
            case Gasoline -> System.out.println("Your car was fueled by gasoline");
        }
    }

    @Override
    public void wipMirrors(Car car) {
        System.out.println("Congats, mirrors of your " + car.getColor() + " " + car.getModel() +  " are clean now");
    }

    @Override
    public void wipWindshield(Car car) {
        System.out.println("Congats, windshield of your " + car.getColor() + " " + car.getModel() +  " is clean now");
    }

    @Override
    public void wipHeadlights(Car car) {
        System.out.println("Congats, headlights of your " + car.getColor() + " " + car.getModel() +  " are clean now");
    }
}
