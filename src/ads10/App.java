package ads10;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Desktop pc1 = new Desktop(500, 2, 2);
        Desktop pc2 = new Desktop(750, 2, 3);
        Desktop pc3 = new Desktop(1000, 3, 3);
        Notebook pc4 = new Notebook(500, 2, 22);

        System.out.println(pc1.calculateValue());    
        System.out.println(pc4.calculateValue());    

        ArrayList<Computer> pcList = new ArrayList<Computer>();

        pcList.add(pc1);
        pcList.add(pc2);
        pcList.add(pc3);
        pcList.add(pc4);
        
        double total = 0;

        for (Computer c : pcList) {
            System.out.println(c.calculateValue());

            total += c.calculateValue();
        }

        System.out.println("total: " + total);
    }
      
}