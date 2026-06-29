import java.util.Scanner;

class Footwear{
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public int getFootwearId() {
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class FootwearProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Footwear[] footwears = new Footwear[5];

        for(int i=0;i<5;i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            footwears[i] = new Footwear(a,b,c,d);
        }

        String ftType = sc.nextLine();
        String ftName = sc.nextLine();

        int count = getCountByType(footwears, ftType);

        if(count >0){
            System.out.println(count);
        }else{
            System.out.println("No Footwear found");
        }

        Footwear obj = getSecondHighestPriceByBrand(footwears, ftName);
        if(obj != null){
            System.out.println(obj.getFootwearId());
            System.out.println(obj.getFootwearName());
            System.out.println(obj.getFootwearType());
            System.out.println(obj.getPrice());
        }else{
            System.out.println("No Footwear found");
        }

    }

    public static int getCountByType(Footwear[] footwears, String ftType){
        int count = 0;
        for(Footwear f:footwears){
            if(f.getFootwearType().equalsIgnoreCase(ftType)){
                count++;
            }
        }
        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String ftName){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        Footwear secondHighest = null;

        for(Footwear f:footwears){
            if(f.getFootwearName().equalsIgnoreCase(ftName)){
                if(f.getPrice() > first){
                    second = first;
                    first = f.getPrice();
                }else if(f.getPrice() > second && f.getPrice() < first){
                    second = f.getPrice();
                }
            }
        }

        for(Footwear f:footwears){
            if(f.getFootwearName().equalsIgnoreCase(ftName) && f.getPrice() == second){
                secondHighest = f;
                break;
            }
        }

        return secondHighest;
    }
}