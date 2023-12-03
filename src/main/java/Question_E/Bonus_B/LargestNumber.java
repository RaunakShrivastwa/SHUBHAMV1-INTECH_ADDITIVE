package Question_E.Bonus_B;

public class LargestNumber {

    public static  int findMax(int n){
        String str = ""+n;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            String temp =str.substring(0,i)+ str.substring(i+1);
            max= Math.max(max,Integer.parseInt(temp));
        }
        return max;
    }
    public static void main(String[] args) {
        int N = 19374;
        System.out.println(findMax(N));
    }
}
/*
        1234
        2945
        9273
        3954
        19374

        Answers:

        234
        945
        973
        954
        9374
*/

