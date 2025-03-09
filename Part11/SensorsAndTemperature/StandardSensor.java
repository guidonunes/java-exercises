package Part11.SensorsAndTemperature;


package application;


public class StandardSensor implements Sensor {
    private int input;

    public StandardSensor(int input) {
        this.input = input;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return input;
    }
}
