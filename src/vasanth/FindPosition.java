package vasanth;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindPosition {
    public static void main(String[] args) {
        int [] num = {2,4,3,5,2,8,3,6,5};
        int target = 5;
        List<Integer> position = new LinkedList<>();
        //find the position of the target value in the array



        for (int i=0; i<num.length;i++){
            if(num[i]==target){
                position.add(i);
            }
        }
        System.out.println(position);

    }
}
