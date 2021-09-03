public class Movie extends Media{
    public String name;
    public int year;
    public String genre;

    public Movie(String n, int y, String g) {
        super(n, y, g);
        name = n;
        year = y;
        genre = g;
    }

    //if the media was released on or after the year 2000, return New Millennium Era
    //if the media was released on or after the year 1977, return Modern Era
    //if the media was released on or after the year 1955, return Change Era
    //if the media was released on or after the year 1941, return Golden Era
    //in any other situation, return Pre-Golden Era
    @Override
    public String getEra() {
        if (year >= 2000 ){
            return "New Millennium Era";
        }
        if (year >= 1977){
           return "Modern Era";
        }
        if (year >= 1955){
            return "Change Era";
        }
        if (year >= 1941){
            return "Golden Era";
        }
        else return "Pre-Golden Era";
    }
    //return true if this media has a greater release year than the other's
    @Override
    public boolean wasReleasedAfter(Media other) {
        if (year > other.getYear()){
            return true;
        }
        else return false;
    }
    //return true if this media was a lesser or equal release yearn than the other's
    @Override
    public boolean wasReleasedBeforeOrInSameYear(Media other) {
        if (year <= other.getYear()){
            return true;
        }
        else return false;
    }
}
