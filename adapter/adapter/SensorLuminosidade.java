package adapter;
public class SensorLuminosidade extends Sensor{
	@Override
    public float readValue() {
        return (float) ((float) Math.random() * 100.);
    }
}
