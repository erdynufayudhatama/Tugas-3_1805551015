package id.nufa.aplikasidaftarbelanja;

import java.util.ArrayList;
import java.util.List;

public class DummyBelanjaData {
    public static List<Belanja> groceryList() {
        Belanja telur = new Belanja("telur", 10);
        Belanja sabun = new Belanja("sabun", 2);
        Belanja kopi = new Belanja("kopi", 5);
        Belanja teh = new Belanja("teh", 2);

        List<Belanja> groceryList = new ArrayList<>();

        groceryList.add(telur);
        groceryList.add(sabun);
        groceryList.add(kopi);
        groceryList.add(teh);

        return groceryList;
    }
}
