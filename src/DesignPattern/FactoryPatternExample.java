package DesignPattern;

abstract class vehicle{
    abstract int getWhee();
}
class car extends vehicle{
    int wheel;
     car(int wheel){
        this.wheel = wheel;
    }
    @Override
    int getWhee() {
        return wheel;
    }
}

class Bike extends vehicle{
    int wheel;
    Bike(int wheel){
        this.wheel = wheel;
    }
    @Override
    int getWhee() {
        return wheel;
    }
}

class VehicleFactory{
    public  static vehicle getVehicle(String type, int wheel){

        if(type=="Car"){
            return new car(wheel);
        }else{
            return new Bike(wheel);
        }
    }
}


public class FactoryPatternExample {
    public static void main(String[] args) {
        vehicle car= VehicleFactory.getVehicle("Car",4);
        System.out.println(car.toString());

        vehicle bike= VehicleFactory.getVehicle("Bike",4);
        System.out.println(bike.toString());
    }
}
