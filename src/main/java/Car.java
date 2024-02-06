import java.util.ArrayList;

public class Car {
    int height = 160;
    ArrayList<Door> doors = new ArrayList<>();
    public Car() {
        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());
    }

    public static Door createDoor(){
        Car car = new Car();
        return car.new Door();
    }

    class Door {
        int width;
        int height;
//        public int getheight(){
//            return (int) (height * 0.8);
//        }
    }
}