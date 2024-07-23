package AjithCode;

public class FindLargestNumber {
    public static void main(String[] args) {

        int[] array={3,7,8,4,9};

        int primary = 0;
        int result = 0;

        for (int i=0; i<array.length;i++){
            if(array[i]>primary){
                primary=array[i];
            }
        }
        result=primary*10;
        System.out.println(result);
    }
}
