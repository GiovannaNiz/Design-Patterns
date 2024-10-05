package composite;

public class AndMonitoring extends CompoundMonitoring {

    public boolean evaluateCondition() {

        for (Monitoring monitoring : super.getMonitorings()) {
            if(!monitoring.evaluateCondition()) return false;
        }

        return true;
    }
}
