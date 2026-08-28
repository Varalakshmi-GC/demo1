package day8;
import java.util.Stack;
public class stack3 {
	public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);

        int b = stack.pop();
        int a = stack.pop();

        // Subtraction
        stack.push(a - b);

        stack.push(4);

        b = stack.pop();
        System.out.println("result = " + b);

        a = stack.pop();
        System.out.println("result = " + a);

        stack.push(a - b);

        System.out.println("Final result = " + stack.peek());
    }
}