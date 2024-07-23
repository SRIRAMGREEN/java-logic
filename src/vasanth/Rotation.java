package vasanth;

public class Rotation {
    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAO";

        if(isRotation(s1,s2)){
            System.out.println("string rotates");
        }else {
            System.out.println("rotation not found");
        }

    }

    public static  boolean isRotation(String s1, String s2){
        //checking the length of both strings are equal to make rotate proper
        //append the first string and checking the index of 2nd string and
        // which should not equal to -1whether it is present or not

        return (s1.length()==s2.length())&&((s1+s1).indexOf(s2)!=-1);
    }
}
