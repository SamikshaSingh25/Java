import java.util.*;
class Node{
    int data;
    int priority;
    Node next;
    Node(int d, int p){
        this.data=d;
        this.priority = p;
        this.next = null;
    } 
    static Node push(Node head,int d, int p){
        Node start = head ; 
        Node temp = new Node(d,p);
        if((head==null) || head.priority>p){
            temp.next = head;
            head = temp;
        }
        else{
            while(start.next!=null && start.next.priority<=p){
                start = start.next;
            }
            temp.next = start.next;
            start.next = temp;
        }

        return head;
    }
    Node pop(Node head){
        head = head.next;
        return head;
    }
    int peek(Node head){
        return head.data;
    }
}

public class LLpriority {
    public static void main(String[] args) {
        Node pq = null;
        // 11->16->14->12->13
        pq = Node.push(pq,12,4); //list,data,position(priority)
        pq = pq.push(pq,11,1); //list,data,position(priority)
        pq = pq.push(pq,14,3); //list,data,position(priority)
        pq = pq.push(pq,16,2); //list,data,position(priority)
        pq = pq.push(pq,13,5); //list,data,position(priority)

        while(pq!=null){
            System.out.println(pq.peek(pq));
            pq=pq.pop(pq);
        }
    }
}
