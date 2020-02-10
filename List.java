import java.util.*;
class List{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node firstNode = null;
        Node lastNode = null;
        while(true){
            int val = sc.nextInt();
            if(val == 0)break;
            Node newNode = new Node(val);
            if(firstNode == null){
                firstNode = newNode;
                lastNode = newNode; 
            }else{
                newNode.prevNode = lastNode;
                lastNode.nextNode = newNode;
                lastNode = newNode;
            }
        }
        for(Node refNode = firstNode;refNode != null;refNode = refNode.nextNode){
            System.out.println(refNode.val);
        }
    }
}

class Node{
    int val;
    Node prevNode = null;
    Node nextNode = null;
    Node(int val){
        this.val = val;
    }

}