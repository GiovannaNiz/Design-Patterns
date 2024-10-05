package adapter;
public class SensorUmidade extends Sensor{
	@Override
    public float readValue() {
        return (float) ((float) Math.random() * 100.);
    }
}
