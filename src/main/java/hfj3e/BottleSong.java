package hfj3e;
// dev task: create BottleSong application
// requirements:
// tbere will be a word variable that changes from bottles to bottle especially
// at the end
// there will be a while loop and an iftest
// crap this is supposed to be easy
// there is an int variable having a value that is decrementen
// the sample console output would be something like this:
//10 green bottles hanging on the wall
//10 green bottles hanging on the wall
//And if one green bottle should accidentally fall
// There'll be 9 green bottles of beer on the wall
//mc227
public class BottleSong {
    public static void main(String[] args) {
        int bottleNumbers = 10;
        String word = bottleNumbers > 1 ? "bottles": "bottle";
        while (bottleNumbers > 1) {
            System.out.printf("%d green %s, hanging on the wall%n", bottleNumbers, word);
            System.out.printf("%d green %s, hanging on the wall%n", bottleNumbers, word);
            System.out.printf("And if one green bottle should fall%n");
            bottleNumbers -=1;
            System.out.printf("%d green %s, hanging on the wall%n", bottleNumbers, word);
            System.out.println();
        }
        System.out.printf("%d green %s, hanging on the wall%n", bottleNumbers, word);
        System.out.printf("%d green %s, hanging on the wall%n", bottleNumbers, word);
        System.out.printf("And if one green bottle should fall%n");
        bottleNumbers -=1;
        System.out.println("There'll be no green bottles, hanging on the wall");

    }
}

//public class BottleSong {
//    public static void main(String[] args) {
//        int bottlesNum = 10;
//        String word = "bottles";
//
//        while (bottlesNum > 0) {
//
//            if (bottlesNum == 1) {
//                word = "bottle"; // singular, as in ONE bottle.
//            }
//
//            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
//            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
//            System.out.println("And if one green bottle should accidentally fall,");
//            bottlesNum = bottlesNum - 1;
//
//            if  (bottlesNum > 0) {
//                System.out.println("There'll be " + bottlesNum +
//                        " green " + word + ", hanging on the wall");
//            } else {
//                System.out.println("There'll be no green bottles, hanging on the wall");
//            } // end else
//        } // end while loop
//    } // end main method
//} // end class