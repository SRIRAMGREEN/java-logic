package PracticeCode;

public class LargestAndLowest {
    public static void main(String[] args) {
        int [] num= {12,54,76,45,0,93,84};

        int largest=0;
        int secondLargest =0;

        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                secondLargest=largest;
                largest=num[i];
            }
            if (num[i]<largest && num[i]>secondLargest){
                secondLargest=num[i];
            }
        }
        System.out.println("largest number: "+largest);
        System.out.println("secondlargest number: "+secondLargest);




        int[] val ={77,65,-45,72,-56,84,0,68};
        int lowest = 0;
        int secondLowest = 0;

        for(int i=0;i< val.length;i++){
            if(val[i]<lowest){
                secondLowest=lowest;
                lowest=val[i];
            }
            if(val[i]<lowest && val[i]>secondLowest){
                secondLowest=val[i];
            }
        }
        System.out.println("lowest number: "+ lowest);
        System.out.println("second lowest: "+ secondLowest);
    }

}
