package vasanth;

public class SecondLargest {
    public static void main(String[] args) {
        int [] num = {2,6,4,7};
        int large =0;
        int secLarge = 0;
        for (int n:num){
            if (n>large){
                secLarge = large;
                large=n;
            }
            if (n<large && n>secLarge){
                secLarge=n;

            }
        }
        System.out.println(secLarge);


    }
}
