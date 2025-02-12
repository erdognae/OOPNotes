using StackApp.Contracts;

namespace StackApp.Models;
public class LinkedListStack : IStack
{

    private LinkedList<object> _collection;

    public LinkedListStack()
    {
        _collection = new LinkedList<object>();
    }

    public LinkedListStack(IEnumerable<int> collection) : this()
    {
        foreach (var item in collection)
        {
            push(item);
        }
    }

    public object peek() 
    {
        return _collection.First.Value;
    }

    public object pop()
    {
        var temp = _collection.First.Value;
        _collection.RemoveFirst();
        return temp;


    }

    public void push(object item)
    {
        _collection.AddFirst(item);
    }
}