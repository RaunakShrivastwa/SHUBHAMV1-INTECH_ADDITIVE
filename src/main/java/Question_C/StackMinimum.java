package Question_C;

import java.util.ArrayList;
import java.util.List;

public class StackMinimum {
    static int top=-1;
    static int min = Integer.MAX_VALUE;
    public static List<Integer> stack= new ArrayList<Integer>();

//    for the Insert Data in Stack
    public static void push(int data){
        top++;
        min = Math.min(min,data);
        stack.add(data);
    }

//    for the Delete Data From the Stack
    public static int pop(){
        int data = -1;
        if(!isEmpty()){
             data = stack.get(top);
            stack.remove(top);
            top--;
        }
        return data;
    }

//    Check Stack Empty or Not
    public static boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else {
            return false;
        }
    }


//    find Minimum from Stack
    public static int getMin(){
        return min;
    }

    public static void main(String[] args) {
        push(5);
        push(2);
        push(11);
        push(9);
        push(3);
        push(11);

        System.out.println(getMin());

    }
}
