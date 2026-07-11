import java.util.*;

class Driver {
    private int id;
    private String name;
    private String contact;
    private float experience;

    public Driver(int id, String name, String contact, float experience) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}

class Truck {
    private int id;
    private String name;
    private float totalMilesTraveledByTruck;
    private Driver driver;

    public Truck(int id, String name, float totalMilesTraveledByTruck, Driver driver) {
        this.id = id;
        this.name = name;
        this.totalMilesTraveledByTruck = totalMilesTraveledByTruck;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalMilesTraveledByTruck() {
        return totalMilesTraveledByTruck;
    }

    public void setTotalMilesTraveledByTruck(float totalMilesTraveledByTruck) {
        this.totalMilesTraveledByTruck = totalMilesTraveledByTruck;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

public class Solution {

    public static Truck[] getAllTruckWithDistance(Truck[] trucks, int thresholdDistance) {

        ArrayList<Truck> list = new ArrayList<>();

        for (Truck truck : trucks) {
            if (truck.getTotalMilesTraveledByTruck() >= thresholdDistance) {
                list.add(truck);
            }
        }

        if (list.size() == 0) {
            return null;
        }

        // Stable sort (Collections.sort is stable)
        Collections.sort(list, new Comparator<Truck>() {
            @Override
            public int compare(Truck t1, Truck t2) {
                return Float.compare(
                        t2.getDriver().getExperience(),
                        t1.getDriver().getExperience());
            }
        });

        return list.toArray(new Truck[0]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Truck[] trucks = new Truck[n];

        for (int i = 0; i < n; i++) {

            int truckId = sc.nextInt();
            sc.nextLine();
            String truckName = sc.nextLine();
            float miles = sc.nextFloat();

            int driverId = sc.nextInt();
            sc.nextLine();
            String driverName = sc.nextLine();
            String contact = sc.nextLine();
            float experience = sc.nextFloat();

            Driver driver = new Driver(driverId, driverName, contact, experience);
            trucks[i] = new Truck(truckId, truckName, miles, driver);
        }

        int thresholdDistance = sc.nextInt();

        Truck[] result = getAllTruckWithDistance(trucks, thresholdDistance);

        if (result == null) {
            System.out.println("No Truck Found");
        } else {
            for (Truck t : result) {
                System.out.println(t.getId());
                System.out.println(t.getName());
                System.out.println(t.getTotalMilesTraveledByTruck());
                System.out.println(t.getDriver().getName());
                System.out.println(t.getDriver().getExperience());
            }
        }

        sc.close();
    }
}


/*
Collections.sort(list,
        (t1, t2) -> Float.compare(
                t2.getDriver().getExperience(),
                t1.getDriver().getExperience()));



  list.sort((t1, t2) ->
        Float.compare(
                t2.getDriver().getExperience(),
                t1.getDriver().getExperience()));

*/
