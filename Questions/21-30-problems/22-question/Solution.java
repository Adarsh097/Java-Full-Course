/*
Create class Associate with below attributes:
id - int
name - String
technology - String
experienceInYears - int

Create class Solution and implement static method "associatesForGivenTechnology" in the Solution class.
This method will take array of Associate objects and a searchTechnology String as parameters.
And will return another array of Associate objects where the searchTechnology String matches with the original array of 
Associate object's technology attribute (case insensitive search) and experienceInYears attribute should be multiples of 5.

Write necessary getters and setters.

Before calling "associatesForGivenTechnology" method in the main method, read values for five associate objects referring 
the attributes in above sequence along with a String searchTechnology.
Then call the "associatesForGivenTechnology" method and write the logic to print the id's in the main method.

Input
-----------------
101
Alex
Java
15
102
Albert
Unix
20
103
Alferd
Testing
13
104
Alfa
Java
15
105
Almas
Java
29
Java

Output
------------------
101
104

*/

import java.util.*;


class Associate{
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears){
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTech(String technology){
        this.technology = technology;
    }
    public void setExp(int exp){
        this.experienceInYears = exp;
    }

    // getters 
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getTech(){
        return this.technology;
    }
    public int getExp(){
        return this.experienceInYears;
    }
}

public class Solution{
    public static ArrayList<Associate> associatesForGivenTechnology(ArrayList<Associate> asc, String tech){
        if(asc.isEmpty())return null;

        ArrayList<Associate> ans = new ArrayList<>();

        for(Associate a : asc){
            if(a.getTech().equalsIgnoreCase(tech) && a.getExp() % 5 == 0){
                ans.add(a);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Associate> asc = new ArrayList<>();

        for(int i=0;i<4;i++){
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String tech = sc.nextLine();
            int exp = Integer.parseInt(sc.nextLine());

            asc.add(new Associate(id, name, tech, exp));
        }

        String searchTech = sc.nextLine();

        ArrayList<Associate> ans = associatesForGivenTechnology(asc,searchTech);

        if(ans == null || ans.isEmpty()){
            System.out.println("No associate found");
        }else{
            for(Associate a : ans){
                System.out.println(a.getId());
            }
        }


    }
}