public abstract class CharacterCounter {

    protected String text;

    public CharacterCounter(String text) {
        this.text = text;
    }

    public String toString() {
        return "The text \"" + text + "\" has " + getCount() + " of those characters.";
    }

    public abstract int getCount();
}
