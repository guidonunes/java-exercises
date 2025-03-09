package Part11.SensorsAndTemperature;

package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readingsList;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readingsList = new ArrayList<>();
    }


    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return !sensors.isEmpty();
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {

        if (!sensors.isEmpty()) {
            sensors.get(0).setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or no sensors have been added.");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }

        int average = sum / sensors.size();
        readingsList.add(average);
        return average;
    }


    public List<Integer> readings() {
        return new ArrayList<>(readingsList);
    }
}
