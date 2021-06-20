package section_5._1_random_numbers;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random randy = new Random();
        int low = 5;
        int high = 7;
        int randomBetweenLowAndHigh = randy.nextInt((high-low)+1)+low;
    }
}
