package Lab34;
import java.util.Stack;
public class MinStack {
	private int maxSize = 3;
	private Stack<Integer> stack;   
	private Stack<Integer> minstack;
	public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
	//push an element into the stack
    public void push(int ele) {
    // Check if the stack is full
        if (stack.size() == maxSize) {
            System.out.println("Stack is full");
            return;
        }
        stack.push(ele);
        if (minstack.isEmpty() || ele <= minstack.peek()) {
            minstack.push(ele);
        }
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int popped = stack.pop();
        if (popped == minstack.peek()) {
            minstack.pop();
        }
    }
    public int peek() {
        if (isEmpty()) {
        	throw new IllegalStateException("Stack is empty");
        }
        return stack.peek();
    }
    public int getMin() {
        if (minstack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minstack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        //push elements
        minStack.push(4);
        minStack.push(1);
        minStack.push(-2);
        System.out.println("Minimum element in the stack: " + minStack.getMin());
        //pop an element
        minStack.pop();
        System.out.println("Top element in the stack: " + minStack.peek());
        System.out.println("Minimum element in the stack: " + minStack.getMin());
    }
}

/*
Output:

Minimum element in the stack: -2
Top element in the stack: 1
Minimum element in the stack: 1

*/