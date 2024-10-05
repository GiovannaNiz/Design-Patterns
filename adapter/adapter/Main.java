package adapter;

public class Main {
	public static void main(String[] args) {
        InformacaoSensor temperatura = new InformacaoTextual(new SensorTemperatura());
        InformacaoSensor umidade = new InformacaoTextual(new SensorUmidade());
        InformacaoSensor luminosidade = new InformacaoTextual(new SensorLuminosidade());

        System.out.println("Temperatura: " + temperatura.getStatus());
        System.out.println("Umidade: " + umidade.getStatus());
        System.out.println("Luminosidade: " + luminosidade.getStatus());
    }
}
