package composite;

public class EqualsToMonitoring extends SimpleMonitoring {

    public EqualsToMonitoring(Sensor sensor, float value) {
        super(sensor, value);
    }

    public boolean evaluateCondition() {
        return super.getSensorValue() == super.getValue();
    }
}
