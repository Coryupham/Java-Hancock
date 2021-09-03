import java.util.ArrayList;

public class MovieReducerEraCount implements MediaReducer{

    @Override
    public String reduce(ArrayList<Media> list, String key) {
        //if the media was released on or after the year 2000, return New Millennium Era
        //if the media was released on or after the year 1977, return Modern Era
        //if the media was released on or after the year 1955, return Change Era
        //if the media was released on or after the year 1941, return Golden Era
        //in any other situation, return Pre-Golden Era
        int count = 0;
        for(Media current : list){
            if(current.getEra().equals(key)){
                count++;
            }
        }
        return "Movies in " + key + ": " + count;
    }
}
