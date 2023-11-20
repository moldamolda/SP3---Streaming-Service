package org.example;

public class TextUI {

    public void displayMessage(String msg){
        System.out.println(msg);
    }

    public String displayMovies(){
        return null;
    }

    public String displaySeries(){
        return null;
    }

    public List<Movie> displayWatchedMovie(User user){
        String name = user;

        System.out.println(name+ "," + " These are the movies that you have watched:");

        for(User.watchedMovies() s : user){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a movie from the list? \n ** Y/N **");


        return null;
    }

    public List<Movie> displaySavedMovie(User user){
        String name = user;


        System.out.println(name+ "," + " These are the movies you have saved for later viewing:");
        for(User.savedMovies s : user){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a movie from the list? \n ** Y/N **");


        return null;
    }

    public List<Series> displayWatchedSeries(User user){
        String name = user;

        System.out.println(name+ "," + " This is a list of shows that you have watched:");

        for(User.watchedSeries s : user){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a show from the list? \n ** Y/N **");

        return null;
    }

    public List<Series> displaySavedSeries(User user){
        String name = user;

        System.out.println(toString()+ "," + " This is a list of shows you have saved for later viewing:");

        for(User.savedSeries s : user){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a show from the list? \n ** Y/N **");


        return null;
    }

    public String toString(){
        String name = User.getUserName();
        return name;
    }


}