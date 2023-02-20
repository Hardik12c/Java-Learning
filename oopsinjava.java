class Car{
    String CompanyName="Tata";
    String Carname="xuv700";
    double price=7.9;
    boolean comfortability=true;

    // functions of this car

    void pressbrake(){
        System.out.println("You have preseed the brake right now");
    }

    void pressaccelator(){
        System.out.println("You have pressed the accelator");
    }
}
public class oopsinjava {


    public static void main(String[] args){
        Car mycar=new Car();

        System.out.println(mycar.Carname);
        System.out.println(mycar.comfortability);
        System.out.println(mycar.price);
        System.out.println(mycar.CompanyName);
        mycar.pressbrake();
    }


}
