import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    Random randMachine = new Random();
    public void sayHi() {
        System.out.println("Hello Brian!");
    }
    public int[] randomNumber() {
        int i = 0;
        int[] numList = new int[10];
        while (i < 10) {
        int num = randMachine.nextInt(1, 21);
        // System.out.print(num + ", ");
        numList[i] = num;
        i = i + 1; }
        for(int num: numList) {
            System.out.println(num);
        }
        return numList;
    }
    public char randomLetter() {
        char[] letterList = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int num = randMachine.nextInt(25);
        char letter = letterList[num];
        return letter;
    }
    public String randomString() {
        PuzzleJava getLetter = new PuzzleJava();
        String newString = "";
        for (int i = 0; i < 8; i++) {
            newString = newString + getLetter.randomLetter();
        }
        return newString;
    }
    public String[] randomArray(int length) {
        PuzzleJava getString = new PuzzleJava();
        String[] newArray;
        newArray = new String[length];
        for (int i = 0; i < length; i++) {
            String newString = getString.randomString();
            newArray[i] = newString;
        }
        return newArray;

    }
    public String[] shuffleArray(String[] array) {
        for(int i = 0; i < 1000000; i++) {
            int num1 = randMachine.nextInt(array.length);
            int num2 = randMachine.nextInt(array.length);
            String temp = array[num1];
            array[num1] = array[num2];
            array[num2] = temp; 
        }
        return array;
    }
}