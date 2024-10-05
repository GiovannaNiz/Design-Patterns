package composite;

public class LessThanMonitoring extends SimpleMonitoring {

    public LessThanMonitoring(Sensor sensor, float value) {
        super(sensor, value);
    }

    public boolean evaluateCondition() {
        return super.getSensorValue() < super.getValue();
    }
}
