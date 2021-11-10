//import java.util.ArrayList;
//
//public class Password {
//
//    private static String selectedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@";
//
//    private void processAll(int x, int maxLength, String result){
//        if(x < selectedCharacters.length()){
//            generate(maxLength, result + selectedCharacters.charAt(x));
//            processAll(x+1, maxLength, result);
//
//        }
//    }
//    public ArrayList<String> results = new ArrayList<>();
//
//    public void generate(int maxLength, String result){
//        if(result.length() < maxLength){
//            //for(int x = 0; x < selectedCharacters.length(); x++) {
//            //    generate(maxLength, result + selectedCharacters.charAt(x));
//            // }
//            processAll(0, maxLength, result);
//
//        } else {
//            numPasswordsGenerated++;
//            results.add(result);
//            String passed = me.sendPassword(current);
//            if(passed.equals("yes")){
//                System.out.println(current);
//                System.exit(0);
//            }
//            //System.out.println(result);
//        }
//    }
//
//}
