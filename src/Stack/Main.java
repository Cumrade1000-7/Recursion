package Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.printMe();
        stack.push(0);
        stack.printMe();
        stack.push(1);
        stack.printMe();
        stack.push(2);
        stack.printMe();
        stack.push(3);
        stack.printMe();
        stack.push(4);
        stack.printMe();
        stack.push(5);
        stack.printMe();
        stack.pop();
        stack.printMe();
        stack.pop();
        stack.printMe();
        System.out.println("Ревёрс!");
        stack.reverse(stack);
        stack.printMe();
        stack.pop();
        stack.printMe();
        stack.pop();
        stack.printMe();
        System.out.println("Ревёрс!");
        stack.reverse(stack);
        stack.printMe();
        stack.pop();
        stack.printMe();
        stack.pop();
        stack.printMe();
    }
}
