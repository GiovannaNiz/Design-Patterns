package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CompoundMonitoring implements Monitoring {

    private List<Monitoring> monitorings = new ArrayList<>();

    public void addMonitoring(Monitoring monitoring) {
        this.monitorings.add(monitoring);
    }

    public List<Monitoring> getMonitorings() {
        return this.monitorings;
    }
}
