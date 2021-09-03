import java.util.ArrayList;

public class MovieReducerExtremes implements MediaReducer{

    @Override
    public String reduce(ArrayList<Media> list, String key) {

        if (key.equals("Newest"))
        {
            Media Newest = list.get(0);
            for(Media current : list){
                if (current.getYear() > Newest.getYear()){
                    Newest = current;
                }
            }
            return "" + Newest;
        }
        else if (key.equals("Oldest")){
            Media Oldest = list.get(0);
            for(Media current : list){
                if (current.getYear() <= Oldest.getYear()){
                    Oldest = current;
                }
            }
            return "" + Oldest;
        }
        else return null;
    }
}
