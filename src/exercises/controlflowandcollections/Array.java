package exercises.controlflowandcollections;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8};
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] spaceSplitText = text.split(" ");
        String[] sentenceSplitText = text.split("\\. ");


        for (int value : values){
            if (!(value % 2 == 0)){
                System.out.println(value);
            }
        }

        System.out.println(Arrays.toString(spaceSplitText));
        System.out.println(Arrays.toString(sentenceSplitText));

    }
}
