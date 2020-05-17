package Exercises;

public class GetBigWords {
    public static void main(String[] args) {
        String testString="Send the request to support@turingscraft.com before January 25th 2021";
        testString = testString.replace('@', ' ');
        System.out.println(testString);
        testString = testString.replace('.', ' ');
        System.out.println(testString);
        testString = testString.replaceAll("\\d+.", "");
        System.out.println(testString);
    }
}
