

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava puzzleTest = new PuzzleJava();
        puzzleTest.sayHi();
        puzzleTest.randomNumber();
        System.out.println(puzzleTest.randomLetter());
        System.out.println(puzzleTest.randomString());
        String[] array = puzzleTest.randomArray(15);
        System.out.println(array);
        for (int i = 0; i < 15; i++) {
            System.out.println(array[i]);
        }
        String[] myArray = {"Clara", "Brian", "Michael", "Vincent"};
        String[] array2 = puzzleTest.shuffleArray(myArray);
        System.out.println(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

}