package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersSquareAndAverage {
    public static void main(String[] args) {
        //1.need to find the value greater than 20. square each number in the list
        //2. need to add all the squared value
        //3.find the average of the total


        List<Integer> numList = Arrays.asList(1,2,5,7);
        List<Integer> newNum = new ArrayList<>();
        int total = 0;
        double avg = 0;
        int count = 0;

        for (int i=0; i<numList.size();i++){
            int number = numList.get(i)*numList.get(i);
            newNum.add(number);
            if (newNum.get(i)>20){
                count=count+1;
                total=total+newNum.get(i);
                avg = total/count;
            }
        }
        System.out.println(avg);

        //in java 8

        double avg1 = numList.stream().map(singleValue -> singleValue*singleValue).filter(singleValue ->singleValue>20)
                .mapToInt(singleValue -> singleValue)
                .average()
                .getAsDouble();
        System.out.println(avg1);


    }
}
