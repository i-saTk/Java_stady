public class DriveCar {
    public static void main(String[] args){
        Car car1 = new Car();

        car1.setNo(2525);
        car1.run(30);
        car1.display();

        car1.stop();
        car1.display();

    }
    
}
