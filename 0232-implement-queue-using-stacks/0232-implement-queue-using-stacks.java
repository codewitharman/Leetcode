import java.util.Stack;

class MyQueue {

    private Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        return removeBottom();
    }

    public int peek() {
        return getBottom();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    private int removeBottom() {
        int top = stack.pop();

        if (stack.isEmpty()) {
            return top;
        }

        int bottom = removeBottom();
        stack.push(top);
        return bottom;
    }

    private int getBottom() {
        int top = stack.pop();

        if (stack.isEmpty()) {
            stack.push(top);
            return top;
        }

        int bottom = getBottom();
        stack.push(top);
        return bottom;
    }
}
