/*

Create class Movie with below attributes: 

movieName - String 
company - String 
genre - String 
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
objects where the searchGenre String matches with the original array of Movie object's genre attribute 
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie
*/

import java.util.*;

class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String mv, String c, String g, int b){
        this.movieName = mv;
        this.company = c;
        this.genre = g;
        this.budget = b;
    }

    //getters

    public String getMovieName(){
        return this.movieName;
    }
   public String getCompany(){
        return this.company;
    }   
   public String getGenre(){
        return this.genre;
    }
    public int getBudget(){
        return this.budget;
    }


    //setters 
    public void setMovieName(String mv){
        this.movieName = mv;
    }
    public void setCompany(String c){
        this.company = c;
    }
    public void setGenre(String g){
        this.genre = g;
    }
    public void setBudget(int b){
        this.budget = b;
    }
    
}

public class Solution{

    public static Movie[] getMovieByGenre(ArrayList<Movie> mvs, String genre){
        ArrayList<Movie> ans = new ArrayList<>();

        for(Movie m : mvs){
            if(m.getGenre().equalsIgnoreCase(genre)){
                ans.add(m);
            }
        }
        return ans.toArray(new Movie[0]);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Movie> mvs = new ArrayList<>();

        for(int i=0;i<4;i++){
            String mv = sc.nextLine();
            String c = sc.nextLine();
            String g = sc.nextLine();
            int b = Integer.parseInt(sc.nextLine());

            mvs.add(new Movie(mv, c, g, b));
        }
        String searchGenre = sc.nextLine();

        Movie[]  result = getMovieByGenre(mvs, searchGenre);
        for(Movie m : result){
            if(m.getBudget() > 8000000){
                System.out.println("High Budge Movie");
            }else{
                System.out.println("Low Budge Movie");
            }
        }

        sc.close();

    }
}