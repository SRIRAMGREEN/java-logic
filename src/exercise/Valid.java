package exercise;

public class Valid {
    public static void main(String[] args) {
        String v1 = "192.1.6";
        String v2 = "192.1.5";

        StringBuffer buffer = new StringBuffer();

        String s1 = v1.replaceAll("\\.", "");
        System.out.println("first string: "+s1);
        String s2 = v2.replaceAll("\\.", "");
        System.out.println("second string: "+s2);

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        if(num1>num2){
            System.out.println("version updated");
        }else{
            System.out.println("version not updated");
        }

    }
}
