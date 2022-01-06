package exercises.controlflowandcollections;

import java.util.ArrayList;

public class ListAvg {

    public static double getAvg(ArrayList<Integer> values){
        double sum = 0;
        for(int num : values){
            sum += num;
        }
        return sum / values.size();
    }
}
