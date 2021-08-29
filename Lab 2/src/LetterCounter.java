public class LetterCounter extends CharacterCounter{

    public LetterCounter (String input){
        super(input);
    }

    //character.isalphabetic
    @Override
    public int getCount() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i)))
                count++;
        }
        return count;
    }
}
