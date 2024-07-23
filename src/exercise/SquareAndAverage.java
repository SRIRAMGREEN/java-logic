package exercise;

import java.util.Arrays;
import java.util.List;

public class SquareAndAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,10,20,30,15);

        //1,100,400,900,225(squares   e*e)
        //400 , 900,225 (getting only numbers which are above 100)
        //1525/3 = 508.333 (adding all the selected numbers and finding the average)

        double average = list.stream()
                //first streaming all the integers
                //map by assigning a variable e and multiply by itself to get squares of those integers
                .map(e -> e * e)
                //filter the value which is greater than 100(filter will always result boolean)
                .filter(e -> e > 100)
                //get the filtered values and supply to the same variable e
                .mapToInt(e -> e)
                //now find the average
                .average()
                //getting the average values in double
                .getAsDouble();
        System.out.println(average);
    }
}
