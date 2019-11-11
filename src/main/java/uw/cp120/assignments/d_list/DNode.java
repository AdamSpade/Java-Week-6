package uw.cp120.assignments.d_list;
public class DNode
{
     DNode flink;
     DNode blink;
     Object data;
     
    public DNode()
    {
        this(null);
    }
    public DNode (Object data)
    {
        flink = this;
        blink = this;
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
        blink.addAfter(nodeToAdd);
    }
}