package adapter;

public class InformacaoTextual implements InformacaoSensor {
    private Sensor adaptee;

    public InformacaoTextual(Sensor sensor) {
        adaptee = sensor;
    }
    @Override
    public String getStatus() {
        return Float.toString(adaptee.readValue());
    }

}
