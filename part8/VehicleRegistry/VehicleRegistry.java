package VehicleRegistry;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VehicleRegistry {
    private final HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(vehicleRegistry.containsKey(licensePlate)) {
            return false;
        } else {
            vehicleRegistry.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        return vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        return vehicleRegistry.remove(licensePlate) != null;
    }

    public void printLicensePlates() {
     for (Map.Entry<LicensePlate, String> entry : vehicleRegistry.entrySet()) {
         System.out.println(entry.getKey());
     }

    }

     public void printOwners() {
        Set<String> printedOwners = new HashSet<>(); // Set to track already printed owners
        for (String owner : vehicleRegistry.values()) {
            if (!printedOwners.contains(owner)) { // Check if owner has already been printed
                System.out.println(owner); // Print the owner
                printedOwners.add(owner); // Add the owner to the set
            }
        }
    }
}
