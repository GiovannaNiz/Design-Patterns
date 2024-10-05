package composite;

public class OrMonitoring extends CompoundMonitoring {

    public boolean evaluateCondition() {

        for (Monitoring monitoring : super.getMonitorings()) {
            if(monitoring.evaluateCondition()) return true;
        }

        return false;
    }
}
