package VehicleRegistry;


import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if(this == comparedObject) {
            return true;
        }

        if(!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        LicensePlate comparedLicense = (LicensePlate) comparedObject;

        if (this.liNumber.equals(comparedLicense.liNumber) &&
            this.country.equals(comparedLicense.country)
           ) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.liNumber);
        hash = 53 * hash + Objects.hashCode(this.country);
        return hash;
    }
}
