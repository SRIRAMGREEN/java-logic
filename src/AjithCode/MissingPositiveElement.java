package AjithCode;


import java.util.Arrays;

public class MissingPositiveElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 3};
        int firstLetter = 1;
        Arrays.sort(numbers);

        for (int num : numbers) {
            if (num == firstLetter) {
                firstLetter++;
            }else {
                break;
            }
        }
        System.out.println(firstLetter);


    }
}
