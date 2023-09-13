import java.util.ArrayList;
public class Stack<T> 
{
    ArrayList<T> stack;

    public Stack()
    {
        stack = new ArrayList<T>();
    }

    public void push(T top)
    {
        stack.add(top);
    }

    public T pop()
    {
        return stack.remove(stack.size() - 1);
    }

    public T peek()
    {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty()
    {
        if (stack.size() == 0)
        return true;
        else
        return false;
    }
}
