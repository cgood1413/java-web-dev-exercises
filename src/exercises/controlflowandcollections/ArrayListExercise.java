package exercises.controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19));
        double listAvg = ListAvg.getAvg(list);

        System.out.println(listAvg);
    }
}
