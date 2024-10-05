package composite;

public class GreaterThanMonitoring extends SimpleMonitoring {

    public GreaterThanMonitoring(Sensor sensor, float value) {
        super(sensor, value);
    }

    public boolean evaluateCondition() {
        return super.getSensorValue() > super.getValue();
    }
}
