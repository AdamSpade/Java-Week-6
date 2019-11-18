package uw.cp120.assignments.d_list;

public class DNode
{
     private DNode flink;
     private DNode blink;
     private Object data;
     
    public DNode (Object data)
    {
        flink = this;
        blink = this;
        this.data = data;
    }
    
    public DNode()
    {
        this(null);
    }    
    
    public Object getData()
    {
        return this.data;
    }
    
    public void setData(Object data)
    {
        this.data = data;
    }
    
    public boolean isEnqueued()
    {
        return this != this.flink;
    }
    
    public void addAfter(DNode nodeToAdd)
    {
        if (nodeToAdd.isEnqueued() )
            throw new IllegalArgumentException();
        nodeToAdd.blink = this;
        nodeToAdd.flink = this.flink;
        this.flink.blink = nodeToAdd;
        flink = nodeToAdd;
    }
    
    public void addBefore(DNode nodeToAdd)
    {
        if (nodeToAdd.isEnqueued() )
            throw new IllegalArgumentException();
        blink.addAfter(nodeToAdd);
    }
    
    public DNode remove()
    {
        if(this.isEnqueued())
            throw new IllegalArgumentException();
        blink.flink = flink;
        flink.blink = blink;
        flink = this;
        blink = this;
            
        return this;
    }
    
    public DNode getNext()
    {
        return flink;
    }

    public DNode getPrevious()
    {
        return blink;
    }
}