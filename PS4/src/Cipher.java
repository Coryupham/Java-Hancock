public class Cipher{
    private String text;
    private String cipherText="";
    private int key;


    public Cipher (String text, int key) throws UselessKeyException{
    this.key = key;
    this.text = text;
    if(key % 26 == 0){
        throw new UselessKeyException(key);
    }
        String result = "";
        for (char character : text.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                int originalAlphabetPosition = character;
                int newAlphabetPosition = (originalAlphabetPosition + key % 26);

                if(Character.isUpperCase(character)){
                    if(newAlphabetPosition>'Z'){
                        newAlphabetPosition -= 26;
                    }else if (newAlphabetPosition<'A'){
                        newAlphabetPosition += 26;
                    }
                }else if(Character.isLowerCase(character)){
                    if (newAlphabetPosition>'z'){
                        newAlphabetPosition -= 26;
                    }else if(newAlphabetPosition<'a'){
                        newAlphabetPosition += 26;
                    }
                }


                char newCharacter = (char) (newAlphabetPosition);
                result += newCharacter;
            } else {
                result += (char)(character + key % 26);
            }
        }
        cipherText = result;
    }

    public String getPlainText() throws EmptyPlainText {
        if(text.equals("")){
            throw new EmptyPlainText();
        }
        return text;
    }
    public int getKey(){
        return key;
    }

    public String getCipherText(){
return cipherText;
    }

}
