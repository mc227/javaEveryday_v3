package hfj3e;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mark {
    public static void main(String[] args) {
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x < 15) myDog.bark(8);
        while(x > 3) {
            myDog.play();
        }

        int[] numList = {2,4,6,8};
        System.out.print("Hello");
        System.out.println("Dog: " + name);
        String num = "8";
        int z = Integer.parseInt(num);

        try {
            readTheFile("myFile.txt");
        } catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
    }

    private static void readTheFile(String file) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
