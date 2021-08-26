public class Engineer extends Employee{
    private String favLanguage;

    public Engineer(String name, int id, String favLanguage){
        super(name, id);
        this.favLanguage = favLanguage;
    }

    public String toString(){

        return super.toString() + "\nFavorite Language: " + favLanguage;
    }
}
