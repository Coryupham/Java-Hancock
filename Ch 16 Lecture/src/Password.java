public class Password {
    // Use this on the last question of the homework assignment
    // static vs non static
    // becuase this is non static the only way to access it would be to create a new object of type "Password"
    // Then you can call Password.generate.
    private static String selectedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    private int numPasswordsGenerated;

    public int getNumPasswordsGenerated() {
        return numPasswordsGenerated;
    }

    private void processAll(int x, int maxLength, String result){
        if(x < selectedCharacters.length()){
            generate(maxLength, result + selectedCharacters.charAt(x));
            processAll(x+1, maxLength, result);

        }
    }

    public void generate(int maxLength, String result){
        if(result.length() < maxLength){
            //for(int x = 0; x < selectedCharacters.length(); x++) {
            //    generate(maxLength, result + selectedCharacters.charAt(x));
            // }
            processAll(0, maxLength, result);

        } else {
            numPasswordsGenerated++;
            System.out.println(result);
        }
    }
}
