import java.util.Scanner;

public class Activity6 {

    private static int resultUpper = 0;
    private static int resultLower = 0;

//    public static int lowerCaseDetector(String str){
//
//        for(int x = 0; x < str.length(); x++){
//            if(Character.isLowerCase(str.charAt(x))){
//                result++;
//            }
//        }
//        return result;
//    }


    public static void lowerCaseDetectorRecursion(String str, int x) {
        if (x < str.length()) {
            if (Character.isLowerCase(str.charAt(x))) {
                resultLower += 1;
            }
            lowerCaseDetectorRecursion(str, x + 1);
        }
    }

//    public static int upperCaseDetector(String str){
//        int result = 0;
//        for(int x = 0; x < str.length(); x++){
//            if(Character.isUpperCase(str.charAt(x))){
//                result++;
//            }
//        }
//        return result;
//    }

    public static void upperCaseDetectorRecursion(String str, int x) {
        if (x < str.length()) {
            if (Character.isUpperCase(str.charAt(x))) {
                resultUpper += 1;
            }
            upperCaseDetectorRecursion(str, x + 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        upperCaseDetectorRecursion(str, 0);
        lowerCaseDetectorRecursion(str, 0);
        System.out.println("Number of uppercase letters: " + resultUpper);
        System.out.println("Number of lowercase letters: " + resultLower);

    }
}
