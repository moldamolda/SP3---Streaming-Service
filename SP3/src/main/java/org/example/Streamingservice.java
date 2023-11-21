package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Streamingservice
{

String title;
String category;

    Scanner scan = new Scanner(System.in);

       public void displayMainMenu()
       {

           System.out.println("What would you like to watch?");
           System.out.println("1) All Movie ");
           System.out.println("2) Movie by category ");
           System.out.println("3) All Series ");
           System.out.println("4) Series by category ");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice)
           {
               case 1:
                   TextUI.displayMovies();
                   break;
               case 2:
                   searchMovieFromCategory();
                   break;
               case 3:
                   searchSeries();
                   break;
               case 4:
                   searchSeriesFromCategory();
                   break;
               default:
                   System.out.println("Invalid choice please try again");
                   displayMainMenu();

           }
       }

    public void searchMovie(String title)
    {

    }
    public void searchMovieFromCategory(String category)
    {
        String input = scan.nextLine();
        String movieCategory = input;

        ArrayList<String> options = new ArrayList<>();

        options.add("");
        options.add("\nCATEGORIES: ");
        options.add("Crime ");
        options.add("Drama ");
        options.add("Biographic ");
        options.add("Sport ");
        options.add("History ");
        options.add("Romance ");
        options.add("War ");
        options.add("Mystery ");
        options.add("Adventure ");
        options.add("Family ");
        options.add("Fantasy ");
        options.add("Thriller ");
        options.add("Horror ");
        options.add("Film-noir ");
        options.add("Action ");
        options.add("Sci-fi ");
        options.add("Comedy ");
        options.add("Musical ");
        options.add("Western ");

        for (String option : options)
        {
            System.out.println(option);
        }
    }

    public void searchSeries(String title)
        {

    }

    public void searchSeriesFromCategory(String category)
    {

    }



    public void playMovie(String movie)
    {

    }
    public void removeMovie(User user, Movie movie)
    {

    }

}
