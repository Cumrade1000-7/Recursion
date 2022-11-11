package Stack;

public class Stack {

    Node head;

    public class Node {
        int value;
        Node prev;

        public Node (int value, Node node){
            this.value = value;
            this.prev = node;
        }
    }

    public void push (int value){
        if (isEmpty()){
            head = new Node(value, null);
        } else {
            head = new Node(value, head);
        }
    }

    public Node pop () {
        if (isEmpty()) {
            return null;
        } else {
            head = head.prev;
            return head;
        }
    }

    public void reverse (Stack queue){
        if (queue.isEmpty()){
            return;
        }

        Node temp = head;
        queue.pop();
        reverse(queue);

        insertAtBottom(queue, temp);
    }

    public void insertAtBottom (Stack queue, Node node){
        if (queue.isEmpty()){
            queue.push(node.value);
            return;
        }

        Node temp = head;
        queue.pop();
        insertAtBottom(queue, node);

        queue.push(temp.value);
    }

    public void printMe(){
        if (isEmpty()){
            System.out.print("EMPTY");
        } else {
            Node node = head;
            while (node != null){
                System.out.print(node.value);
                if (node.prev != null){
                    System.out.print(" -> ");
                }
                node = node.prev;
            }
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return head == null;
    }
}
