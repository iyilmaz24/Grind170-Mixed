import java.util.Stack;

class MyQueue {
    Stack<Integer> q;
    Stack<Integer> temp;

    public MyQueue() {
        q = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        q.push(x);
    }
    
    public int pop() {
        while(q.size() > 0) {
            temp.push(q.pop());
        }
        int val = temp.pop();

        while(temp.size() > 0) {
            q.push(temp.pop());
        }
        return val;
    }
    
    public int peek() {
        while(q.size() > 0) {
            temp.push(q.pop());
        }
        int val = temp.peek();

        while(temp.size() > 0) {
            q.push(temp.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return q.size() == 0;
    }
}