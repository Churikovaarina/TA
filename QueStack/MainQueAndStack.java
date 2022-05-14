package QueStack;

public class MainQueAndStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Stack: ");
        stack.push(3);
        stack.push(55);
        stack.push(66);
        stack.show();
        stack.pop();
        stack.show();
        stack.clear();
        stack.show();

        Queue<Integer> q = new Queue<Integer>();
        System.out.println("\nQueue: ");
        q.push(3);
        q.push(55);
        q.push(66);
        q.show();
        q.pop();
        q.show();
        q.clear();
        q.show();
    }
}
