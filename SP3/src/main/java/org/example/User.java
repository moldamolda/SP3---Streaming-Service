package main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String passWord;

    private  List<Media> watchLaterList;
    private List<Media> watchedList;


    public User(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
        this.watchedList = new ArrayList<>();
        this.watchLaterList = new ArrayList<>();

    }

    //metode til at adde et medie til WatchLaterList

    public void addToWatchLaterList(Media media){
        watchLaterList.add(media);
        System.out.println("Media has been added to your watch later list");
    }

    //metode til at adde et medie til watchedList
    public void addToWatchedList(Media media){
        watchedList.add(media);
        System.out.println("Media has been added to your watched list");
    }

    //metode til at fjerne et medie fra watchLaterList
    public void removeFromToWatchLaterList(Media media){
        if(watchLaterList.remove(media)){
            System.out.println("Media has been removed from your watch later list");
        } else {
            System.out.println("Media not found in your watch later list");
        }
    }

    // til at display watchLaterList
    public void displayWatchLaterList(){
        System.out.println("watch media later list:");
        for(Media k: watchLaterList){
            System.out.println("- " + k.getTitle());
        }
    }
    // til at display watchedList
    public void displayWatchedList(){
        System.out.println("watched media list:");
        for(Media k: watchedList){
            System.out.println("- " + k.getTitle());
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



}
