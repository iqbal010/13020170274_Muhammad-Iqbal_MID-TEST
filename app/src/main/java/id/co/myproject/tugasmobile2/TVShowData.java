package id.co.myproject.tugasmobile2;

import java.util.ArrayList;

public class TVShowData {
    public static String [] data = new String[]{
            "Planet Earth",
            "Band of Brothers",
            "Breaking Bad",
            "Chernobly",
            "The Wire",
            "Blue Planet",
            "Our Planet",
            "The Last Dance",
            "Cosmos : A Spacetime",
            "Game of Thrones",
    };

    public static int [] dataGamber = new int[]{
            R.drawable.planet_earth,
            R.drawable.band_of_brothers,
            R.drawable.breaking_bad,
            R.drawable.chernobly,
            R.drawable.the_wire,
            R.drawable.blue_planet,
            R.drawable.our_planet,
            R.drawable.the_last_dance,
            R.drawable.cosmos,
            R.drawable.game,
    };

    public static ArrayList<TVShow> getListData(){
        TVShow tvShow = null;
        ArrayList<TVShow> list = new ArrayList<>();
        for (int i=0; i<data.length; i++) {
            tvShow = new TVShow();
            tvShow.setTitle(data[i]);
            tvShow.setGambar(dataGamber[i]);
            list.add(tvShow);
        }

        return list;
    }

}
