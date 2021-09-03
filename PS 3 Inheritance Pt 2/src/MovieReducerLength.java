import java.util.ArrayList;

public class MovieReducerLength implements MediaReducer{
    @Override
    public String reduce(ArrayList<Media> list, String length) {
        int l = Integer.parseInt(length);
        for(Media current : list){
            if(current.getName().length() == l){
                System.out.println(current);
            }
        }
        return "";
    }
}
