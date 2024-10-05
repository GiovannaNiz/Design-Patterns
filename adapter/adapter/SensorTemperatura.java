package adapter;
public class SensorTemperatura extends Sensor {
    @Override
    public float readValue() {
        return (float) ((Math.random() * 100.) * (Math.random() < 0.5 ? 1. : -1.));
    }

}
