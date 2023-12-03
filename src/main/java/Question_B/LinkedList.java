package Question_B;

// Node class For Creating Linked List
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

//for the insert and FindNthFromEnd
public class LinkedList {

    //   for the First Node and Helping In Creation List Respectively
    Node head,helper;
    static int len=0;

    //    Creating Linked List
    public void addNodeInList(int data){
        if(head==null){
            head=new Node(data);
            helper = head;
            len++;
        }else{
            Node node = new Node(data);
            helper.next=node;
            helper=node;
            len++;
        }
    }

    //    Finding Nth Node From End
    public int getNthNodeFromEnd(int x){
        if(len<x){
            return -1;
        }
        int i=1;
        while(i<len-x+1){
            head=head.next;
            i++;
        }
        return head.data;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNodeInList(1);
        list.addNodeInList(2);
        list.addNodeInList(3);
        list.addNodeInList(4);
        list.addNodeInList(5);
        list.addNodeInList(6);

        System.out.println(list.getNthNodeFromEnd(4));


    }
}

