package StorageFacility;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


public class StorageFacility {
    private final HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> addedUnit = this.storageUnit.get(unit);
        addedUnit.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnit.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.storageUnit.containsKey(storageUnit)) {
            ArrayList<String> items = this.storageUnit.get(storageUnit);
            items.remove(item);

            if(items.isEmpty()) {
                this.storageUnit.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> nonEmptyUnits = new ArrayList<>();

        for (Map.Entry<String, ArrayList<String>> entry : storageUnit.entrySet()) {
            if(!entry.getValue().isEmpty()) {
                nonEmptyUnits.add(entry.getKey());
            }
        }
        return nonEmptyUnits;
    }
}
