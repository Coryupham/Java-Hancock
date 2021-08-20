public class Essay extends GradedActivity{

    private int grammar, spelling, length, content;

    //create constructor
    public Essay(int grammar, int spelling, int length, int content)
    {
        this.grammar = grammar; //max 30pts
        this.spelling = spelling; //max 20pts
        this.length = length; //max 20pts
        this.content = content;//max 30pts

        super.setScore(grammar+spelling+length+content);
    }

    public String toString(){
        String result = "";
        result += "Grammar points: " + grammar + "\n";
        result += "Spelling points: " + spelling + "\n";
        result += "Length points: " + length + "\n";
        result += "Content points: " + content + "\n";
        return result;
    }

}
