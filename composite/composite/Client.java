package composite;

public class Client {

    public static void main(String[] args) {

        Sensor pressure = new Sensor();
        Sensor temperature = new Sensor();
        Sensor waterLevel = new Sensor();

        GreaterThanMonitoring pressureOver60 = new GreaterThanMonitoring(pressure, 60);
        LessThanMonitoring waterLevelBelow40 = new LessThanMonitoring(waterLevel, 40);
        GreaterThanMonitoring temperatureOver50 = new GreaterThanMonitoring(temperature, 50);
        LessThanMonitoring temperatureBelow10 = new LessThanMonitoring(temperature, 10);

        AndMonitoring pressureAndWaterLevelMonitoring = new AndMonitoring();
        pressureAndWaterLevelMonitoring.addMonitoring(pressureOver60);
        pressureAndWaterLevelMonitoring.addMonitoring(waterLevelBelow40);

        OrMonitoring temperatureRangeMonitoring = new OrMonitoring();
        temperatureRangeMonitoring.addMonitoring(temperatureOver50);
        temperatureRangeMonitoring.addMonitoring(temperatureBelow10);

        OrMonitoring mainMonitoring = new OrMonitoring();
        mainMonitoring.addMonitoring(pressureAndWaterLevelMonitoring);
        mainMonitoring.addMonitoring(temperatureRangeMonitoring);

        pressure.setValue(50);
        waterLevel.setValue(45);
        temperature.setValue(55);

        if(mainMonitoring.evaluateCondition()) {
            System.out.println("Uma falha foi detectada!");
        } else {
            System.out.println("Nenhuma falha foi detectada.");
        }

    }

}
