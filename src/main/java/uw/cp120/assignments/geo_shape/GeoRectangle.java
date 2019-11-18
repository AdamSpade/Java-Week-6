package uw.cp120.assignments.geo_shape;
import java.awt.*;

public class GeoRectangle extends GeoShape
{
    private double width;
    private double height;
    
    public void draw( Graphics2D gtx )
    {
        System.out.println("Drawing rectangle");
    }   
    public double getHeight()
    {
       return height; 
    }
    public double getWidth()
    {
        return width;
    }
    public void setHeight( double height )
    {
        this.height = height;
    }
    public void setWidth( double width )
    {
        this.width = width;
    }
}
