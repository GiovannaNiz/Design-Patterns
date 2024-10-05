package composite;

public abstract class SimpleMonitoring implements Monitoring{
    private final Sensor sensor; 
    private final float value; 

    public SimpleMonitoring(Sensor sensor, float value) {
        this.sensor = sensor;
        this.value = value;
    }

    public float getValue() {
        return this.value;
    }

    public float getSensorValue() {
        return this.sensor.getValue();
    }
}
