package Lab4;

import java.util.*;

import java.util.Collections;

public class TownSortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in name of town that you want to search\n{Tralee, Macroom, Listowel, Adare, Killarney}\n");
        String name = sc.next();
        Town[] towns = new Town[5];
        towns[0] = new Town("Tralee", "Kerry", 23000);
        towns[1] = new Town("Macroom", "Cork", 3800);
        towns[2] = new Town("Listowel", "Kerry", 4820);
        towns[3] = new Town("Adare", "Limerick", 2650);
        towns[4] = new Town("Killarney", "Kerry", 14500);

        displayArray(towns);

        Arrays.sort(towns);
        System.out.println("\nSorted List");
        displayArray(towns);
        System.out.println("\nSearch for name: " + name);
        System.out.println("The index for " + name + " is " + searchTownsByNameArray(towns,name));


        ArrayList<Town> towns1 = new ArrayList<Town>();

        towns1.add(new Town("Tralee", "Kerry", 23000));
        towns1.add(new Town("Macroom", "Cork", 3800));
        towns1.add(new Town("Listowel", "Kerry", 4820));
        towns1.add(new Town("Adare", "Limerick", 2650));
        towns1.add(new Town("Killarney", "Kerry", 14500));

        System.out.println("\nArrayList");
        displayArrayList(towns1);

        Collections.sort(towns1);
        System.out.println("\nSorted ArrayList");
        displayArrayList(towns1);
        System.out.println("\nSearch for name: " + name);
        System.out.println("The index for " + name + " is " + searchTownByNameArrayList(towns1,name));
    }

    private static void displayArray(Town[] towns) {
        for (int i = 0; i < towns.length; i++) {
            System.out.println(towns[i]);
        }
    }

    private static void displayArrayList(ArrayList<Town> towns1) {
        for (Town t : towns1) {
            System.out.println(t);
        }
    }

    private static int searchTownsByNameArray(Town[] towns, String name){
        String[] names = new String[towns.length];
        for (int i = 0; i < towns.length; i++) {
            names[i] = towns[i].getName();
        }
        return Arrays.binarySearch(names,name);
    }

    private static int searchTownByNameArrayList(ArrayList<Town> towns, String name) {
        ArrayList<String> names = new ArrayList<>();
        for (Town town : towns) {
            names.add(town.getName());
        }
        return Collections.binarySearch(names,name);
    }
}