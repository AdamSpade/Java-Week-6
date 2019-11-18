package uw.cp120.assignments.geo_shape;
import java.awt.*;
import java.awt.Color;

public abstract class GeoShape 
{
    private GeoPoint origin;
    private Color color;
    
    public abstract void draw( Graphics2D gtx );
    
    public GeoPoint getOrigin() 
    {
        return origin;
    }
    public void setOrigin( GeoPoint origin ) 
            throws NullPointerException
    {
        this.origin = origin;
    }
    public Color getColor()
    {
        return color;
    }
    public void setColor( Color color )
    {
        this.color = color;
    }
}
