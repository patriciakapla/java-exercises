package ads05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        Time time1 = new Time();

        time1.setHour(6);
        System.out.println(time1.getHour());

        // LINKED LIST
        LinkedList<String> people = new LinkedList<>();
        people.add("Willow");
        people.add("Buffy");
        people.add("Xander");
        people.add("Cordelia");

        System.out.println(people);
        System.out.println(people.get(0));

        people.remove(1);

        System.out.println(people);

        // ARRAYLIST
        ArrayList<Integer> luckyNumber = new ArrayList<>();
        luckyNumber.add(9);
        luckyNumber.add(3);
        luckyNumber.add(7);
        luckyNumber.add(4);

        System.out.println(luckyNumber);

        // HASHMAP
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Brazil", "Brasília");
        capitals.put("Argentina", "Buenos Aires");
        capitals.put("Peru", "Lima");
        capitals.put("Chile", "Santiago");

        System.out.println(capitals);
        System.out.println(capitals.get("Brazil"));

        // SORT()
        people.add("Buffy");

        System.out.println("original" + people);

        Collections.sort(people);
        System.out.println("sorted" + people);

        Collections.reverse(people);
        System.out.println("reversed" + people);

        Collections.shuffle(people);
        System.out.println("shuffled" + people);

        System.out.println(Collections.min(people)); // gets smallest
        System.out.println(Collections.max(people)); // gets biggest

        // ITERATOR

        ArrayList<Integer> newList = new ArrayList<>();
        // HashSet<Integer> newSet = new HashSet<>();
        // HashMap<String, Integer> newMap = new HashMap<>();

        // int sum;
        // sum = 0;
        // for (int i = 0; i < newList.size(); i++) {
        // sum += list.get(i);
        // }

        int sum;
        sum = 0;
        for (int item : newList) { // FOR EACH! doesnt need the coordinate value (i)
            sum += item;
            System.out.println(sum);
        }

        // WITH AN ITERATOR:
        Iterator<Integer> it = newList.iterator();
        while (it.hasNext()) {
            sum += (int) it.next();
        }

        // LOCALDATE
        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - E");
        System.out.println(today.format(formatter));

    }
}