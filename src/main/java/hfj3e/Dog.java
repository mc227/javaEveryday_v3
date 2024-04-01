package hfj3e;

public class Dog {
    public String name;
    public int size;

    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void bark(int i) {
        for(int j = 0; j <= i; j++) {
            System.out.println("woof");
        }
    }

    public void play() {
        System.out.println("play time");
    }
}
