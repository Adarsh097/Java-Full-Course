/* Sort name by dictionary order
    Input
    -----------------
    Arijit
    Minaz
    Arnab

    Output
    -------------------
    Arijit
    Arnab
    Minaz
 */

import java.util.*;
public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        names.add(sc.nextLine());
         names.add(sc.nextLine());
          names.add(sc.nextLine());

        Collections.sort(names);

        for(String name: names){
            System.out.print(name+" ");
        }


        sc.close();
    }
    
}