using System.Collections;
using StackApp.Contracts;

namespace StackApp.Models;
public class ListStack : IStack
{
    private List<object> _collection;
    private int _lastindex => _collection.Count-1;

    public ListStack()
    {
        _collection = new List<object>();
    }

    public ListStack(IEnumerable collection) : this()
    {
        foreach (var item in collection)
        {
            push(item);
        }
    }



    public object peek()
    {   
        return _collection[_lastindex ];
    }

    public object pop()
    {
        var temp =  _collection[_lastindex];
        _collection.RemoveAt(_lastindex);
        return temp;
    }

    public void push(object item)
    {
        _collection.Add(item);
    }
}
