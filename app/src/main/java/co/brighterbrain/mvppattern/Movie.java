package co.brighterbrain.mvppattern;

/**
 * Created by User on 8/31/2016.
 */
public class Movie {

    private String title, genre, year;

    public Movie(){
    }
    public Movie(String title,String genre,String year){
        this.title =title;
        this.genre= genre;
        this.year=year;
    }
    public  String getTitle(){
        return title;
    }

    public String setTitle(String name){
        this.title= name;
        return name;
    }
    public String getGenre(){
        return genre;
    }

    public String setGenre(String genre){
        this.genre=genre;
        return genre;
    }

    public String getYear(){
        return year;
    }

    public String setYear(String year){
        this.year=year;
        return  year;
    }

}
