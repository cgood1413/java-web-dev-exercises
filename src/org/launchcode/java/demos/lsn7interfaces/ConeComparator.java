package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        double difference = o1.getCost() - o2.getCost();
        return difference == 0 ? 0 : difference > 0 ? 1 : -1;
    }

}
