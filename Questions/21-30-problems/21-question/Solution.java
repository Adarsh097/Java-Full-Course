/*
Create a class Fruits with below attributes as private
● int fruitId
● String fruitName
● int price
● int rating

Write getters, setters and parameterized constructor in the abovementioned attribute 
sequence as required.

Create class Solution with main method

Implement One static method-

● findMaximumPriceByRating

findMaximumPriceByRating in the solution class. 
This method will take array of Fruit objects, int paramater and returns the maximum priced fruit 
object from array of Fruit objects whichever has rating greater than the rating 
(rating parameter passed). This method should be called from main method.

Write code to perform following tasks:

1. Take necessary input variable and call findMaximumPriceByRating.

For this method- The main method should print the fruitId from returnedobject. As if the 
returned value is not null, or it should print "No such Fruit".

Note:- Before calling this static method, use Scanner object to read thevalues of four Fruits 
objects. No two Fruits will have same price. All thesearches should be case insensitive.
Consider below sample input and output to test your code.


Input
-------------------
555
Apple
200
5
777
Orange
150
4
333
Banana
100
4
888
Avocado
250
4
3

Output
-----------------
888

*/

import java.util.*;



class Fruit{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;


    public Fruit(int fid, String fn, int p, int r){
        this.fruitId = fid;
        this.fruitName = fn;
        this.price = p;
        this.rating = r;

    }

    // setters

    public void setId(int fid){
        this. fruitId = fid;
    }
    public void setName(String fn){
        this.fruitName = fn;
    }
    public void setPrice(int p){
        this.price = p;
    }
    public void setRating(int r){
        this.rating = r;
    }


    // getters

    public int getId(){
        return this.fruitId;
    }
    public String getName(){
        return this.fruitName;
    }

    public int getPrice(){
        return this.price;
    }

    public int getRating(){
        return this.rating;
    }
}


public class Solution {

    public static Fruit findMaximumPriceByRating(ArrayList<Fruit>fruits, int rating){
        if(fruits.isEmpty())return null;
        ArrayList<Fruit> temp = new ArrayList<>();

        for(Fruit f : fruits){
            if(f.getRating() > rating){
                temp.add(f);
            }
        }

        temp.sort((a,b) -> Integer.compare(b.getPrice(), a.getPrice()));

        return temp.get(0);
    }


    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    ArrayList<Fruit> fruits = new ArrayList<>();

    for(int  i=0;i<4;i++){
        int fid = Integer.parseInt(sc.nextLine());
        String fn = sc.nextLine();
        int p = Integer.parseInt(sc.nextLine());
        int r = Integer.parseInt(sc.nextLine());

        fruits.add(new Fruit(fid, fn, p, r));


    }

    int searchRating = Integer.parseInt(sc.nextLine());

      Fruit ans = findMaximumPriceByRating(fruits, searchRating);

      if(ans == null){
        System.out.println("there is no fruit.");
      }else{
        System.out.println(ans.getId());
      }

    }


}
