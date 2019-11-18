package uw.cp120.assignments.geo_shape;
import uw.cp120.assignments.d_list.DList;
import uw.cp120.assignments.d_list.DNode;

public class GeoPlane 
{
    private DList allShapes = new DList();
    
    // add new shape to the list
    public void addShape(GeoShape shape) 
    {
        // creates a new blank node from DNode class
        DNode node = new DNode();
        // sets shape data to the new blank node
        node.setData(shape);
        // makes the new node the new tail of allShapes list
        allShapes.addTail(node);
    }
    
    public void redraw() 
    {
        // go through 'allShapes' list and print out each shape
        for(DNode node = allShapes.getHead(); node != allShapes; node = node.getNext())
        {
            // casting node.getData() as type 'GeoShape' and setting to variable 'shape'
            GeoShape shape = (GeoShape)node.getData();
            // drawing shape
            shape.draw(null);
        }
    }
    
    // method to remove each shape from 'allShapes' list
    public boolean removeShape(GeoShape shape)
    {
        // set 'result' variable to false to begin with
        boolean result = false;
        // run 'for' loop through whole 'allShapes' list by using 'size' method from 'DList' class 
        for(int i = 0; i < allShapes.size(); i++)
        {
            // run 'if' statement checking to see if 'shape' is equal to variable: 'this.data'
            if(allShapes.getData().equals(shape))
            {
                result = true; // return true if yes
                allShapes.remove(); // then remove from 'allShapes'
            }
            allShapes.getNext(); // move to next node in list & repeat
        }
        return result; // return true or false depending on above loop
    }
}
