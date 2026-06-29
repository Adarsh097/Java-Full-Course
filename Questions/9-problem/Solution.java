
/*
Create a class Book with below attributes

id - int

pages - int

title - String

author - String

price - double

The above attributes should be private, write getters and setters and parameterized constructor as required.

Create a class Solution with main method
--------------------------------------------
Implement two static methods - findBookWithMaximumPrice and searchBookByTitle in Solution class.

findBookWithMaximumPrice :
=============================
Create a static method findBookWithMaximumPrice in the Solution class. This method will take array of Book objects and 
returns the Book object having the maximum Price if found else return null if not found.

searchBookByTitle :
=============================
Create a static method searchBookByTitle in the Solution class. This method will take array of Book objects and Title as 
input and returns the Book object having the mentioned Title if found else return null if not found.

These methods should be called from the main method.

write code to perform the following tasks.

1. Take necessary input variable and call findBookWithMaximumPrice. For this method - The main method should print the Book
 object with the maximum of mentioned attribute as it is if the returned value is not null, or it should print 
 "No Book found with mentioned attribute."

2. Take necessary input variable and call searchBookByTitle. For this method - The main method should print the Book object 
details as it is, if the returned value is not null or it should print "No Book found with mentioned attribute."

The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and 
printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the
result.

All String comparison needs to be in case sensitive.

Input:

1
845
Bengali
Arijit
525.50
2
456
English
Raju
412.30
3
1022
History
Kaka
525.50
4
125
geography
MN
524
English

Output:

1 Bengali
3 History
2
456
*/

import java.util.*;

class Book {
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;

    public Book(int id, int pages, String title, String author, double price) {
        this.id = id;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getters
    public int getId() {
        return this.id;
    }

    public int getPages() {
        return this.pages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setPages(int pages) {
        this.pages = pages;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

public class Solution {
    public static Book findBookWithMaximumPrice(ArrayList<Book> books) {
        if (books.isEmpty())
            return null;

        books.sort((a, b) -> Double.compare(b.getPrice(), a.getPrice()));

        return books.get(0);
    }

    public static Book searchBookByTitle(ArrayList<Book> books, String title) {
        if (books.isEmpty())
            return null;

        Book ans = null;

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                ans = b;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.nextLine());
            int pages = Integer.parseInt(sc.nextLine());
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());

            books.add(new Book(id, pages, title, author, price));
        }

        Book bookWithMaxPrice = findBookWithMaximumPrice(books);

        if (bookWithMaxPrice == null) {
            System.out.println("No book found.");
        } else {
            System.out.println("Book with max price: " + bookWithMaxPrice.getTitle());
        }

        String searchTitle = sc.nextLine();
        Book bookWithGivenTitle = searchBookByTitle(books, searchTitle);

        if (bookWithGivenTitle == null) {
            System.out.println("No book found.");
        } else {
            System.out.println("Book with max price: " + bookWithGivenTitle.getTitle());
        }

    }
}
