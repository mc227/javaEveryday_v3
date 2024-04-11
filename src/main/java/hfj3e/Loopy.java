package hfj3e;

public class Loopy {
    public static void main(String[] args) {
        System.out.println("Before the Loop");
        int x = 1;
        while(x < 4){
            System.out.println("In the Loop");
            System.out.println("the value of x is [" + x + "]");
            x++;
        }
        System.out.println("Out of the Loop");
    }
}
