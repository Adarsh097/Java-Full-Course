

/*

Create class Sim2 with below attributes:

id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.

This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and 
the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by 
means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above 
sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in 
main method to print the id's of the result obtained.

Input
--------------------------
1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4

Output
--------------------------
4
3
1
2
*/

import java.util.*;

class Sim2{
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim2(int id, String company, int balance, double ratePerSecond, String circle){
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}


public class Solution{
    public static Sim2[] matchAndSort(Sim2[] sims, String search_circle, double search_rate){
        List<Sim2> matchedSims = new ArrayList<>();
        for(Sim2 sim : sims){
            if(sim.getCircle().equals(search_circle) && sim.getRatePerSecond() < search_rate){
                matchedSims.add(sim);
            }
        }
        matchedSims.sort((s1, s2) -> Integer.compare(s2.getBalance(), s1.getBalance()));
        return matchedSims.toArray(new Sim2[0]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sim2[] sims = new Sim2[4];
        for(int i = 0; i < 4; i++){
            int id = sc.nextInt();
            String company = sc.next();
            int balance = sc.nextInt();
            double ratePerSecond = sc.nextDouble();
            String circle = sc.next();
            sims[i] = new Sim2(id, company, balance, ratePerSecond, circle);
        }
        String search_circle = sc.next();
        double search_rate = sc.nextDouble();
        
        Sim2[] result = matchAndSort(sims, search_circle, search_rate);
        for(Sim2 sim : result){
            System.out.println(sim.getId());
        }
        sc.close();
    }
}