import java.util.ArrayList;

public class Car {
    public int height = 160;
    ArrayList<Door> doors = new ArrayList<Door>();

    public Car() {
        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());
    }

    public class Door {
        public int getHeight(){
            return (int) (height * 0.8);
        }
    }
}