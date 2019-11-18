package uw.cp120.assignments.d_list;

public class DList extends DNode
{    
    public void addHead(DNode nodeToAdd)
    {
        addAfter(nodeToAdd);
    }
    
    public void addTail(DNode nodeToAdd)
    {
        addBefore(nodeToAdd);
    }
    
    public DNode getHead()
    {
        return getNext();
    }
    
    public DNode getTail()
    {
        return getPrevious();
    }
    
    /*public boolean isEmpty() 
    {
        
    }*/
    
    public void removeAll()
    {
        
    }
    
    public DNode removeHead()
    {
        DNode head = getNext();
        return head.remove();
    }
    
    public DNode removeTail()
    {
        DNode tail = getPrevious();
        return tail.remove();
    }
    
    public int size()
    {
       int count = 0;
       DNode node = getHead();
       while (node != this)
       {
           ++count;
           node = node.getNext();
       }
       return count;
    }
}