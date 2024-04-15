package hfj3e;

import java.util.Random;
public class PhraseOMatic {
    // instantiate the first, second and third arrays
    public static void main(String[] args) {
        String[] first = new String[] {"agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed"};

        String[] second = new String[]{ "loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub",
                "IoT", "cloud native", "service oriented", "containerized", "serverless",
                "microservices", "distributed ledger"};

        String[] third = new String[]{ "framework", "library",
                "DSL", "REST API", "repository", "pipeline",
                "service mesh", "architecture", "perspective", "design",
                "orientation"};
        // create some random number generating thing
        Random rn1 = new Random();
        Random rn2 = new Random();
        Random rn3 = new Random();

        int randomNum1 = rn1.nextInt(first.length);
        int randomNum2 = rn2.nextInt(second.length);
        int randomNum3 = rn3.nextInt(third.length);

        String first_word = first[randomNum1];
        String second_word = second[randomNum2];
        String third_word = third[randomNum3];

        System.out.printf("%s %s %s",first_word, second_word, third_word);

        // then use them for the three arrays
        // then print them out in sequence
    }
}
