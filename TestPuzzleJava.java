import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        int[] newInt = {1,2,3,4,5,6,7,8};
        // ArrayList<Integer> randomRolls = generator.getTenRolls();
        // System.out.println(randomRolls);
        // System.out.println(generator.getRandomLetter());

        // System.out.println(generator.generatePassword());
        // System.out.print(generator.getNewPasswordSet(2)); 
        System.out.println(Arrays.toString(generator.shuffleArray(newInt)));

    for (int i = 0; i < 100; i++) {
      
    }

        //..
        // Write your other test cases here.
        //..
    }
}
