import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava {
  Random randMachine = new Random();
// You will need to import the Random library from java.util

public ArrayList<Integer> getTenRolls() {
  ArrayList<Integer> randomArray = new ArrayList<Integer>();
  for (int i = 0; i < 10; i++) {
    int randomNum = randMachine.nextInt(20) + 1;
    randomArray.add(randomNum);
  }
  return randomArray;
}
public String getRandomLetter() {
  String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
  
    int randomNum = randMachine.nextInt(26);
    String randomLetter = alphabet[randomNum];
  
return randomLetter;
}
public String generatePassword() {
  String password = "";
  for (int i = 0; i < 8; i++) {
    String randomLetter = getRandomLetter();
    password += randomLetter;
  }
  return password;
}
public ArrayList<String> getNewPasswordSet(int length) {
  ArrayList<String> passwordSet = new ArrayList<String>();
  for (int i = 0; i < length; i++) {
    passwordSet.add(generatePassword());
  }
  return passwordSet;
}
public int[] shuffleArray(int[] arr) {
  int loops = randMachine.nextInt((25 - 5) + 1 ) + 5;
  for (int i = 0; i < loops; i++) {
    int firstPos = randMachine.nextInt(arr.length);
    int secondPos = randMachine.nextInt(arr.length);
    int temp = arr[firstPos];
    arr[firstPos] = arr[secondPos];
    arr[secondPos] = temp;

  }


return arr;
}



}
