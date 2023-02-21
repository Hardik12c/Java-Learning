public class objectpassing {
    
    public static void main(String[] args){
        Garage G=new Garage();

        Car car=new Car("tata nano");

        G.park(car);
    }
}

class Car{
    String name;
    Car(String name){
        this.name=name;
    }   
}

class Garage{
    void park(Car car){
        System.out.println("Your car with car name "+car.name+" is parked");
    }
}