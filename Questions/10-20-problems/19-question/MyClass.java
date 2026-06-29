/*

 Create the class Flowers with below attribute:

flowerId-int;
flowerName-String;
price-int;
rating-int;
type-String;

The above attributes must be private,write getters and setters and parametrized constructor as well.

Create class MyClass with main method.

Implement one static method:findMinPriceByType in MyClass class.

findMinPriceByType Method:

This method will take two input parameters:Array of Flower objects and String parameter.This method will return the minimum 
priced flower object from  array of Flower objects for the given type(String parameter),only if the rating is greater than 
3. If no Flowers with the above conditions are present in the array of the flower objects,then the method will return null.

For this method-The main method  should print the flowerId from the returned object if the returned value is not null.
else it should print "There is no flower with given type".

**********************************************************************

input1:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
ephemerals



output:

213





**********************

input2:

123

Yellow trout lilly

3000

5

ephemerals

345

snowdrop

2500

4

ephemerals

321

Yarrow

1000

4

perennials

213

red trillium

2250

4

ephemerals

Biennial


output2:

There is no flower with given type.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Flowers {
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public Flowers(int fid, String fn, int p, int r, String t) {
        this.flowerId = fid;
        this.flowerName = fn;
        this.price = p;
        this.rating = r;
        this.type = t;
    }

    // setter
    public void setFlowerId(int fid) {
        this.flowerId = fid;
    }

    public void setFlowerName(String fn) {
        this.flowerName = fn;
    }

    public void setPrice(int p) {
        this.price = p;
    }

    public void setRating(int r) {
        this.rating = r;
    }

    public void setType(String t) {
        this.type = t;
    }

    // getter
    public int getFlowerId() {
        return this.flowerId;
    }

    public String getFlowerName() {
        return this.flowerName;
    }

    public int getPrice() {
        return this.price;
    }

    public int getRating() {
        return this.rating;
    }

    public String getType() {
        return this.type;
    }
}

public class MyClass {
    public static Flowers findMinPriceByType(
            ArrayList<Flowers> flowers, String type) {

        Flowers ans = null;

        for (Flowers f : flowers) {

            if (f.getType().equalsIgnoreCase(type)
                    && f.getRating() > 3) {

                if (ans == null || f.getPrice() < ans.getPrice()) {
                    ans = f;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Flowers> flowers = new ArrayList<>();

        for (int i = 0; i < 4; i++) {

            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int rating = Integer.parseInt(sc.nextLine());
            String type = sc.nextLine();

            flowers.add(
                    new Flowers(id, name, price, rating, type));
        }

        String type = sc.nextLine();

        Flowers result = findMinPriceByType(flowers, type);

        if (result != null) {
            System.out.println(result.getFlowerId());
        } else {
            System.out.println("There is no flower with given type");
        }
    }
}